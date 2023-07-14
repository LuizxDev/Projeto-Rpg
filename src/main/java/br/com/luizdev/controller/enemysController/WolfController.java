package br.com.luizdev.controller.enemysController;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.WolfModel;

public class WolfController extends WolfModel {

    private Random random;


    public WolfController(){
        random = new Random();
    }

    public int calcularDanoMordidaSombria(){ //força do lobo + valor aleatorio entre 0 e 10
        int damage = this.getStrength() + random.nextInt(10);
        return damage;
    }

    //dano fixo = 25
    public void realizarInvestidaDasSombras(WarriorModel warriorModel){
        warriorModel.setLife(warriorModel.getLife() - getPowers().get(1)); 
        System.out.printf("Sua Vida %d", warriorModel.getLife());
    }
    
    public void attack (WarriorModel warriorModel){
        int indiceAttack = random.nextInt(2);
         switch (indiceAttack) {
            case 1:        
            System.out.println("O lobo avança e desfere uma mordida sombria, combinando sua força com o poder das trevas!");

            int damage = calcularDanoMordidaSombria();
            warriorModel.setLife(warriorModel.getLife() - damage);
                break;
            case 2:       
            System.out.println("O lobo desaparece nas sombras e surge em uma investida poderosa, atingindo você com força!");
 
            realizarInvestidaDasSombras(warriorModel);
                break;
            default:
                break;
         }
    }

}
