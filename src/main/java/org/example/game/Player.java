package org.example.game;

import org.example.roles.Role;

public class Player {
    private final String name;
    private Role role;
    private int votes;
    private boolean isAlive;
    private boolean isSheriff;
    private boolean isInLove;

    public Player(String name) {
        this.name = name;
        this.role = null;
        this.votes = 0;
        this.isAlive = true;
        this.isSheriff = false;
        this.isInLove = false;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isSheriff() {
        return isSheriff;
    }

    public void setSheriff(boolean sheriff) {
        isSheriff = sheriff;
    }

    public boolean isInLove() {
        return isInLove;
    }

    public void setInLove(boolean inLove) {
        isInLove = inLove;
    }
}
