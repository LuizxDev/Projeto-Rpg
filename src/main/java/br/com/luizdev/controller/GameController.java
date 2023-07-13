package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.controller.enemysController.AranhaController;
import br.com.luizdev.controller.enemysController.WolfController;
import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;
import br.com.luizdev.model.enemysModel.WolfModel;

public class GameController {

    private WarriorController warriorController;
    private WarriorModel warriorModel;
    private Random random;
    private WolfController wolfController;
    private WolfModel wolfModel;
    private AranhaModel aranhaModel;
    private AranhaController aranhaController;

    public GameController() {

        warriorController = new WarriorController();
        aranhaController = new AranhaController();
        aranhaModel = new AranhaModel();
        warriorModel = new WarriorModel();
        wolfController = new WolfController();
        wolfModel = new WolfModel();
        random = new Random();

    }

    public void exploreMontain(){

        int mission = 70;
        int chanceMission = random.nextInt(100);
        int chanceMeetingEnemy = random.nextInt(100); //100%

        if (chanceMeetingEnemy <= 50) { //50% de chance de encontrar inimigo
            encounterEnemy();
        } else if(chanceMission == mission){
            System.out.println("Você encontrou o covil do inimigo! Prepare-se para uma batalha desafiadora e enfrente os capangas do vilão para chegar até ele.");
            startMission();
        }else {
            System.out.println("Você explorou a área, mas não encontrou nenhum inimigo. A Montanha das Sombraa está quieta por enquanto.");
            return;
        }
    }

    public void encounterEnemy(){ //encontra um inimigo aleatorio entre aranha e lobo
        int enemyRandom = random.nextInt(2);

        switch (enemyRandom) {
            case 0: //lobo
            System.out.printf("Um %s feroz surgiu diante de você! Esteja pronto para enfrentar esse lobo das sombras!\n", wolfModel.getName());

            wolfController.attack(warriorModel);
            warriorController.showStatus();   
                break;
            case 1: //aranha
                System.out.printf("Uma %s gigante apareceu diante de você! Esteja preparado para enfrentar essa ameaça aracnídea!\n", aranhaModel.getName());

                aranhaController.randomAttack(warriorModel);
                warriorController.showStatus();
                break;
            default:
            System.out.println("Opção Inválida. Tente Novamente.");
                break;
        }
    }

    public boolean isGameOver() {
        return warriorModel.getLife() <= 0;
    }

    public void startMission(){
        //a fazer
    }


}
