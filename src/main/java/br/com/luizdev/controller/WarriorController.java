package br.com.luizdev.controller;

import java.util.Random;

import br.com.luizdev.model.WarriorModel;

public class WarriorController extends WarriorModel {

    private Random random;

    public WarriorController() {
        random = new Random();
    }

    public int basicAttack() {
        int powerIndice = random.nextInt(this.getPowers().get(0));
        int damage = powerIndice + this.getStrength();
        return damage;
    }
    
        public void showStatus() {
            System.out.println("----- Status do Guerreiro -----");
            System.out.println("Nome: " + this.getName());
            System.out.println("Vida: " + this.getLife());
            System.out.println("Força: " + this.getStrength());
            System.out.println("Pontos de Energia: " + this.getEnergyPoints());
            // Exibir mais atributos se necessário
            System.out.println("--------------------------------");
        }
    
        // Restante do código
    
    }
    
