package decorator;

public class WithSugar extends CoffeeDecorator {
    public WithSugar(Coffee coffee) {
        super(coffee);
    }

    public double getCost() {
        return super.getCost() + 0.8;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Sugar";
    }
}
