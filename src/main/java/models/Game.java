package models;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private char player;
    private Map<Integer, Character> board;

    public Game (){
        this.player = 'X';
        this.board = new HashMap<Integer, Character>();
        board.put(1, '1');
        board.put(2, '|');
        board.put(3, '2');
        board.put(4, '|');
        board.put(5, '3');
        board.put(6, '\n');
        board.put(7, '-');
        board.put(8, '-');
        board.put(9, '-');
        board.put(10, '-');
        board.put(11, '-');
        board.put(12, '\n');
        board.put(13, '4');
        board.put(14, '|');
        board.put(15, '5');
        board.put(16, '|');
        board.put(17, '6');
        board.put(18, '\n');
        board.put(19, '-');
        board.put(20, '-');
        board.put(21, '-');
        board.put(22, '-');
        board.put(23, '-');
        board.put(24, '\n');
        board.put(25, '7');
        board.put(26, '|');
        board.put(27, '8');
        board.put(28, '|');
        board.put(29, '9');
        board.put(30, '\n');
    }

    public Character getPlayer() {
        return player;
    }

    public Map<Integer,Character> getBoard() {
        return board;
    }

    public  void playerTurn(String playerSelection){
        if(playerSelection.equals("1")){
            board.put(1, player);
        } else if(playerSelection.equals("2")){
            board.put(3, player);
        } else if(playerSelection.equals("3")) {
            board.put(5, player);
        } else if(playerSelection.equals("4")) {
            board.put(13, player);

        } else if(playerSelection.equals("5")) {
            board.put(15, player);

        } else if(playerSelection.equals("6")) {
            board.put(17, player);

        } else if(playerSelection.equals("7")) {
            board.put(25, player);

        } else if(playerSelection.equals("8")) {
            board.put(27, player);

        } else if(playerSelection.equals("9")) {
            board.put(29, player);

        } else {
        }
    }

    public  char player2turn(String playerSelection){
        if(playerSelection.equals("1")){
            board.put(1, 'X');
            return board.get(1);
        } else if(playerSelection.equals("2")){
            board.put(3, 'X');
            return board.get(3);
        } else if(playerSelection.equals("3")) {
            board.put(5, 'X');
            return board.get(5);
        } else if(playerSelection.equals("4")) {
            board.put(13, 'X');
            return board.get(13);
        } else if(playerSelection.equals("5")) {
            board.put(15, 'X');
            return board.get(15);
        } else if(playerSelection.equals("6")) {
            board.put(17, 'X');
            return board.get(17);
        } else if(playerSelection.equals("7")) {
            board.put(25, 'X');
            return board.get(25);
        } else if(playerSelection.equals("8")) {
            board.put(27, 'X');
            return board.get(27);
        } else if(playerSelection.equals("9")) {
            board.put(29, 'X');
            return board.get(29);
        } else {
            return ' ';
        }
    }
    public Character checkWin(){
        if(board.get(1) == board.get(3) && board.get(5) == board.get(3)){
            return board.get(1);
        } else if(board.get(13) == board.get(15) && board.get(13) == board.get(17)){
            return board.get(13);
        } else if(board.get(25) == board.get(27) && board.get(29) == board.get(25)){
            return board.get(25);
        } else if(board.get(1) == board.get(13) && board.get(13) == board.get(25)){
            return board.get(1);
        } else if(board.get(3) == board.get(15) && board.get(15) == board.get(27)){
            return board.get(3);
        } else if(board.get(5) == board.get(17) && board.get(17) == board.get(29)){
            return board.get(5);
        } else if(board.get(1) == board.get(15) && board.get(15) == board.get(29)){
            return board.get(15);
        } else if(board.get(5) == board.get(15) && board.get(15) == board.get(25)){
            return board.get(15);
        } else  {
            return ' ';
        }
    }

    public void setPlayer() {
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }

}
