package strategy;

public class Animal {
    private int numOfLegs;
    private String name;
    // Use the interface as type to generalize and make it possible to use all the strategies
    protected Flys flyingType;

    public Animal(int numOfLegs, String name) {
        this.numOfLegs = numOfLegs;
        this.name = name;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setFlyingType(Flys flyingType) {
        // You can update the strategy with a simple setter of the general type
        this.flyingType = flyingType;
        // Now your animal can perhaps fly!
    }

    // You call the flyingtype.fly so you use the strategy's definition of flying
    public String getFlyingType() {
        return flyingType.fly();
    }
}
