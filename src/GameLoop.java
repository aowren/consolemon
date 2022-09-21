import java.util.Random;
import java.util.Scanner;

public class GameLoop {

    boolean player1Turn = true;
    boolean player2Turn = false;


    public void startBattle() {

        System.out.println("Press ENTER to Battle!");

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        // Create pokemon objects
        Pokemon pokemon1 = new Pokemon("Venusaur", 220, "Player1");
        Pokemon pokemon2 = new Pokemon("Charizard", 180, "Player2");

        // Create move objects
        Moves razorLeaf = new Moves("Razor Leaf", 55, 100);
        Moves flamethrower = new Moves("Flamethrower", 80, 70);


        while (player1Turn) {

            System.out.println("Go, " + pokemon1.name + "!");

            BattleMenu battleMenu1 = new BattleMenu();
            battleMenu1.menu(pokemon1.name, pokemon1.HP, pokemon1.player);

            String input = scan.next();
            scan.nextLine();

            if (input.equals("1")) {
                razorLeaf.calculateAccuracy();
                if (razorLeaf.calculateAccuracy()) {
                    pokemon2.HP -= razorLeaf.getDamage();
                    System.out.println(pokemon2.name + " took " + razorLeaf.getDamage() + " damage!");
                } else {
                    System.out.println("The attack missed!");
                }
            }

            // after move input set player1Turn to false and player2Turn to true
            player1Turn = false;
            player2Turn = true;
        }

        while (player2Turn) {
            String input = scan.next();

            BattleMenu battleMenu2 = new BattleMenu();
            battleMenu2.menu(pokemon2.name, pokemon2.HP, pokemon2.player);

            flamethrower.flamethrower(80, 70);

            if (input.equals("1")) {
                flamethrower.calculateAccuracy();
                if (flamethrower.calculateAccuracy()) {
                    pokemon1.HP -= flamethrower.getDamage();
                    System.out.println(pokemon1.name + " took " + flamethrower.getDamage() + " damage!");
                } else {
                    System.out.println("The attack missed!");
                }
            }

            player1Turn = true;
            player2Turn = false;

        }
    }



 /*   public int player1Attack() {
        return int damage;
    }*/


}
