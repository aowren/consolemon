
public class Moves {

    private String moveName;
    private int damage;
    private int accuracy;

    /**
     * Creates a new move object.
     * @param moveName name of the Pokemon's attack.
     * @param damage amount of damage the attack does.
     * @param accuracy accuracy of the attack.
     */
    public Moves(String moveName, int damage, int accuracy) {
        this.moveName = moveName;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    /**
     * Returns the damage dealt by a particular attack.
     * @return damage
     */
    public int getDamage() {
        return this.damage;
    }

    /**
     * Calculates the accuracy of an attack.
     * @return true if the attack hits.
     */
    public boolean calculateAccuracy() {

        if ((Math.random() * 100) < this.accuracy) {
            return true;
        } else {
            return false;
        }
    }
}
