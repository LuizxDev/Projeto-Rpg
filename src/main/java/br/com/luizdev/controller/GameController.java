package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;

public class GameController {

    private WarriorModel warriorModel;
    private Random random;

    public GameController() {
        warriorModel = new WarriorModel();
        random = new Random();

    }

    public void exploreForest() {
        int mission = 15;
        int chanceMeeting = random.nextInt(100);
        if (chanceMeeting <= 100) {
            // encontrar o inimigo
        } else if (chanceMeeting == mission) {
            // achou o inimigo
        }

    }

    public boolean isGameOver() {
        return warriorModel.getLife() <= 0;
    }

    public void writeTerminal(String texto) throws InterruptedException {
        for (int index = 0; index < texto.length(); index++) {
            System.out.print(texto.charAt(index));

            Thread.sleep(50); // Atraso de 50 milissegundos entre cada caractere
        }
    }

}
