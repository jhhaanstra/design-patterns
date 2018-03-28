package adapter;

public class BlackMage implements Mage {
    @Override
    public void castSpell() {
        System.out.println("The black mage casts his fire..");
    }

    @Override
    public void getStats() {
        System.out.println("0 strength, 10 defence, 100 intelligence");
    }
}
