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
    public void player1turn_drawOonBoard_character() {
        Game testGame = new Game();
        char expected = 'O';
        assertEquals(expected, testGame.player1turn("1"));

    }
}