package strategy;

// This is your behaviour that you want to implement, program to interfaces instead of classes in this case.
public interface Flys {
    String fly();
}

// Keeping it in the same file is optional, in this case it is a viable option because the functions are not long
class ItFlys implements Flys {
    @Override
    public String fly() {
        return "Flying high!";
    }
}

class CantFly implements Flys {
    @Override
    public String fly() {
        return "I prefer the ground!";
    }
}