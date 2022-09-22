public class Pokemon {
    String name;
    int HP;
    String player;

    /**
     * Creates a new Pokemon object.
     * @param name name of the Pokemon.
     * @param HP amount of health points the Pokemon has.
     * @param player name of the player
     */

    public Pokemon(String name, int HP, String player) {
        this.name = name;
        this.HP = HP;
        this.player = player;
    }
}
