import java.util.Scanner;

public class GameLoop {

    boolean player1Turn = true;
    boolean player2Turn = false;
    boolean battleOver = false;

    public void startBattle() {

        System.out.println("Press ENTER to Battle!");

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        // Create pokemon objects
        Pokemon pokemon1 = new Pokemon("Venusaur", 220, "Player1");
        Pokemon pokemon2 = new Pokemon("Charizard", 180, "Player2");

        // Create move objects
        Moves razorleaf = new Moves("Razor Leaf", 40, 100);
        Moves bodyslam = new Moves ("Body Slam", 70, 80);

        Moves flamethrower = new Moves("Flamethrower", 90, 70);
        Moves rockslide = new Moves("Rockslide", 60, 90);

        Sprites sprites = new Sprites();

        while(!battleOver) {

            while (player1Turn) {

                // Create pokemon1 sprite
                System.out.println(sprites.venusaurSprite);

                // Initialize battle menu for player 1
                BattleMenu battleMenu1 = new BattleMenu();
                battleMenu1.menu(pokemon1.name, pokemon1.HP, pokemon1.player);

                // Pokemon attacks
                System.out.println("1: Razor Leaf");
                System.out.println("2: Body Slam");
                System.out.println();

                if (pokemon1.HP > 0) {
                    String input = scan.next();
                    scan.nextLine();

                    // Attack 1
                    if (input.equals("1")) {
                        razorleaf.calculateAccuracy();
                        if (razorleaf.calculateAccuracy()) {
                            pokemon2.HP -= razorleaf.getDamage();
                            System.out.println(pokemon2.name + " took " + razorleaf.getDamage() + " damage!");
                        } else {
                            System.out.println("The attack missed!");
                        }
                    }

                    // Attack 2
                    if (input.equals("2")) {
                        bodyslam.calculateAccuracy();
                        if (bodyslam.calculateAccuracy()) {
                            pokemon2.HP -= bodyslam.getDamage();
                            System.out.println(pokemon2.name + " took " + bodyslam.getDamage() + " damage!");
                        } else {
                            System.out.println("The attack missed!");
                        }
                    }

                } else {
                    System.out.println(pokemon1.name + " fainted!");
                    System.out.println("Player2 wins!");
                    System.exit(0);
                }
                // After move input set player1Turn to false and player2Turn to true
                player1Turn = false;
                player2Turn = true;
            }

            while (player2Turn) {

                System.out.println(sprites.charizardSprite);

                BattleMenu battleMenu2 = new BattleMenu();
                battleMenu2.menu(pokemon2.name, pokemon2.HP, pokemon2.player);

                // Pokemon attacks
                System.out.println("1: Flamethrower");
                System.out.println("2: Rockslide");
                System.out.println();

                if (pokemon2.HP > 0) {
                    String input = scan.next();
                    scan.nextLine();

                    // Attack 1
                    if (input.equals("1")) {
                        flamethrower.calculateAccuracy();
                        if (flamethrower.calculateAccuracy()) {
                            pokemon1.HP -= flamethrower.getDamage();
                            System.out.println(pokemon1.name + " took " + flamethrower.getDamage() + " damage!");
                        } else {
                            System.out.println("The attack missed!");
                        }
                    }

                    // Attack 2
                    if (input.equals("2")) {
                        rockslide.calculateAccuracy();
                        if (rockslide.calculateAccuracy()) {
                            pokemon1.HP -= rockslide.getDamage();
                            System.out.println(pokemon1.name + " took " + rockslide.getDamage() + " damage!");
                        } else {
                            System.out.println("The attack missed!");
                        }
                    }

                } else {
                    System.out.println(pokemon2.name + " fainted!");
                    System.out.println("Player1 wins!");
                    System.exit(0);
                }
                // After move input set player2Turn to false and player1Turn to true
                player1Turn = true;
                player2Turn = false;
            }
        }
    }
}
