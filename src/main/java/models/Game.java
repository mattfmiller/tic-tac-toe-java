package models;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private char player1;
    private char player2;
    private Map<Integer, Character> board;

    public Game (){
        this.player1 = 'O';
        this.player2 = 'X';
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

    public Character getPlayer1() {
        return player1;
    }

    public Character getPlayer2() {
        return player2;
    }

    public Map<Integer,Character> getBoard() {
        return board;
    }

    public  char player1turn(String playerSelection){
        if(playerSelection.equals("1")){
            board.put(1, 'O');
            return board.get(1);
        } else if(playerSelection.equals("2")){
            board.put(3, 'O');
            return board.get(3);
        } else if(playerSelection.equals("3")) {
            board.put(5, 'O');
            return board.get(5);
        } else if(playerSelection.equals("4")) {
            board.put(13, 'O');
            return board.get(13);
        } else if(playerSelection.equals("5")) {
            board.put(15, 'O');
            return board.get(15);
        } else if(playerSelection.equals("6")) {
            board.put(17, 'O');
            return board.get(17);
        } else if(playerSelection.equals("7")) {
            board.put(25, 'O');
            return board.get(25);
        } else if(playerSelection.equals("8")) {
//            board.put(27, 'O');
            return board.get(27);
        }  else {
            return ' ';
        }

    }
}
