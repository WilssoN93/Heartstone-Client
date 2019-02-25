package com.mycompany.heartstoneclient;

import com.mashape.unirest.http.exceptions.UnirestException;

public class CardLibary {

    public static void main(String[] args) throws UnirestException {

        HttpConnect o = new HttpConnect();
        o.javaObject().setCardList();
        System.out.println(o.javaObject().getAllCards().size());
        o.javaObject().removeDublicates();
        System.out.println(o.javaObject().getAllCards().size());
    }

}
