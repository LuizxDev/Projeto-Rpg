package br.com.luizdev.controller.enemysController;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;
import br.com.luizdev.view.ConsoleView;

public class AranhaController {

    private Random random;
    private AranhaModel aranhaModel;

    public AranhaController() {
        aranhaModel = new AranhaModel();
        random = new Random();
    }

    public void attackTeiaPegajosa(WarriorModel warriorModel) {
        int damage = aranhaModel.getPowers().get(0);
        warriorModel.setLife(warriorModel.getLife() - damage);
    }

    public void attackVenenoso(WarriorModel warriorModel) {
        warriorModel.setLife(warriorModel.getLife() - aranhaModel.getPowers().get(1));
    }

    public void executeRandomAttack(WarriorModel warriorModel) throws InterruptedException {
        int indiceAttack = random.nextInt(2);
        switch (indiceAttack) {
            case 0:
                ConsoleView.writeTerminal("A " + aranhaModel.getName()
                        + " apareceu repentinamente e lançou sua teia pegajosa em você! Sua vida diminuiu após o ataque.\n");
                this.attackTeiaPegajosa(warriorModel);
                break;
            case 1:
                ConsoleView.writeTerminal("A " + aranhaModel.getName()
                        + " soltou um ataque venenoso em você! Sua vida diminuiu após o veneno se espalhar pelo seu corpo.\n");
                this.attackVenenoso(warriorModel);

                break;
            default:
                break;
        }
    }

    public void showStatus(AranhaModel aranhaModel) {
        System.out.println("\n");
        System.out.println("----- Status da Aranha -----");
        System.out.println("Nome: " + aranhaModel.getName());
        System.out.println("Vida: " + aranhaModel.getLife());
        System.out.println("--------------------------------");
        System.out.println("\n");
    }
}
