package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.controller.enemysController.AranhaController;
import br.com.luizdev.model.enemysModel.AranhaModel;

import br.com.luizdev.controller.enemysController.WolfController;
import br.com.luizdev.model.enemysModel.WolfModel;

import br.com.luizdev.model.WarriorModel;

import br.com.luizdev.model.intensModel.PortionModel;

import br.com.luizdev.view.ConsoleView;

public class GameController {

    private WarriorController warriorController;
    private WarriorModel warriorModel;

    private Random random;

    private WolfController wolfController;

    private AranhaController aranhaController;

    private PortionModel portionModel;

    public GameController() {

        portionModel = new PortionModel();

        warriorModel = new WarriorModel();
        warriorController = new WarriorController();

        aranhaController = new AranhaController();
        
        wolfController = new WolfController();
       

        random = new Random();

    }

    public void exploreMountain(WarriorModel warriorModel, WolfModel wolfModel, AranhaModel aranhaModel) throws InterruptedException{

        final int CHANCE_PORTION = 30;
        final int CHANCE_ENEMY = 70;
        final int MISSION_CHANCE = 15;


        int chance = random.nextInt(100); // 100%

        switch (chance) {
            case MISSION_CHANCE:
                ConsoleView.writeTerminal("Você encontrou o covil do inimigo! Prepare-se para uma batalha desafiadora e enfrente os capangas do vilão para chegar até ele.");
                break;
            default:
                if (chance <= CHANCE_ENEMY) {
                    encounterEnemy(warriorModel, wolfModel , aranhaModel);
                } else if(chance <= CHANCE_PORTION){
                    encounterPosion();
                    return;
                }else{
                    ConsoleView.writeTerminal("Você explorou a área, mas não encontrou nenhum inimigo. A Montanha das Sombras está quieta por enquanto.");
                    return;
                }
        }
    }

    public void encounterEnemy(WarriorModel warriorModel, WolfModel wolfModel, AranhaModel aranhaModel) throws InterruptedException{ //encontra um inimigo aleatorio entre aranha e lobo
        int enemyRandom = random.nextInt(2);

        switch (enemyRandom) {
            case 0: //lobo
            //ConsoleView.writeTerminal("Um "+ wolfModel.getName() +" feroz surgiu diante de você! Esteja pronto para enfrentar esse lobo das sombras!\n");
            wolfController.RealizarAtaqueAleatorio(warriorModel);
            warriorController.showStatus(warriorModel); 
            warriorController.executeAttack(wolfModel, aranhaModel, enemyRandom);  
                break;
            case 1: //aranha
            //ConsoleView.writeTerminal("Uma " + aranhaModel.getName() +" gigante apareceu diante de você! Esteja preparado para enfrentar essa ameaça aracnídea!\n");           
                aranhaController.executeRandomAttack(warriorModel);
                warriorController.showStatus(warriorModel);
                warriorController.executeAttack(wolfModel, aranhaModel, enemyRandom);
                break;
            default:
            System.out.println("Opção Inválida. Tente Novamente.");
                break;
        }
    }

    public void encounterPosion() throws InterruptedException{
        ConsoleView.writeTerminal(" Você encontrou uma poção! Em meio a trevas e perigos, a sorte sorri para você.");
        portionModel.setPortion(1);
    }

    public boolean isGameOver() {
        return warriorModel.getLife() <= 0;
    }

    public void startMission(){
        
    }

    public void inventory(){
        System.out.println("------ Inventario -------");
        System.out.println("|Porção|------------ |" + portionModel.getPortion() + "un|");
            System.out.println("--------------------------------");
    }

    public void showStatusWarrior(WarriorModel warriorModel){
        warriorController.showStatus(warriorModel);
    }


}
