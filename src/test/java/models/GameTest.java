package models;

import org.junit.Test;

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


}