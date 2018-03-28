package singleton;

public class Main {
    /**
     * The singleton pattern ensures that only 1 instance of a class is present. This is useful for database classes
     * and settings.
     */
    public static void main(String[] args) {
        // Make an instance of the Settings class
        Settings instance1 = Settings.getInstance();
        System.out.println(instance1);

        // Try to get a new instance
        Settings instance2 = Settings.getInstance();
        System.out.println(instance1);

        // Settings instance3 = new Settings(); // This is not possible because the constructor is private

        if (instance1 == instance2) System.out.println("These are equal!");
    }
}
