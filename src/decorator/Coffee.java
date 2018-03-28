package decorator;

// This is you base class, if you use the example of pizza with mozzarella, your base class is pizza
public interface Coffee {
    // All the attributes that you want to decorate, get placed in this interface.
    public double getCost();
    public String getIngredients();
}
