import models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Boolean programRunning = true;
        System.out.println("Welcome to retro Tic Tac Toe game.");
        Game game = new Game();
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (Integer key : game.getBoard().keySet()) {
                System.out.print(game.getBoard().get(key));
            }
            try {
                System.out.println(game.getPlayer() +"'s turn. Please enter the number corresponding to the space that you would like to play.");
                String userInput = bufferedReader.readLine();
                Boolean invalidInput = true;
                while(invalidInput) {
                    if (game.checkInput(userInput)) {
                        invalidInput = false;
                    } else {
                        System.out.println("Invalid input. Please try again");
                        userInput = bufferedReader.readLine();
                    }
                }

                game.playerTurn(userInput);
                game.switchPlayer();
                if(game.checkWin() != ' ') {
                    for (Integer key : game.getBoard().keySet()) {
                        System.out.print(game.getBoard().get(key));
                    }
                    System.out.println(game.checkWin() + " wins!");
                    System.out.println("Play again? - y/n");
                    String userContinue = bufferedReader.readLine();
                    if (userContinue.equals("y")) {
                        game = new Game();
                    } else {
                        programRunning = false;
                    }
                }
                if (game.checkDraw()) {
                    for (Integer key : game.getBoard().keySet()) {
                        System.out.print(game.getBoard().get(key));
                    }
                    System.out.println("Draw game. Would you like to play again? y/n");
                    String userContinue = bufferedReader.readLine();
                    if (userContinue.equals("y")) {
                        game = new Game();
                    } else {
                        programRunning = false;
                    }
                } else {
                    game.setTurn();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
