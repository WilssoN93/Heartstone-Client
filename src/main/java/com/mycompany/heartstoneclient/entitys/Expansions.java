package com.mycompany.heartstoneclient.entitys;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Expansions {
    
    public Expansions(){
    
    }

    private List<Card> allCards;

    @JsonProperty("Basic")
    private List<Card> basic;
    @JsonProperty("Classic")
    private List<Card> classic;
    @JsonProperty("Promo")
    private List<Card> promo;
    @JsonProperty("Hall of Fame")
    private List<Card> halloffame;
    @JsonProperty("Naxxramas")
    private List<Card> naxxramas;
    @JsonProperty("Goblins vs Gnomes")
    private List<Card> goblinVsGnomes;
    @JsonProperty("Blackrock Mountain")
    private List<Card> blackRockMountain;
    @JsonProperty("The Grand Tournament")
    private List<Card> theGrandTournament;
    @JsonProperty("The League of Explorers")
    private List<Card> theLeagueOfExplorers;
    @JsonProperty("Whispers of the Old Gods")
    private List<Card> whispersOfTheOldGod;
    @JsonProperty("One Night in Karazhan")
    private List<Card> oneNightInKarazhan;
    @JsonProperty("Mean Streets of Gadgetzan")
    private List<Card> meanStreetsOfGadgetzan;
    @JsonProperty("Journey to Un'Goro")
    private List<Card> journeyToUngoro;
    @JsonProperty("Knights of the Frozen Throne")
    private List<Card> knightsOfTheFrozenThrone;
    @JsonProperty("Kobolds & Catacombs")
    private List<Card> koboldsandCatacombs;
    @JsonProperty("The Witchwood")
    private List<Card> theWitchwood;
    @JsonProperty("The Boomsday Project")
    private List<Card> theBoomsdayProject;
    @JsonProperty("Rastakhan's Rumble")
    private List<Card> rastakhansRumble;
    @JsonProperty("Tavern Brawl")
    private List<Card> tavernBrawl;
    @JsonProperty("Taverns of Time")
    private List<Card> tavernsOfTime;
    @JsonProperty("Hero Skins")
    private List<Card> heroSkins;
    @JsonProperty("Missions")
    private List<Card> missions;
    @JsonProperty("Credits")
    private List<Card> credits;
    @JsonProperty("System")
    private List<Card> system;
    @JsonProperty("Debug")
    private List<Card> debug;

    public final void setCardList() {
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

        removeDublicates();
    }

    public void removeDublicates() {

        for (int i = 0; i < allCards.size(); i++) {
            for (int j = 0; j < allCards.size(); j++) {
                if (allCards.get(i).getCardId().equals(allCards.get(j).getCardId())) {
                    allCards.remove(j);
                }
            }

        }

    }

    public void isDuplicate() {

        for (int i = 0; i < allCards.size(); i++) {
            for (int j = 0; j < allCards.size(); j++) {
                if (allCards.get(i).getCardId().equals(allCards.get(j).getCardId())) {
                    System.out.println(allCards.get(j));
                    System.out.println(allCards.get(i));
                }
            }

        }

    }

    public List<Card> getAllCards() {
        return allCards;
    }

    public void setAllCards(List<Card> allCards) {
        this.allCards = allCards;
    }

    public List<Card> getBasic() {
        return basic;
    }

    public void setBasic(List<Card> basic) {
        this.basic = basic;
    }

    public List<Card> getClassic() {
        return classic;
    }

    public void setClassic(List<Card> classic) {
        this.classic = classic;
    }

    public List<Card> getPromo() {
        return promo;
    }

    public void setPromo(List<Card> promo) {
        this.promo = promo;
    }

    public List<Card> getHalloffame() {
        return halloffame;
    }

    public void setHalloffame(List<Card> halloffame) {
        this.halloffame = halloffame;
    }

    public List<Card> getNaxxramas() {
        return naxxramas;
    }

    public void setNaxxramas(List<Card> naxxramas) {
        this.naxxramas = naxxramas;
    }

    public List<Card> getGoblinVsGnomes() {
        return goblinVsGnomes;
    }

    public void setGoblinVsGnomes(List<Card> goblinVsGnomes) {
        this.goblinVsGnomes = goblinVsGnomes;
    }

    public List<Card> getBlackRockMountain() {
        return blackRockMountain;
    }

    public void setBlackRockMountain(List<Card> blackRockMountain) {
        this.blackRockMountain = blackRockMountain;
    }

    public List<Card> getTheGrandTournament() {
        return theGrandTournament;
    }

    public void setTheGrandTournament(List<Card> theGrandTournament) {
        this.theGrandTournament = theGrandTournament;
    }

    public List<Card> getTheLeagueOfExplorers() {
        return theLeagueOfExplorers;
    }

    public void setTheLeagueOfExplorers(List<Card> theLeagueOfExplorers) {
        this.theLeagueOfExplorers = theLeagueOfExplorers;
    }

    public List<Card> getWhispersOfTheOldGod() {
        return whispersOfTheOldGod;
    }

    public void setWhispersOfTheOldGod(List<Card> whispersOfTheOldGod) {
        this.whispersOfTheOldGod = whispersOfTheOldGod;
    }

    public List<Card> getOneNightInKarazhan() {
        return oneNightInKarazhan;
    }

    public void setOneNightInKarazhan(List<Card> oneNightInKarazhan) {
        this.oneNightInKarazhan = oneNightInKarazhan;
    }

    public List<Card> getMeanStreetsOfGadgetzan() {
        return meanStreetsOfGadgetzan;
    }

    public void setMeanStreetsOfGadgetzan(List<Card> meanStreetsOfGadgetzan) {
        this.meanStreetsOfGadgetzan = meanStreetsOfGadgetzan;
    }

    public List<Card> getJourneyToUngoro() {
        return journeyToUngoro;
    }

    public void setJourneyToUngoro(List<Card> journeyToUngoro) {
        this.journeyToUngoro = journeyToUngoro;
    }

    public List<Card> getKnightsOfTheFrozenThrone() {
        return knightsOfTheFrozenThrone;
    }

    public void setKnightsOfTheFrozenThrone(List<Card> knightsOfTheFrozenThrone) {
        this.knightsOfTheFrozenThrone = knightsOfTheFrozenThrone;
    }

    public List<Card> getKoboldsandCatacombs() {
        return koboldsandCatacombs;
    }

    public void setKoboldsandCatacombs(List<Card> koboldsandCatacombs) {
        this.koboldsandCatacombs = koboldsandCatacombs;
    }

    public List<Card> getTheWitchwood() {
        return theWitchwood;
    }

    public void setTheWitchwood(List<Card> theWitchwood) {
        this.theWitchwood = theWitchwood;
    }

    public List<Card> getTheBoomsdayProject() {
        return theBoomsdayProject;
    }

    public void setTheBoomsdayProject(List<Card> theBoomsdayProject) {
        this.theBoomsdayProject = theBoomsdayProject;
    }

    public List<Card> getRastakhansRumble() {
        return rastakhansRumble;
    }

    public void setRastakhansRumble(List<Card> rastakhansRumble) {
        this.rastakhansRumble = rastakhansRumble;
    }

    public List<Card> getTavernBrawl() {
        return tavernBrawl;
    }

    public void setTavernBrawl(List<Card> tavernBrawl) {
        this.tavernBrawl = tavernBrawl;
    }

    public List<Card> getTavernsOfTime() {
        return tavernsOfTime;
    }

    public void setTavernsOfTime(List<Card> tavernsOfTime) {
        this.tavernsOfTime = tavernsOfTime;
    }

    public List<Card> getHeroSkins() {
        return heroSkins;
    }

    public void setHeroSkins(List<Card> heroSkins) {
        this.heroSkins = heroSkins;
    }

    public List<Card> getMissions() {
        return missions;
    }

    public void setMissions(List<Card> missions) {
        this.missions = missions;
    }

    public List<Card> getCredits() {
        return credits;
    }

    public void setCredits(List<Card> credits) {
        this.credits = credits;
    }

    public List<Card> getSystem() {
        return system;
    }

    public void setSystem(List<Card> system) {
        this.system = system;
    }

    public List<Card> getDebug() {
        return debug;
    }

    public void setDebug(List<Card> debug) {
        this.debug = debug;
    }

}
