package br.com.luizdev.controller.enemysController;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.WolfModel;

public class WolfController extends WolfModel {

    private Random random;


    public WolfController(){
        random = new Random();
    }

    public int mordidaSombria(){ //força do lobo + valor aleatorio entre 0 e 10
        int damage = this.getStrength() + random.nextInt(10);
        return damage;
    }

    //dano fixo = 25
    public void investidaDasSombras(WarriorModel warriorModel){
        warriorModel.setLife(warriorModel.getLife() - getPowers().get(1)); 
        System.out.printf("Sua Vida %d", warriorModel.getLife());
    }
    
    public void attack (WarriorModel warriorModel){
        int indiceAttack = random.nextInt(2);
         switch (indiceAttack) {
            case 1:        
            int damage = this.mordidaSombria();
            warriorModel.setLife(warriorModel.getLife() - damage);
                break;
            case 2:        
            investidaDasSombras(warriorModel);
                break;
            default:
                break;
         }
    }

}
