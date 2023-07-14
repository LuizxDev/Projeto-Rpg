package br.com.luizdev.controller.enemysController;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;

public class AranhaController extends AranhaModel {

    private Random random;

    public AranhaController() {
        random = new Random();
    }

    public void attackTeiaPegajosa(WarriorModel warriorModel) {
        int damage = getPowers().get(0);
        warriorModel.setLife(warriorModel.getLife() - damage);
    }

    public void attackVenenoso(WarriorModel warriorModel) {
        warriorModel.setLife(warriorModel.getLife() - this.getPowers().get(1));
    }

    public void randomAttack(WarriorModel warriorModel) {
        int indiceAttack = random.nextInt(2);
        switch (indiceAttack) {
            case 0:

                System.out.printf(
                        "A %s apareceu repentinamente e lançou sua teia pegajosa em você! Sua vida diminuiu após o ataque.\n",
                        this.getName());
                this.attackTeiaPegajosa(warriorModel);

                break;
            case 1:

                System.out.printf(
                        "A %s soltou um ataque venenoso em você! Sua vida diminuiu após o veneno se espalhar pelo seu corpo.\n",
                        this.getName());
                this.attackVenenoso(warriorModel);

                break;
            default:
                break;
        }
    }

}
