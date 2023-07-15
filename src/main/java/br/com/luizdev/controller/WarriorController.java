package br.com.luizdev.controller;

import java.util.Scanner;

import br.com.luizdev.model.WarriorModel;
import br.com.luizdev.model.enemysModel.AranhaModel;
import br.com.luizdev.model.enemysModel.WolfModel;

public class WarriorController {

    private Scanner scanner;
    private WarriorModel warriorModel;

    public WarriorController() {
        warriorModel = new WarriorModel();
        scanner = new Scanner(System.in);
    }

    public void executeAttack(WolfModel wolfModel,AranhaModel aranhaModel, int index){
        choiceAttack();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                executeBasicAttack(wolfModel, aranhaModel, index);
                break;
            case 2:
                executeAtaqueFrenético(wolfModel, aranhaModel, index);
                break;
            case 3:
                executeInvestida(wolfModel, aranhaModel, index);
                break;
            default:
                break;
        }
        
    }

    public void executeBasicAttack(WolfModel wolfModel,AranhaModel aranhaModel, int index) {
        switch (index) {
            case 0:
                wolfModel.setLife(wolfModel.getLife() - warriorModel.getPowers().get(0));
                break;
            case 1:
                aranhaModel.setLife(aranhaModel.getLife() - warriorModel.getPowers().get(0));
                break;
            default:
                break;
        }
    }

    public void executeAtaqueFrenético(WolfModel wolfModel,AranhaModel aranhaModel, int index) {
       if (index == 0) { 
            wolfModel.setLife(wolfModel.getLife() - warriorModel.getPowers().get(1));
       } else {
            aranhaModel.setLife(aranhaModel.getLife() - warriorModel.getPowers().get(1));
       }
    }

    public void executeInvestida(WolfModel wolfModel,AranhaModel aranhaModel, int index) {
       if (index == 0) { 
            wolfModel.setLife(wolfModel.getLife() - warriorModel.getPowers().get(1));
       } else {
            aranhaModel.setLife(aranhaModel.getLife() - warriorModel.getPowers().get(1));
       }
    }


    
        public void showStatus(WarriorModel warriorModel) {
            System.out.println("\n");
            System.out.println("----- Status do Guerreiro -----");
            System.out.println("Nome: " + warriorModel.getName());
            System.out.println("Vida: " + warriorModel.getLife());
            System.out.println("--------------------------------");
            System.out.println("\n");
        }

        public void choiceAttack(){
            System.out.println("\n");
            System.out.println("----- Escolha seu Ataque --------");
            System.out.println("1- Basic Attack - Dano: ");
            System.out.println("1- Ataque Frenetico - Dano: ");
            System.out.println("1- Investida - Dano: ");
            System.out.println("--------------------------------");
            System.out.println("\n");
        }
    }
    
