import java.util.Scanner;

public class GameLoop {

    Scanner scan = new Scanner(System.in);
    String input = scan.next();

    private boolean player1Turn = true;
    private boolean player2Turn = false;
    public void startBattle() {
        System.out.println("Press Enter to Battle");

        Pokemon pokemon1 = new Pokemon("Venusaur", 220, "Player1");
        Pokemon pokemon2 = new Pokemon("Charizard", 180, "Player2");

        while (player1Turn) {
            BattleMenu battleMenu1 = new BattleMenu();
            battleMenu1.menu(pokemon1.name, pokemon1.HP, pokemon1.player);

            if (input.equals("1")) {

            }
        }

        while (player2Turn) {
            BattleMenu battleMenu2 = new BattleMenu();
            battleMenu2.menu(pokemon2.name, pokemon2.HP, pokemon2.player);
        }

    }

    public int player1Attack() {
        return int damage;
    }


}
