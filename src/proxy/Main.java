package proxy;

/**
 * Proxy pattern you create a class to limit access to another class, for security etc.
 *
 */
public class Main {
    public static void main(String[] args) {
        GetColaMachineData m1 = new ColaMachine();
        ColaMachine m2 = new ColaMachine();
    }
}
