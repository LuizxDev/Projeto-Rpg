package br.com.luizdev.model;

import java.util.ArrayList;

/**
 * Representa um modelo de guerreiro.
 */
public class WarriorModel extends CharacterModel {

    /**
     * Cria uma nova instância de WarriorModel com valores padrão.
     * A vida inicial é 120 e a força é 30.
     */
    public WarriorModel() {
        super(120, "VOCÊ", 30);
        addPowers();
    }
    
    private int basicAttack = 30;
    private int ataqueFrenético = 40;
    private int investida = 45;

    private ArrayList<Integer> powers = new ArrayList<Integer>();

    public void addPowers() {
        powers.add(basicAttack);
        powers.add(ataqueFrenético);
        powers.add(investida);
    }

    public ArrayList<Integer> getPowers() {
        return powers;
    }

}
