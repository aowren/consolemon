public class Moves {

    private int damage;
    private int healthGain;
    private int accuracy;

    public void razorLeaf() {
        damage = 55;
        accuracy = 100;
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

    public void flamethrower() {
        damage = 70;
        accuracy = 90;
    }

    public void fly() {
        damage = 60;
        accuracy = 90;
    }

    public void dragonClaw() {
        damage = 40;
        accuracy = 100;
    }

}
