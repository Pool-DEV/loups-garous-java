package org.example.roles;

public class Cupid extends BaseRole {
    public static final BaseRole CUPID = new Cupid();

    public Cupid() {
        super("Cupidon", "Son objectif est d'éliminer tous les Loups-Garous. Dès le début de la partie, il doit former un couple de deux joueurs. Leur objectif sera de survivre ensemble, car si l'un d'eux meurt, l'autre se suicidera.", Team.VILLAGER);
    }
}
