package factory;

interface PizzaFactory {
    Pizza makePizza();
}

class MargaritaFactory implements PizzaFactory {
    @Override
    public Pizza makePizza() {
        System.out.println("Making new pizza!");
        return new MargaritaPizza();
    }
}

class ChickenSupremeFactory implements PizzaFactory {
    @Override
    public Pizza makePizza() {
        System.out.println("Making newa pizza!");
        return new ChickenSupremePizza();
    }
}