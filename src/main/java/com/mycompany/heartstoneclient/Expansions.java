package com.mycompany.heartstoneclient;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Expansions {

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
    @JsonProperty("Goblin vs Gnomes")
    List<Card> goblinVsGnomes;
    List<Card> blackRockMountain;
    List<Card> theGrandTournament;
    List<Card> theLeagueOfExplorers;
    List<Card> whispersOfTheOldGod;
    List<Card> oneNightInKarazhan;
    List<Card> meanStreetsOfGadgetzan;
    List<Card> journeyToUngoro;
    List<Card> knightsOfTheFrozenThrone;
    List<Card> koboldsandCatacombs;
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

}
