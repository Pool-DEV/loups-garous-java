package org.example;

import org.example.manager.RoleManager;
import org.example.roles.BaseRole;
import org.example.roles.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BaseRole> roles = new ArrayList<>(List.of(Cupid.CUPID, Hunter.HUNTER, LittleGirl.LITTLEGIRL, Seer.SEER, SimpleVillager.SIMPLEVILLAGER, Thief.THIEF, Werewolf.WEREWOLF, Witch.WITCH));

        RoleManager roleManager = new RoleManager(roles);

        BaseRole role = roleManager.assignRoles();

        System.out.println("Vous avez obtenu le rôle de " + role.getName() + " ! :)\n" + role.getDescription());
    }
}