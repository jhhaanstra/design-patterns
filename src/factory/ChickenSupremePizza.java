package factory;

public class ChickenSupremePizza implements Pizza {
    @Override
    public void getToppings() {
        System.out.println("Chicken, sweet peppers, tomato, cheese, onion");
    }

    @Override
    public void eat() {
        System.out.println("Munch munch munch!");
    }
}
