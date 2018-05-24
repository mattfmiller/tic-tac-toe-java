import models.Game;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        for (Integer key: game.getBoard().keySet())
        System.out.print(game.getBoard().get(key));
    }
}
