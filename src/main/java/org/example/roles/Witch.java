package org.example.roles;

public class Witch extends BaseRole {
    public static final BaseRole WITCH = new Witch();

    public Witch() {
        super("Sorcière", "Son objectif est d'éliminer tous les Loups-Garous. Elle dispose de deux potions : une potion de vie pour sauver la victime des Loups, et une potion de mort pour assassiner quelqu'un.", Team.VILLAGER);
    }
}
