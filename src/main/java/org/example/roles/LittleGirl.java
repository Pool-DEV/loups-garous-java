package org.example.roles;

public class LittleGirl extends BaseRole {
    public static final BaseRole LITTLEGIRL = new LittleGirl();

    public LittleGirl() {
        super("Petite Fille", "Son objectif est d'éliminer tous les Loups-Garous. Chaque nuit, elle peut espionner les Loups-Garous.", Team.VILLAGER);
    }
}
