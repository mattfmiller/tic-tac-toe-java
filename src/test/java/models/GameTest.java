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
    public void newGame_getsPlayer1_true() {
        Game testGame = new Game();
        assertTrue(testGame.getPlayer1() instanceof Character);
    }

    @Test
    public void newGame_getsPlayer2_true() {
        Game testGame = new Game();
        assertTrue(testGame.getPlayer2() instanceof Character);
    }

    @Test
    public void newGame_getsBoard_true() {
        Game testGame = new Game();
        Map<Integer, Character> testMap = new HashMap<Integer, Character>();
        assertEquals(testMap.getClass(), testGame.getBoard().getClass());
    }

    @Test
    public void player1turn_drawOonBoard1_O() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("1"));
    }

    @Test
    public void player1turn_drawOonBoard2_O() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("2"));
    }

    @Test
    public void player1turn_drawOonBoard3_O() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("3"));
    }

    @Test
    public void player1turn_drawOonBoard4_O() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("4"));
    }

    @Test
    public void player1turn_drawOonBoard5_O() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("5"));
    }

    @Test
    public void player1turn_drawOonBoard6_O() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("6"));
    }

    @Test
    public void player1turn_drawOonBoard7_O() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("7"));
    }

    @Test
    public void player1turn_drawOonBoard8_O() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("8"));
    }
}