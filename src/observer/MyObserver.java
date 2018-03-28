package observer;

public class MyObserver implements Observer {
    // All the values that you want to keep track off
    private int value;

    // This value will stay the same throughout the whole program runtime
    // That is why this is viable
    private static int observerIDTracker = 0;
    private int observerID; // ID of the observer


    // Useful to have a reference to the subject as observer
    private Subject mySubject;

    public MyObserver(Subject mySubject) {
        this.mySubject = mySubject;
        this.observerID = ++observerIDTracker;
        mySubject.register(this);
    }

    // It is possible for update to give multiple values and you don't want to use
    // them all for this class. Then it is possible to just leave the other values and let
    // the garbage collector discard them.
    @Override
    public void update(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
