package br.com.luizdev.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CharacterModel {

    
    private int life;
    private String name;
    private int strength;

    /*
     * public int attack(){
     * Random random = new Random();
     * this.damage = random .nextInt(this.attackDamage);
     * return this.damage;
     * }
     */
}
