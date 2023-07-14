package br.com.luizdev.model.enemysModel;

import java.util.ArrayList;

import br.com.luizdev.model.CharacterModel;
/**
 * Representa o Modelo de um Lobo das Sombras
 */
public class WolfModel extends CharacterModel {

    /**
     * Cria uma nova instancia de WolfModel com valores padroes
     * life 80, nome Lobo das Sombras, strentgh 40.
     */
    public WolfModel(){
        super(80, "Lobo das Sombras" , 40);
        addPowers();
    }

    private int mordidaSombria = 20; //força do lobo + valor aleatorio entre 0 e 10
    private final int INVESTIDA_DAS_SOMBRAS = 25; //valor fixo de 25

    
    ArrayList<Integer> powers = new ArrayList<Integer>();

    /**
     * Adiciona os poderes do Lobo Das Sombras na 
     * ArrayList powers
     */
    public void addPowers(){
        powers.add(mordidaSombria);
        powers.add(INVESTIDA_DAS_SOMBRAS);
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
