package org.example.manager;

import org.example.roles.*;

import java.util.List;
import java.util.Random;

public class RoleManager {
    private List<BaseRole> roles;

    public RoleManager(List<BaseRole> roles) {
        this.roles = roles;
    }

    public BaseRole assignRoles() {
        if (this.roles.isEmpty()) {
            throw new IllegalStateException("Il n'y a plus de rôles à attribuer.");
        }

        Random rand = new Random();
        int index = rand.nextInt(this.roles.size());

        return this.roles.remove(index);
    }
}