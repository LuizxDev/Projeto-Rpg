package br.com.luizdev.view;

import java.util.Scanner;

import br.com.luizdev.controller.GameController;
import br.com.luizdev.model.WarriorModel;

public class ConsoleView {

        private GameController controller;
        private Scanner scanner;
        private WarriorModel warriorModel;

        public ConsoleView(GameController controller) {
                warriorModel = new WarriorModel();
                this.controller = controller;
                scanner = new Scanner(System.in);

        }

        public void startGame() throws InterruptedException {

                do {
                        //this.initialDialog();

                        this.writeTerminal("Escolha sua ação:");
                        System.out.println("");
                        System.out.println("|1|- Explorar Floresta");
                        System.out.println("|2|- Ver Status");
                        System.out.println("|3|- Abrir Inventario ");
                        System.out.println("--------------------------------");
                        int choice = scanner.nextInt();

                        switch (choice) {
                                case 1: // explorar floresta
                                        controller.exploreMontain(warriorModel);
                                        break;
                                case 2: // ver status

                                        break;
                                case 3: // ver inventario
                                controller.inventory();
                                        return;
                                default:
                                        break;
                        }
                } while (!controller.isGameOver());

        }

        public void writeTerminal(String texto) throws InterruptedException {
                System.out.println("--------------------------------");
                for (int index = 0; index < texto.length(); index++) {
                        System.out.print(texto.charAt(index));
                        Thread.sleep(5); // Atraso de 50 milissegundos entre cada caractere
                }
        }

        public void initialDialog() throws InterruptedException {
                this.writeTerminal("[NPC] Seja bem-vindo a Eldoria, bravo guerreiro!");
                System.out.println("");

                this.writeTerminal(
                                "[NPC] Vamos venha comigo, deixe-me contar-lhe sobre os acontecimentos recentes! Uma terrível ameaça surgiu em nosso reino Eldoria, trazendo caos e destruição. Criaturas sombrias emergiram das profundezas, espalhando medo entre nossos habitantes.");
                System.out.println("");

                this.writeTerminal(
                                "[NPC] Mas Que bom que você apareceu. Estou em busca de alguém corajoso e habilidoso como você para uma importante missão. Posso contar com sua ajuda?");
                System.out.println("");

                this.writeTerminal("[VOCÊ] Claro, estou pronto para o desafio. O que você precisa que eu faça?");
                System.out.println("");

                this.writeTerminal(
                                "[NPC] Excelente! Aqui está a situação: uma antiga relíquia, conhecida como a Pedra da Eternidade, foi roubada do Templo Sagrado. Essa pedra possui um poder imenso e sua falta está causando um desequilíbrio no reino. Precisamos recuperá-la o mais rápido possível.");
                System.out.println("");

                this.writeTerminal(
                                "[VOCÊ]: Entendo a gravidade da situação. Onde posso encontrar a Pedra da Eternidade e quem a roubou?");
                System.out.println("");

                this.writeTerminal(
                                "[NPC]: Temos informações de que a Pedra foi levada para a Montanha das Sombras, um local perigoso repleto de criaturas malignas. Suspeitamos que um grupo de ladrões liderado por um vilão chamado Malachar seja o responsável pelo roubo. Sua primeira tarefa é adentrar a Montanha das Sombras e encontrar a base dos ladrões.");
                System.out.println("");

                this.writeTerminal("Jogador: E o que devo fazer quando encontrar a base dos ladrões?");
                System.out.println("");

                this.writeTerminal(
                                "[NPC]: Ao encontrar a base, você terá que enfrentar os capangas de Malachar e derrotá-los para chegar até ele. Ele é um poderoso feiticeiro e não será uma batalha fácil, mas confiamos em suas habilidades. Uma vez derrotado, recupere a Pedra da Eternidade e traga-a de volta ao Templo Sagrado.");
                System.out.println("");

                this.writeTerminal(
                                "[VOCÊ]: Entendido. Estou pronto para enfrentar esses desafios e recuperar a Pedra da Eternidade. Farei o possível para cumprir essa missão.");
                System.out.println("");

                this.writeTerminal(
                                "[NPC]: Ótimo! Tenho confiança em você. Aqui está um mapa da região da Montanha das Sombras e algumas poções de cura para auxiliá-lo em sua jornada. Boa sorte, aventureiro! Que a luz esteja com você.");
                System.out.println("");

                this.writeTerminal(
                                "[VOCÊ]: Agradeço pela confiança e pelo auxílio. Partirei imediatamente em busca da Pedra da Eternidade. Não falharei!");
                System.out.println("");
        }

        public static void main(String[] args) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
}
