package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.controller.enemysController.AranhaController;
import br.com.luizdev.controller.enemysController.WolfController;
import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;
import br.com.luizdev.model.enemysModel.WolfModel;
import br.com.luizdev.view.ConsoleView;

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

    public void exploreMountain(WarriorModel warriorModel) throws InterruptedException{

        final int CHANCE_ENEMY = 50;
        final int CHANCE_PORTION = 15;
        final int MISSION_CHANCE = 70;

        int chance = random.nextInt(100);
        int chanceMeetingEnemy = random.nextInt(100); //100%

        if (chanceMeetingEnemy <= CHANCE_ENEMY) { //50% de chance de encontrar inimigo
            encounterEnemy(warriorModel);

        } else if(chance == MISSION_CHANCE){ //70% de achar o inimigo principal
            ConsoleView.writeTerminal("Você encontrou o covil do inimigo! Prepare-se para uma batalha desafiadora e enfrente os capangas do vilão para chegar até ele.");
            startMission();
        }else if(chance == CHANCE_PORTION){
            encounterPosion();
        }else{
            ConsoleView.writeTerminal("Você explorou a área, mas não encontrou nenhum inimigo. A Montanha das Sombraa está quieta por enquanto.");
            return;
        }
    }

    public void encounterEnemy(WarriorModel warriorModel) throws InterruptedException{ //encontra um inimigo aleatorio entre aranha e lobo
        int enemyRandom = random.nextInt(2);

        switch (enemyRandom) {
            case 0: //lobo
            ConsoleView.writeTerminal("Um "+wolfModel.getName()+" feroz surgiu diante de você! Esteja pronto para enfrentar esse lobo das sombras!\n");
            wolfController.attack(warriorModel);
            warriorController.showStatus(warriorModel);   
                break;
            case 1: //aranha
            ConsoleView.writeTerminal("Uma " + aranhaModel.getName() +" gigante apareceu diante de você! Esteja preparado para enfrentar essa ameaça aracnídea!\n");           
                aranhaController.executeRandomAttack(warriorModel);
                warriorController.showStatus(warriorModel);
                break;
            default:
            System.out.println("Opção Inválida. Tente Novamente.");
                break;
        }
    }

    public void encounterPosion(){
        warriorModel.setPortion(1);
    }

    public boolean isGameOver() {
        return warriorModel.getLife() <= 0;
    }

    public void startMission(){
        
    }

    public void inventory(){
        System.out.println("------ Inventario -------");
        System.out.println("|Porção|------------ |" + warriorModel.getPortion() + "un|");
            System.out.println("--------------------------------");
    }

    public void showStatusWarrior(WarriorModel warriorModel){
        warriorController.showStatus(warriorModel);
    }


}
