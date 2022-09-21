import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Moves {

    private String moveName;
    private int damage;
    //private int healthGain;
    private int accuracy;

    public Moves(String moveName, int damage, int accuracy) {
        this.moveName = moveName;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public int getDamage() {
        return this.damage;
    }

    public boolean calculateAccuracy() {

        if ((Math.random() * 100) < this.accuracy) {
            return true;
        } else {
            return false;
        }
    }
}
