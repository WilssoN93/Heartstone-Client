package com.mycompany.heartstoneclient;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Expansions {
    
    private List <Card> allCards;

    @JsonProperty("Basic")
    List<Card> basic;
    @JsonProperty("Classic")
    List<Card> classic;
    @JsonProperty("Promo")
    List<Card> promo;
    @JsonProperty("Hall of Fame")
    List<Card> halloffame;
    @JsonProperty("Naxxramas")
    List<Card> naxxramas;
    @JsonProperty("Goblins vs Gnomes")
    List<Card> goblinVsGnomes;
    @JsonProperty("Blackrock Mountain")
    List<Card> blackRockMountain;
    @JsonProperty("The Grand Tournament")
    List<Card> theGrandTournament;
    @JsonProperty("The League of Explorers")
    List<Card> theLeagueOfExplorers;
    @JsonProperty("Whispers of the Old Gods")
    List<Card> whispersOfTheOldGod;
    @JsonProperty("One Night in Karazhan")
    List<Card> oneNightInKarazhan;
    @JsonProperty("Mean Streets of Gadgetzan")
    List<Card> meanStreetsOfGadgetzan;
    @JsonProperty("Journey to Un'Goro")
    List<Card> journeyToUngoro;
    @JsonProperty("Knights of the Frozen Throne")
    List<Card> knightsOfTheFrozenThrone;
    @JsonProperty("Kobolds & Catacombs")
    List<Card> koboldsandCatacombs;
    @JsonProperty("The Witchwood")
    List<Card> theWitchwood;
    @JsonProperty("The Boomsday Project")
    List<Card> theBoomsdayProject;
    @JsonProperty("Rastakhan's Rumble")
    List<Card> rastakhansRumble;
    @JsonProperty("Tavern Brawl")
    List<Card> tavernBrawl;
    @JsonProperty("Taverns of Time")
    List<Card> tavernsOfTime;
    @JsonProperty("Hero Skins")
    List<Card> heroSkins;
    @JsonProperty("Missions")
    List<Card> missions;
    @JsonProperty("Credits")
    List<Card> credits;
    @JsonProperty("System")
    List<Card> system;
    @JsonProperty("Debug")
    List<Card> debug;

    public List<Card> getallCards(){
    allCards = new ArrayList();
    allCards.addAll(basic);
    allCards.addAll(classic);
    allCards.addAll(promo);
    allCards.addAll(halloffame);
    allCards.addAll(naxxramas);
    allCards.addAll(goblinVsGnomes);
    allCards.addAll(blackRockMountain);
    allCards.addAll(theGrandTournament);
    allCards.addAll(theLeagueOfExplorers);
    allCards.addAll(whispersOfTheOldGod);
    allCards.addAll(oneNightInKarazhan);
    allCards.addAll(meanStreetsOfGadgetzan);
    allCards.addAll(journeyToUngoro);
    allCards.addAll(knightsOfTheFrozenThrone);
    allCards.addAll(koboldsandCatacombs);
    allCards.addAll(theWitchwood);
    allCards.addAll(theBoomsdayProject);
    allCards.addAll(rastakhansRumble);
    allCards.addAll(tavernBrawl);
    allCards.addAll(tavernsOfTime);
    allCards.addAll(heroSkins);
    allCards.addAll(missions);
    allCards.addAll(credits);
    allCards.addAll(debug);
    
    return allCards;
    }
    
    public void removeDublicates(){
    
        for (int i = 0; i < allCards.size(); i++) {
            for (int j = 0; j < allCards.size(); j++) {
               if(allCards.get(i).getCardId().equals(allCards.get(j).getCardId()))
                allCards.remove(j);
            }
            
        }
    
    }
    
}
