package observer;

import java.util.ArrayList;

public class MySubject implements Subject{
    // Lisat of all the observers that are registered on this subject
    private ArrayList<Observer> observers;

    // For every value that gets shared with the observers, create an attribute
    private int value;

    public MySubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer newObserver) {
        observers.remove(newObserver);
    }

    @Override
    public void notifyObserver() {
        // This update needs to send all the values that get updated by the subject
        observers.forEach(o -> {o.update(value);});
    }

    // Setters for all the values that the subject shares with the subscribers
    public void setValue(int value) {
        this.value = value;
        notifyObserver(); // Share the update across all the observers
    }
}
