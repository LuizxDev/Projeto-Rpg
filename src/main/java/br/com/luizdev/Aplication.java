package br.com.luizdev;

import br.com.luizdev.controller.GameController;
import br.com.luizdev.controller.enemysController.WolfController;
import br.com.luizdev.view.ConsoleView;

public class Aplication {
    public static void main(String[] args) throws InterruptedException {

        WolfController wolfController = new WolfController();
        GameController gameController = new GameController();
        ConsoleView consoleView = new ConsoleView(gameController);
        consoleView.startGame();
    }
}
