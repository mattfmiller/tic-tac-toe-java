package models;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void generate_ifItInstantiates_true() {
        Game testGame = new Game();
        assertEquals(true, testGame instanceof Game);
    }

    @Test
    public void newGame_getsPlayer_true() {
        Game testGame = new Game();
        assertTrue(testGame.getPlayer() instanceof Character);
    }

    @Test
    public void newGame_getsBoard_true() {
        Game testGame = new Game();
        Map<Integer, Character> testMap = new HashMap<Integer, Character>();
        assertEquals(testMap.getClass(), testGame.getBoard().getClass());
    }

    @Test
    public void playerTurn_drawOonBoard1_O() {
        Game testGame = new Game();
        testGame.playerTurn("1");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(1));
    }

    @Test
    public void playerTurn_drawOonBoard2_O() {
        Game testGame = new Game();
        testGame.playerTurn("2");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(3));
    }

    @Test
    public void playerTurn_drawOonBoard3_O() {
        Game testGame = new Game();
        testGame.playerTurn("3");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(5));
    }

    @Test
    public void playerTurn_drawOonBoard4_O() {
        Game testGame = new Game();
        testGame.playerTurn("4");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(13));
    }

    @Test
    public void playerTurn_drawOonBoard5_O() {
        Game testGame = new Game();
        testGame.playerTurn("5");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(15));
    }

    @Test
    public void playerTurn_drawOonBoard6_O() {
        Game testGame = new Game();
        testGame.playerTurn("6");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(17));
    }

    @Test
    public void playerTurn_drawOonBoard7_O() {
        Game testGame = new Game();
        testGame.playerTurn("7");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(25));
    }

    @Test
    public void playerTurn_drawOonBoard8_O() {
        Game testGame = new Game();
        testGame.playerTurn("8");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(27));
    }

    @Test
    public void playerTurn_drawOonBoard9_O() {
        Game testGame = new Game();
        testGame.playerTurn("9");
        Character expected = 'X';
        assertEquals(expected, testGame.getBoard().get(29));
    }

    @Test
    public void checkWin_forWinOnRow_X() {
        Game testGame = new Game();
        testGame.playerTurn("7");
        testGame.playerTurn("8");
        testGame.playerTurn("9");
        Character expected = 'X';
        assertEquals(expected, testGame.checkWin());
    }

    @Test
    public void checkWin_forWinOnColumn_X() {
        Game testGame = new Game();
        testGame.playerTurn("3");
        testGame.playerTurn("6");
        testGame.playerTurn("9");
        Character expected = 'X';
        assertEquals(expected, testGame.checkWin());
    }

    @Test
    public void checkWin_forWinOnFirstDiagonal_X() {
        Game testGame = new Game();
        testGame.playerTurn("1");
        testGame.playerTurn("5");
        testGame.playerTurn("9");
        Character expected = 'X';
        assertEquals(expected, testGame.checkWin());
    }

    @Test
    public void checkWin_forWinOnSecondDiagonal_X() {
        Game testGame = new Game();
        testGame.playerTurn("3");
        testGame.playerTurn("5");
        testGame.playerTurn("7");
        Character expected = 'X';
        assertEquals(expected, testGame.checkWin());
    }

    @Test
    public void switchPlayer_switchCurrentPlayer_O() {
        Game testGame = new Game();
        testGame.switchPlayer();
        Character expected = 'O';
        assertEquals(expected, testGame.getPlayer());
    }
}