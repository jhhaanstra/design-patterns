package composite;

// Developer acts as a leave node in our tree
public class Developer implements Worker {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void add(Worker worker) {
        // Because this is a leaf, we'll leave this empty
    }

    @Override
    public Worker getWorker(int i) {
        // Because this is a leaf, we'll leave this empty
        return null;
    }

    @Override
    public void printNames() {
        // Because this is a leaf node, we only have to print the developers name.
        System.out.println(name);
    }
}
