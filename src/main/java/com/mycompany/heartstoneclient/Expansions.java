package com.mycompany.heartstoneclient;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Expansions {

    @JsonProperty("Basic")
    List<Card> basic;
    List<Card> classic;
    List<Card> promo;
    List<Card> halloffame;
    List<Card> Naxxramas;

}
