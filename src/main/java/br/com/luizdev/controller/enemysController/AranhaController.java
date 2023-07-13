package br.com.luizdev.controller.enemysController;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;

public class AranhaController extends AranhaModel{

    AranhaModel aranhaModel;
    
    public AranhaController(){
        aranhaModel = new AranhaModel();
    }

    public void attackTeiaPegajosa (WarriorModel warriorModel){
        warriorModel.setLife(warriorModel.getLife() + - getPowers().get(0));
    }

    public void attackVenenoso (WarriorModel warriorModel){
        warriorModel.setLife(warriorModel.getLife() + - getPowers().get(1));
    }
    
}
