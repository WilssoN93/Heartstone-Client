package com.mycompany.heartstoneclient;

import com.mashape.unirest.http.exceptions.UnirestException;

public class CardLibary {

    public static void main(String[] args) throws UnirestException {

        HttpConnect o = new HttpConnect();
        
//        for (Card card : o.javaObject().getallCards()) {
//            if (card.getFlavor() != null) {
//                System.out.println("");
//                System.out.println(card.getFlavor());
//            }
//        }
        System.out.println(o.javaObject().getallCards().size());
        o.javaObject().removeDublicates();
//        for (Card card : o.javaObject().getallCards()) {
//            if (card.getFlavor() != null) {
//                
//                System.out.println("");
//                System.out.println(card.getFlavor());
//            }
//
//        }
        
        System.out.println(o.javaObject().getallCards().size());
    }

}
