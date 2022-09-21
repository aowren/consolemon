import java.util.Random;
import java.util.Scanner;

public class GameLoop {

    Scanner scan = new Scanner(System.in);
    String input = scan.next();

    private boolean player1Turn = true;
    private boolean player2Turn = false;
    public void startBattle() {

        System.out.println("Press Enter to Battle");
        scan.nextLine();

        // Create pokemon objects
        Pokemon pokemon1 = new Pokemon("Venusaur", 220, "Player1");
        Pokemon pokemon2 = new Pokemon("Charizard", 180, "Player2");

        // Create move objects
        Moves razorLeaf = new Moves("Razor Leaf", 55, 100);
        Moves move2 = new Moves("Flamethrower", 80, 70);

        // Accurracy


        while (player1Turn) {
            BattleMenu battleMenu1 = new BattleMenu();
            battleMenu1.menu(pokemon1.name, pokemon1.HP, pokemon1.player);

            razorLeaf.razorLeaf(55, 100);

            scan.nextLine();

            if (input.equals("1")) {
                razorLeaf.calculateAccuracy();
                if (razorLeaf.calculateAccuracy()) {
                    pokemon2.HP -= razorLeaf.getDamage();
                    System.out.println(pokemon2 + " took " + razorLeaf.getDamage() + " damage!");
                } else {
                    System.out.println("The attack missed!");
                }
            }

            // after move input set player1Turn to false and player2Turn to true
                player1Turn = false;
                player2Turn = true;
        }

        while (player2Turn) {
            BattleMenu battleMenu2 = new BattleMenu();
            battleMenu2.menu(pokemon2.name, pokemon2.HP, pokemon2.player);

            move2.flamethrower(80, 70);

            if (input.equals("1")) {
                move2.calculateAccuracy();
                if (move2.calculateAccuracy()) {
                    pokemon1.HP -= move2.getDamage();
                    System.out.println(pokemon1 + " took " + move2.getDamage() + " damage!");
                } else {
                    System.out.println("The attack missed!");
                }
            }

        }
    }



 /*   public int player1Attack() {
        return int damage;
    }*/


}
