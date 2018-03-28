package adapter;

// Warrior is a classis unit with a classic swing of his sword
public class Warrior implements Unit {
    @Override
    public void attack() {
        System.out.println("The warrior swings his sword..");
    }

    @Override
    public void getStats() {
        System.out.println("20 attack, 50 defence, 10 intelligence");
    }
}
