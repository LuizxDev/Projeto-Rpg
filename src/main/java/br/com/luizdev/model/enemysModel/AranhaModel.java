package br.com.luizdev.model.enemysModel;

import java.util.ArrayList;

import br.com.luizdev.model.CharacterModel;

/**
 * Representa o modelo de uma Aranha Venenosa
 */
public class AranhaModel extends CharacterModel {

    /**
     * Cria uma nova instancia da AranhaModel com valores padrão
     * Life 60, name: Aranha Venenosa, strength 25.
     */
    public AranhaModel() {
        super(60, "Aranha Venenosa", 25);
        addPowers();
    }

    private static final int TEIA_PEGAJOSA_DAMAGE = 10; // Valor fixo de 10
    private static final int ATAQUE_VENENOSO_DAMAGE = 20; // Valor fixo de 20

    /**
     * Cria uma ArrayLIst para armazenar os poderes da Aranha Venenosa
     */
    private ArrayList<Integer> powers = new ArrayList<Integer>();

    /**
     * Adiciona os poderes da Aranha Venenosa na
     * ArrayList powers
     */
    public void addPowers() {
        powers.add(TEIA_PEGAJOSA_DAMAGE);
        powers.add(ATAQUE_VENENOSO_DAMAGE);
    }

    /**
     * Obtém os poderes da aranha venenosa.
     *
     * @return Uma lista com os poderes da aranha venenosa.
     */
    public ArrayList<Integer> getPowers() {
        return powers;
    }
}
