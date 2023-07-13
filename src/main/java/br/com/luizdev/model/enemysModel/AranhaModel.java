package br.com.luizdev.model.enemysModel;

import java.util.ArrayList;

import br.com.luizdev.model.CharacterModel;

public class AranhaModel extends CharacterModel {

    public AranhaModel(){
        this.setName("Aranha Venenosa");
        this.setLife(60);
        this.setDamage(25);
        addPowers();
    }

    private int teiaPegajosa = 10; //valor fixo de 10
    private int ataqueVenenoso = 20; //valor fixo

    ArrayList<Integer> powers = new ArrayList<Integer>();

    public void addPowers(){
        powers.add(teiaPegajosa);
        powers.add(ataqueVenenoso);
    }

    public ArrayList<Integer> getPowers(){
        return powers;
    }
}
