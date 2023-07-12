package br.com.luizdev.model.enemys;

import java.util.ArrayList;

import br.com.luizdev.model.CharacterModel;

public class WolfModel extends CharacterModel {
    
    public WolfModel(){
        this.setName("Lobo das Sombras");
        this.setLife(80);
        this.setDamage(40);
        addPowers();
    }

    private int mordidaSombria; //força do lobo + valor aleatorio entre 0 e 10
    private int investidaDasSombras = 25; //valor fixo de 25

    ArrayList<Integer> powers = new ArrayList<Integer>();

    public void addPowers(){
        powers.add(mordidaSombria);
        powers.add(investidaDasSombras);
    }

    public ArrayList<Integer> getPowers(){
        return powers;
    }

    

}
