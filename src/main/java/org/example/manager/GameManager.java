package org.example.manager;

import org.example.game.Phase;
import org.example.game.Player;
import org.example.roles.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GameManager {
    private List<Player> players;
    private List<Role> roles;
    private Phase phase;

    private static final int MIN_PLAYERS = 6;
    private static final int MAX_PLAYERS = 16;

    public GameManager() {
        this.players = new ArrayList<>();
        this.roles = new ArrayList<>();
        this.phase = Phase.SETUP;
    }

    public void addPlayer(Player player) {
        if (this.players.size() == MAX_PLAYERS) {
            throw new IllegalStateException("Le nombre maximum de joueurs est atteint.");
        }

        this.players.add(player);
    }

    public void addRole(Role role) {
        if (this.roles.size() == MAX_PLAYERS) {
            throw new IllegalStateException("Le nombre maximum de rôles est atteint.");
        }

        this.roles.add(role);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    public void removeRole(Role role) {
        this.roles.remove(role);
    }

    private void generateBalancedRoles() {
        int playerCount = this.players.size();

        if (playerCount < MIN_PLAYERS) {
            throw new IllegalStateException("Il faut au moins " + MIN_PLAYERS + " joueurs pour commencer la partie.");
        }

        this.roles.clear();

        // Définition des rôles uniques (ajoutés une seule fois si le nombre de joueurs le permet)
        List<Role> uniqueRoles = new ArrayList<>(List.of(
                new Cupid(), new Hunter(), new LittleGirl(), new Seer(), new Thief(), new Witch()
        ));

        // Définition des Loups-Garous (≈ 1 loup pour 3-4 joueurs)
        int nbWerewolves = Math.max(1, playerCount / 4);

        for (int i = 0; i < nbWerewolves; i++) {
            this.roles.add(new Werewolf());
        }

        Collections.shuffle(uniqueRoles);

        // Ajout des rôles uniques si le nombre de joueurs le permet
        for (Role role : uniqueRoles) {
            if (this.roles.size() < playerCount) {
                this.roles.add(role);
            }
        }

        // Complément avec des Villageois
        while (this.roles.size() < playerCount) {
            this.roles.add(new SimpleVillager());
        }

        // Mélanger la liste des rôles
        Collections.shuffle(this.roles);
    }

    private void assignRoles() {
        if (this.players.size() != this.roles.size()) {
            throw new IllegalStateException("Le nombre de rôles et de joueurs doit être identique.");
        }

        if (this.phase != Phase.SETUP) {
            throw new IllegalStateException("La partie a déjà commencé.");
        }

        Collections.shuffle(this.roles);

        for (Player player : this.players) {
            Role role = this.roles.remove(0);
            player.setRole(role);
            System.out.println(player.getName() + " a obtenu le rôle de " + role.getName());
        }
    }

    public void startGame() {
        if (this.roles.isEmpty()) {
            this.generateBalancedRoles();
        }

        this.assignRoles();
        this.phase = this.phase.start();
        System.out.println("La partie vient de commencer !");
    }

    public void nextPhase() {
        this.phase = this.phase.next();
    }

    public void endGame() {
        this.phase = this.phase.end();
        System.out.println("La partie est terminée !");
    }

    public void isGameOver() {
        int nbVillagers = 0;
        int nbWolves = 0;

        for (Player player : this.players) {
            if ((player.getRole().getTeam() == Team.VILLAGER || player.getRole().getTeam() == Team.NEUTRAL) && player.isAlive()) {
                nbVillagers++;
            } else if (player.getRole().getTeam() == Team.WEREWOLF && player.isAlive()) {
                nbWolves++;
            }
        }

        if (nbVillagers == 0) {
            System.out.println("Les Loups-Garous ont gagné !");
            this.endGame();
        } else if (nbWolves == 0) {
            System.out.println("Les Villageois ont gagné !");
            this.endGame();
        } else {
            System.out.println("La partie continue...");
        }
    }
}
