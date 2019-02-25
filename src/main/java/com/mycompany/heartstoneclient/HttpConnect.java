package com.mycompany.heartstoneclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import java.util.List;

public class HttpConnect {

    HttpResponse<Expansions> cardResponse;
    HttpResponse<Standard> response;
    

    public HttpConnect() {
        try {
            init();
            cardResponse = Unirest.get("https://omgvamp-hearthstone-v1.p.rapidapi.com/cards")
                    .header("X-RapidAPI-Key", "45474e64e1msha4b981763fe047cp1e6056jsn58b4dbc3f38f").asObject(Expansions.class);
        } catch (UnirestException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public final void init() throws UnirestException {

        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();

            @Override
            public <T> T readValue(String value, Class<T> valueType) {

                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

            @Override

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException();

                }
            }

        });
    }

    public List<String> getClassList() throws UnirestException {

        return response.getBody().getClasses();

    }

    public String getPatch() throws UnirestException {

        return response.getBody().getPatch();

    }

    public List<String> getFactions() {

        return response.getBody().getFactions();
    }

    public List<String> getSets() {

        return response.getBody().getSets();
    }

    public List<String> getLocales() {

        return response.getBody().getLocales();
    }

    public List<String> getQualities() {

        return response.getBody().getQualities();
    }

    public List<String> getRaces() {

        return response.getBody().getRaces();
    }

    public List<String> getTypes() {

        return response.getBody().getTypes();
    }

    public List<String> getWild() {

        return response.getBody().getWild();
    }

    public List<String> getStandard() {

        return response.getBody().getStandard();
    }
    
    public Expansions javaObject(){
    
        return cardResponse.getBody();
        
    }

}
