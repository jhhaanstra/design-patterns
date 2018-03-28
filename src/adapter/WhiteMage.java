package adapter;

public class WhiteMage implements Mage {
    @Override
    public void castSpell() {
        System.out.println("The white mage heals his allies..");
    }

    @Override
    public void getStats() {
        System.out.println("10 strength, 20 defence, 80 intelligence");
    }
}
