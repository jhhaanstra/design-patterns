package state;

public class Main {
    /**
     * Encapsulate state-dependent behavior. Put particular states in objects. This makes it easy to add
     * new states to our context (also called stat machine).
     *
     * Example is from: https://github.com/bart314/OOP3/tree/master/week2/state
     */
    public static void main(String[] args) {
        ColaMachine machine = new ColaMachine();
        machine.insertMoney(50);
        machine.insertMoney(50);
        machine.insertMoney(50);
        machine.returnMoney(100);
    }
}
