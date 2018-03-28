package adapter;

// Here we create the mage adaptor that lets us adapt mages to the unit interface by implementing it by itself
// This lets us create interfaces behind this adapter and make the mage tree in our game more manageable.
public class MageAdaptor implements Unit {
    private Mage mage;

    public MageAdaptor(Mage mage) {
        this.mage = mage;
    }

    @Override
    public void attack() {
        this.mage.castSpell();
    }

    @Override
    public void getStats() {
        this.mage.getStats();
    }
}
