package factory;

public class Main {
    /**
     * Factory pattern is there for where you want to generate multiple types of a single
     * item. For example multiple types of pizza's.
     */
    public static void main(String[] args) {
        PizzaFactory factory = new MargaritaFactory();

        Pizza margarita = factory.makePizza();
        margarita.getToppings();
        margarita.eat();
    }
}
