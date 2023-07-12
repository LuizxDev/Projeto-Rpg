package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;

public class WarriorController extends WarriorModel{

    private WarriorModel warriorModel;
    private Random random;

    public WarriorController(){
        warriorModel = new WarriorModel();
        random = new Random();
    }
    
    public int basicAttack() {
        int powerIndice = random.nextInt(warriorModel.getPowers().get(0));
        int damage = powerIndice + warriorModel.getStrength();
        return damage;
    }
    

}
