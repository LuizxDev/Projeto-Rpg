package br.com.luizdev.model.intensModel;

import lombok.Data;

@Data
public class PortionModel {

    private int portion = 2;

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
