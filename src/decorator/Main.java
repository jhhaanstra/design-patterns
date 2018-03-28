package decorator;

public class Main {

    /**
     * The decorator patterns uses a base class and creates new class that wrap around the base class
     * The new classes decorate the base class, for example, coffee with milk wraps around a basic cup of coffee
     * A pizza with mozzerela cheese add mozzarella to a basic pizza.
     * You can decorate decorators.
     *
     * A good example of this pattern is the Reader and Writer classes in Java.
     */
    public static void main(String args[]) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("cost: " + myCoffee.getCost() + ", ingredients: " + myCoffee.getIngredients());

        // Insert a SimpleCoffee (base class) as parameter
        Coffee withMilk = new WithMilk(new SimpleCoffee());
        System.out.println("cost: " + withMilk.getCost() + ", ingredients: " + withMilk.getIngredients());

        // As you can see, you can stack the decorators like this
        Coffee withSugar = new WithSugar(new WithMilk(new SimpleCoffee()));
        System.out.println("cost: " + withSugar.getCost() + ", ingredients: " + withSugar.getIngredients());
    }
}
