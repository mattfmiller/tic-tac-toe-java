package models;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private char player;
    private int turn;
    private Map<Integer, Character> board;

    public Game (){
        this.player = 'X';
        this.turn = 1;
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

    public Integer getTurn() {
        return turn;
    }

    public void setTurn() {
        turn ++;
    }

    public void switchPlayer() {
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }

    public  void playerTurn(String playerSelection) {
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

    public Character checkWin(){
        for (int i = 1; i < board.size() ; i += 12) {
            if(board.get(i) == board.get(i + 2) && board.get(i + 2) == board.get(i + 4)) {
                return board.get(i);
            }
        }
        for (int i = 1; i < 6 ; i+=2) {
            if(board.get(i) == board.get(i + 12) && board.get(i + 12) == board.get(i + 24)) {
                return board.get(i);
            }
        }
        if(board.get(1) == board.get(15) && board.get(15) == board.get(29)){
            return board.get(15);
        } else if(board.get(5) == board.get(15) && board.get(15) == board.get(25)){
            return board.get(15);
        } else  {
            return ' ';
        }
    }

    public Boolean checkDraw() {
        if(turn >= 9){
            return true;
        } else {
            return false;
        }
    }
}
