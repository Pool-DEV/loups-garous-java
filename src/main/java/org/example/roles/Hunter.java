package org.example.roles;

public class Hunter extends BaseRole {
    public static final BaseRole HUNTER = new Hunter();

    public Hunter() {
        super("Chasseur", "Son objectif est d'éliminer tous les Loups-Garous. À sa mort, il doit éliminer un joueur en utilisant sa dernière balle.", Team.VILLAGER);
    }
}
