import org.junit.Test;

public class GameLoopTest {

    @Test
    public void battleTest() {
        GameLoop gameLoop = new GameLoop();
        gameLoop.startBattle();

        System.setIn(System.in);

        // Create pokemon objects
        Pokemon pokemon1 = new Pokemon("Venusaur", 220, "Player1");
        Pokemon pokemon2 = new Pokemon("Charizard", 100, "Player2");

        // Create move objects
        Moves razorleaf = new Moves("Razor Leaf", 55, 100);
        Moves bodyslam = new Moves ("Body Slam", 70, 80);
        Moves flamethrower = new Moves("Flamethrower", 80, 70);
        Moves rockslide = new Moves("Rockslide", 60, 90);

        /*pokemon2.HP -= razorleaf.getDamage();

        assertEquals(30, pokemon2.HP);*/



    }

    @Test
    public void testWinCondition() {
        GameLoop gameLoop = new GameLoop();
        gameLoop.startBattle();

        Pokemon pokemon1 = new Pokemon("Venusaur", -20, "Player1");
        //Pokemon pokemon2 = new Pokemon("Charizard", 180, "Player2");



        //assertTrue(battleOver), pokemon1.HP < 0);
    }
}