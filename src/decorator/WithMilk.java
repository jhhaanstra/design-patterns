package decorator;

public class WithMilk extends CoffeeDecorator {
    // Call the super methods with the new additions
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
