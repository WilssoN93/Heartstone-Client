package com.mycompany.heartstoneclient;

import com.mycompany.heartstoneclient.entitys.Expansions;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;

public class HttpConnect {

    private HttpResponse<Expansions> response;
    

    public HttpConnect() {
        try {
            init();
            response = Unirest.get("https://omgvamp-hearthstone-v1.p.rapidapi.com/cards")
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
    
    public Expansions javaObject(){
    
        return response.getBody();
        
    }

}
