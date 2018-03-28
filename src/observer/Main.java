package observer;

public class Main {
    /**
     * The observer pattern creates a subject with a registersystem. The units that subscribe are called
     * the observers. Once the subject wants to update something, it sends it to all the observers.
     *
     * Example of usage is Stock markets, 1 centralized unit with multiple branches (e.g. tech and candy)
     */
    public static void main(String[] args) {
        MySubject subject = new MySubject();

        // Create a new observer and register to my subject
        MyObserver observer1 = new MyObserver(subject);

        subject.setValue(5);
        System.out.println(observer1.getValue());

        MyObserver observer2 = new MyObserver(subject);
        System.out.println(observer2.getValue());

        subject.setValue(10);
        System.out.println(observer1.getValue());
        System.out.println(observer2.getValue());
    }
}
