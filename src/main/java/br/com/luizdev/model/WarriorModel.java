package br.com.luizdev.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

public class WarriorModel extends CharacterModel {

    public WarriorModel() {
        super(120, "VOCÊ", 30);
        addPowers();
    }


    @Getter
    private int portion = 2;

    public int setPortion(int portion){

        final int MAX_POISON = 10;

        if(this.portion > 10){
            this.portion = MAX_POISON;
        }else{
            this.portion = portion;
        }
        return this.portion;
    }

    @Getter
    @Setter
    private int strength = 70;

    private int basicAttack = 30;
    private int ataqueFrenético = 40;
    private int golpeDeEscudo = 35;
    private int investida = 45;

    private ArrayList<Integer> powers = new ArrayList<Integer>();

    public void addPowers() {

        powers.add(basicAttack);
        powers.add(ataqueFrenético);
        powers.add(golpeDeEscudo);
        powers.add(investida);

    }

    public ArrayList<Integer> getPowers() {
        return powers;
    }

}
