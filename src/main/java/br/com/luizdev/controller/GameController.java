package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.controller.enemysController.AranhaController;
import br.com.luizdev.controller.enemysController.WolfController;
import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;
import br.com.luizdev.model.enemysModel.WolfModel;

public class GameController {

    private WarriorModel warriorModel;
    private Random random;
    private WolfController wolfController;
    private WolfModel wolfModel;
    private AranhaModel aranhaModel;
    private AranhaController aranhaController;

    public GameController() {
        aranhaController = new AranhaController();
        aranhaModel = new AranhaModel();
        warriorModel = new WarriorModel();
        wolfController = new WolfController();
        wolfModel = new WolfModel();
        random = new Random();

    }

    public void findEnemy(WarriorModel warriorModel) throws InterruptedException {

        int mission = 70;
        int chanceMeeting = random.nextInt(50); 

        if (chanceMeeting <= 50) {  //chance de encontrar o inimigo
            this.randomEnemy(warriorModel);
        } else if (chanceMeeting == mission) {  // se o numero aleatorio for 15, 

        } else {
            return;
        }

    }

    public void randomEnemy(WarriorModel warriorModel){ //gera um inimigo aleatorio
        int enemyRandom = random.nextInt(2);
        switch (enemyRandom) {
            case 0: //lobo
                System.out.printf("%s Apareceu \n", wolfModel.getName());
                wolfController.attack(warriorModel);
                System.out.printf("Sua Vida: %d", warriorModel.getLife()); //mudar para o view
                break;
            case 1: //aranha
                System.out.printf("%s Apareceu \n", aranhaModel.getName());
                aranhaController.randomAttack(warriorModel);
                System.out.printf("Sua Vida %d", warriorModel.getLife()); //mudar para o view
                break;
            default:
                System.out.println("Opçao Invalida, Tente Novamente.");
                break;
        }
    }

    public boolean isGameOver() {
        return warriorModel.getLife() <= 0;
    }


}
