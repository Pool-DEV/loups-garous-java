package org.example;

import org.example.game.Player;
import org.example.manager.GameManager;
import org.example.roles.Role;
import org.example.roles.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameManager manager = new GameManager();

        // add players to the game
        manager.addPlayer(new Player("yang"));
        manager.addPlayer(new Player("arabe"));
        manager.addPlayer((new Player("bombe")));
        manager.addPlayer(new Player("juliette"));
        manager.addPlayer(new Player("Casseau"));
        manager.addPlayer(new Player("alisa"));
        manager.addPlayer(new Player("xavier blanc"));
        manager.addPlayer(new Player("laurent"));
        manager.addPlayer(new Player("bonichon big boss"));
        manager.addPlayer(new Player("lionel le sorcier"));
        manager.addPlayer(new Player("tanasa le voleur de copie"));
        manager.addPlayer(new Player("gabriel prince de ocaml"));

        // start the game
        manager.startGame();

        // end the game
        manager.endGame();
    }
}