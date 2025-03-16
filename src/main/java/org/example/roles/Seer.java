package org.example.roles;

public class Seer extends BaseRole {
    public static final BaseRole SEER = new Seer();

    public Seer() {
        super("Voyante", "Son objectif est d'éliminer tous les Loups-Garous. Chaque nuit, elle peut espionner un joueur et découvrir sa véritable identité.", Team.VILLAGER);
    }
}
