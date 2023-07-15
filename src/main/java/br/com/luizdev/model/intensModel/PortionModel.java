package br.com.luizdev.model.intensModel;

import lombok.Data;
/**
 * Representa um Modelo de Porção
 */
@Data
public class PortionModel {

    
    private int portion = 2;

    /**
     * Define a quantidade de poções disponíveis para o guerreiro.
     * O valor máximo é 10.
     * 
     * @param portion é A quantidade de porções que sera somada
     * @return A quantidade de porçoes
     */
    public int setPortion(int portion){
        final int MAX_POISON = 10;

        if(this.portion > MAX_POISON){
            this.portion = MAX_POISON;
        }else{
            this.portion += portion;
        }
        return this.portion;
    }
}
