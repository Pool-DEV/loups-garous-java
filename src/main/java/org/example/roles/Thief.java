package org.example.roles;

public class Thief extends Role {
    public Thief() {
        super("Voleur", "Son objectif n'est pas fixe : il peut choisir son rôle parmi les deux cartes qui n'ont pas encore été distribuées.", Team.NEUTRAL);
    }

    public static Thief create() {
        return new Thief();
    }
}
