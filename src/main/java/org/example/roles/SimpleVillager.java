package org.example.roles;

public class SimpleVillager extends BaseRole {
    public static final BaseRole SIMPLEVILLAGER = new SimpleVillager();

    public SimpleVillager() {
        super("Villageois", "Son objectif est d'éliminer tous les Loups-Garous. Il ne dispose d'aucun pouvoir particulier : uniquement sa perspicacité et sa force de persuasion.", Team.VILLAGER);
    }
}