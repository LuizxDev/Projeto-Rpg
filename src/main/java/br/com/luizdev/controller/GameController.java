package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.controller.enemysController.WolfController;
import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.WolfModel;

public class GameController {

    private WarriorModel warriorModel;
    private Random random;
    private WolfController wolfController;
    private WolfModel wolfModel;

    public GameController() {
        warriorModel = new WarriorModel();
        wolfController = new WolfController();
        wolfModel = new WolfModel();
        random = new Random();

    }

    public void exploreForest() {
        int mission = 15;
        int chanceMeeting = random.nextInt(50);
        if (chanceMeeting <= 50) {
            // encontrar o inimigo
            System.out.println(wolfModel.getName() + " Apareceu");
            wolfController.attack(warriorModel);
            System.out.println("Sua Vida: " + warriorModel.getLife());
            
            
        } else if (chanceMeeting == mission) { //se o numero aleatorio for 15, vai pra missão
            // achou o inimigo
        }else {
            return;
        }

    }

    public boolean isGameOver() {
        return warriorModel.getLife() <= 0;
    }

    public void writeTerminal(String texto) throws InterruptedException {
        for (int index = 0; index < texto.length(); index++) {
            System.out.print(texto.charAt(index));

            Thread.sleep(5); // Atraso de 50 milissegundos entre cada caractere
        }
    }

}
