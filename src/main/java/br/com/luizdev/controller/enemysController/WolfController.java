package br.com.luizdev.controller.enemysController;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;
import br.com.luizdev.model.enemysModel.WolfModel;

public class WolfController {

    private Random random;
    private WolfModel wolfModel;

    public WolfController() {
        wolfModel = new WolfModel();
        random = new Random();
    }

    public void realizarMordidaSombria(WarriorModel warriorModel) {
        warriorModel.setLife(warriorModel.getLife() - wolfModel.getPowers().get(0));
    }

    public void realizarInvestidaDasSombras(WarriorModel warriorModel) {
        warriorModel.setLife(warriorModel.getLife() - wolfModel.getPowers().get(1));
    }

    public void RealizarAtaqueAleatorio(WarriorModel warriorModel) {
        int indiceAttack = random.nextInt(2);
        switch (indiceAttack) {
            case 0:
                System.out.println(
                        "O Lobo avança e desfere uma mordida sombria, combinando sua força com o poder das trevas!");
                realizarMordidaSombria(warriorModel);
                break;
            case 1:
                System.out.println(
                        "O lobo desaparece nas sombras e surge em uma investida poderosa, atingindo você com força!");
                realizarInvestidaDasSombras(warriorModel);
                break;
            default:
                break;
        }
    }

    public void showStatus(WolfModel wolfModel) {
        System.out.println("\n");
        System.out.println("----- Status do Lobo -----");
        System.out.println("Nome: " + wolfModel.getName());
        System.out.println("Vida: " + wolfModel.getLife());
        System.out.println("--------------------------------");
        System.out.println("\n");
    }
}
