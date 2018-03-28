package proxy;

/**
 * This is the context class. This class handles all the state interaction
 */
public class ColaMachine implements GetColaMachineData {
    private State state;
    private int cash = 2000;

    public ColaMachine() {
        // Default state is StartState
        setState(new StartState());
    }

    public void insertMoney(int amount) {
        System.out.println("Received " + amount);
        if (amount==50) state.insertFiftyCents(this);
        else if (amount==100) state.insertOneEuro(this);
        else System.out.println("Coin rejected.");
    }

    public void giveStatus(String feedback) {
        System.out.println(feedback);
    }

    public void giveCola() {
        System.out.println("Lekker veel suiker en caffeïne; enjoy");
        System.out.println("Saldo: weer nul.");
        System.out.println("Werp geld in:");

    }

    void returnMoney(int amount) {
        System.out.println("Geld terug: " + amount);
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public int getCurrentAmount() {
        return cash;
    }
}
