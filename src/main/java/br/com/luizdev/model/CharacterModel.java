package br.com.luizdev.model;

import lombok.Getter;
import lombok.Setter;

//import java.util.Random;

public class CharacterModel {

    @Getter
    @Setter
    private int life;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int damage;

    /*public int attack(){
        Random random = new Random();
        this.damage = random .nextInt(this.attackDamage);
        return this.damage;
    }*/
}
