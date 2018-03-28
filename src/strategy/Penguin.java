package strategy;

public class Penguin extends Animal {
    public Penguin(String name) {
        super(2, name);
        flyingType = new CantFly(); // Initialize one of the strategies
        // A penguin can now fly
    }
}
