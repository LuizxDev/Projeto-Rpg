package br.com.luizdev.view;

import java.util.Scanner;

import br.com.luizdev.controller.GameController;

public class ConsoleView {

    private GameController controller;
    private Scanner scanner;

    public ConsoleView(GameController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);

    }

    public void startGame() throws InterruptedException {

        while (!controller.isGameOver()) {
            this.initialDialog();

            controller.writeTerminal("Escolha sua ação:");
            System.out.println("1- Explorar Floresta");
            System.out.println("2- Abrir Inventario ");
                int choice = scanner.nextInt();

            switch (choice) {
                case 1: //explorar floresta
                        controller.exploreForest();
                    break;
                case 2: //ver status
                    
                    break;
                case 3: //ver inventario

                    return;
                default:
                    break;
            }
        }

    }

    public void initialDialog() throws InterruptedException {
        controller.writeTerminal("[NPC] Seja bem-vindo a Eldoria, bravo guerreiro!");
        System.out.println("");

        controller.writeTerminal(
                "[NPC] Vamos venha comigo, deixe-me contar-lhe sobre os acontecimentos recentes! Uma terrível ameaça surgiu em nosso reino Eldoria, trazendo caos e destruição. Criaturas sombrias emergiram das profundezas, espalhando medo entre nossos habitantes.");
        System.out.println("");

        controller.writeTerminal(
                "[NPC] Mas Que bom que você apareceu. Estou em busca de alguém corajoso e habilidoso como você para uma importante missão. Posso contar com sua ajuda?");
        System.out.println("");

        controller.writeTerminal("[VOCÊ] Claro, estou pronto para o desafio. O que você precisa que eu faça?");
        System.out.println("");

        controller.writeTerminal(
                "[NPC] Excelente! Aqui está a situação: uma antiga relíquia, conhecida como a Pedra da Eternidade, foi roubada do Templo Sagrado. Essa pedra possui um poder imenso e sua falta está causando um desequilíbrio no reino. Precisamos recuperá-la o mais rápido possível.");
        System.out.println("");

        controller.writeTerminal(
                "[VOCÊ]: Entendo a gravidade da situação. Onde posso encontrar a Pedra da Eternidade e quem a roubou?");
        System.out.println("");

        controller.writeTerminal(
                "NPC: Temos informações de que a Pedra foi levada para a Montanha das Sombras, um local perigoso repleto de criaturas malignas. Suspeitamos que um grupo de ladrões liderado por um vilão chamado Malachar seja o responsável pelo roubo. Sua primeira tarefa é adentrar a Montanha das Sombras e encontrar a base dos ladrões.");
        System.out.println("");

        controller.writeTerminal("Jogador: E o que devo fazer quando encontrar a base dos ladrões?");
        System.out.println("");

        controller.writeTerminal(
                "NPC: Ao encontrar a base, você terá que enfrentar os capangas de Malachar e derrotá-los para chegar até ele. Ele é um poderoso feiticeiro e não será uma batalha fácil, mas confiamos em suas habilidades. Uma vez derrotado, recupere a Pedra da Eternidade e traga-a de volta ao Templo Sagrado.");
        System.out.println("");

        controller.writeTerminal(
                "Jogador: Entendido. Estou pronto para enfrentar esses desafios e recuperar a Pedra da Eternidade. Farei o possível para cumprir essa missão.");
        System.out.println("");

        controller.writeTerminal(
                "NPC: Ótimo! Tenho confiança em você. Aqui está um mapa da região da Montanha das Sombras e algumas poções de cura para auxiliá-lo em sua jornada. Boa sorte, aventureiro! Que a luz esteja com você.");
        System.out.println("");

        controller.writeTerminal(
                "Jogador: Agradeço pela confiança e pelo auxílio. Partirei imediatamente em busca da Pedra da Eternidade. Não falharei!");
        System.out.println("");
    }

}
