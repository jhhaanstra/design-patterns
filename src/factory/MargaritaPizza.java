package factory;

public class MargaritaPizza implements Pizza {
    @Override
    public void getToppings() {
        System.out.println("cheese and tomato");
    }

    @Override
    public void eat() {
        System.out.println("Omnomnomnom");
    }
}
