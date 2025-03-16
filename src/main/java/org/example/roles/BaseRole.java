package org.example.roles;

public class BaseRole {
    private String name;
    private String description;
    private Team team;

    public BaseRole(String name, String description, Team team) {
        this.name = name;
        this.description = description;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public String getDescription() {
        return description;
    }
}
