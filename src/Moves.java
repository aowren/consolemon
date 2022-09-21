import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Moves {


    private String moveName;
    private int damage;
    private int healthGain;
    private int accuracy;

    public Moves(String moveName, int damage, int accuracy) {
        this.moveName = moveName;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public void razorLeaf(int damage, int accuracy) {
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public void leechSeed() {
        damage = 5;
        healthGain = 5;
        accuracy = 80;
    }

    public void poisonPowder() {
        damage = 10;
        accuracy = 70;
        // for each turn damage = 10
    }

    public void flamethrower(int damage, int accuracy) {
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public void fly() {
        damage = 60;
        accuracy = 90;
    }

    public void dragonClaw() {
        damage = 40;
        accuracy = 100;
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
