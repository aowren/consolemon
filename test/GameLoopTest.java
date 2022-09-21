import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLoopTest {

    @Test
    public void battleTest() {
        GameLoop gameLoop = new GameLoop();

        // Create pokemon objects
        Pokemon pokemon1 = new Pokemon("Venusaur", 220, "Player1");
        Pokemon pokemon2 = new Pokemon("Charizard", 180, "Player2");

        // Create move objects
        Moves razorleaf = new Moves("Razor Leaf", 55, 100);
        Moves bodyslam = new Moves ("Body Slam", 70, 80);
        Moves flamethrower = new Moves("Flamethrower", 80, 70);
        Moves rockslide = new Moves("Rockslide", 60, 90);

        assertEquals();
    }

    @Test
    public void testWinCondition() {
        GameLoop gameLoop = new GameLoop();
        gameLoop.startBattle();

        Pokemon pokemon1 = new Pokemon("Venusaur", 220, "Player1");
        Pokemon pokemon2 = new Pokemon("Charizard", 180, "Player2");

        assertEquals();
    }
}