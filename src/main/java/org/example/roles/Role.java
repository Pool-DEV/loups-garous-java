package org.example.roles;

public class Role {
    private final String name;
    private final String description;
    private final Team team;

    public Role(String name, String description, Team team) {
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
