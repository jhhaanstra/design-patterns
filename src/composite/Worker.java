package composite;

/**
 * This is the generalized class that is used as main node in the hierarchy. In this case
 * we have a software company that has developers and management and our main CEO Steve Jobs.
 */
public interface Worker {
    public void add(Worker worker);
    public Worker getWorker(int i);
    public void printNames();
}
