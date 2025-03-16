package org.example.roles;

public class Team {
    private final String name;
    private final String description;

    public static final Team WEREWOLF = new Team("Loups-Garous", "Chaque nuit, ils éliminent un villageois.");
    public static final Team VILLAGER = new Team("Villageois", "Le jour, ils débattent pour trouver les loups-garous.");
    public static final Team NEUTRAL = new Team("Neutre", "Ils ont leur propre objectif.");

    public Team(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
