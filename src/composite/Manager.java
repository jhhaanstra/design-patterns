package composite;

import java.util.ArrayList;

public class Manager implements Worker {
    private String name;
    private ArrayList<Worker> team = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void add(Worker worker) {
        team.add(worker);
    }

    @Override
    public Worker getWorker(int i) {
        if (team.size() > i) return team.get(i);
        return null;
    }

    @Override
    public void printNames() {
        System.out.println(name);
        team.forEach(e -> {e.printNames();});
    }
}
