
package com.mycompany.heartstoneclient.entitys;

import com.mycompany.heartstoneclient.HttpConnect;
import java.util.ArrayList;
import java.util.List;


public class Handler {
    private List<Card> allCards = new ArrayList<>();
    private HttpConnect httpGetter;
    

    public Handler (){
    httpGetter = new HttpConnect();
    httpGetter.javaObject().setCardList();
    allCards = httpGetter.javaObject().getAllCards();
    
    }
    
    public HttpConnect getHttpGetter() {
        return httpGetter;
    }

    public void setHttpGetter(HttpConnect httpGetter) {
        this.httpGetter = httpGetter;
    }

    public List<Card> getAllCards() {
        return allCards;
    }

    public void setAllCards(List<Card> allCards) {
        this.allCards = allCards;
    }
}
