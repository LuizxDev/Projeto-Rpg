package br.com.luizdev.controller.enemysController;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;

public class AranhaController extends AranhaModel{

    private Random random;

    public AranhaController(){
        random = new Random();
    }

    public void attackTeiaPegajosa (WarriorModel warriorModel){
        warriorModel.setLife(warriorModel.getLife() + - this.getPowers().get(0));
    }

    public void attackVenenoso (WarriorModel warriorModel){
        warriorModel.setLife(warriorModel.getLife() + - this.getPowers().get(1));
    }
    
    public void randomAttack(WarriorModel warriorModel){
        int indiceAttack = random.nextInt(1);
        switch (indiceAttack) {
            case 0:
                    this.attackTeiaPegajosa(warriorModel);
                break;
            case 1:
                    this.attackVenenoso(warriorModel);
                break;
            default:
                break;
        }
    }
    
}
