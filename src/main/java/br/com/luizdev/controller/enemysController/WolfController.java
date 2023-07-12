package br.com.luizdev.controller.enemysController;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.WolfModel;

public class WolfController extends WolfModel {

    private Random random;


    public WolfController(){
        random = new Random();
    }

    public void mordidaSombria(){ //força do lobo + valor aleatorio entre 0 e 10
        this.setDamage(random.nextInt(10));
    }

    //dano fixo = 25
    public void investidaDasSombras(WarriorModel warriorModel){
        warriorModel.setLife(warriorModel.getLife() - getPowers().get(1));
    }
    
}
