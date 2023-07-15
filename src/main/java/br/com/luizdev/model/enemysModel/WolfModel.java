package br.com.luizdev.model.enemysModel;

import java.util.ArrayList;
import java.util.Random;

import br.com.luizdev.model.CharacterModel;
/**
 * Representa o Modelo de um Lobo das Sombras
 */
public class WolfModel extends CharacterModel {

    Random random = new Random(life);

    /**
     * Cria uma nova instancia de WolfModel com valores padroes
     * life 80, nome Lobo das Sombras, strentgh 40.
     */
    public WolfModel(){
        super(80, "Lobo das Sombras" , 40);
        addPowers();
    }

    private int mordidaSombria = 20 + random.nextInt(10);
    private final int INVESTIDA_DAS_SOMBRAS = 25; //valor fixo de 25

    
    private ArrayList<Integer> powers = new ArrayList<Integer>();

    /**
     * Adiciona os poderes do Lobo Das Sombras na 
     * ArrayList powers
     */
    public void addPowers(){
        powers.add(mordidaSombria); //1
        powers.add(INVESTIDA_DAS_SOMBRAS); //2
    }
    /**
     * Obtem os poderes do Lobo das Sombras
     * 
     * @return Uma lista com os poderes da aranha venenosa.
     */
    
    public ArrayList<Integer> getPowers(){
        return powers;
    }

    

}
