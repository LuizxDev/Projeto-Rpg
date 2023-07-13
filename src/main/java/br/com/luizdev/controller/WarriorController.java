package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;

public class WarriorController extends WarriorModel {

    private Random random;

    public WarriorController() {
        random = new Random();
    }

    public int basicAttack() {
        int powerIndice = random.nextInt(this.getPowers().get(0));
        int damage = powerIndice + this.getStrength();
        return damage;
    }

}
