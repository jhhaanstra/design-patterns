package composite;

/**
 * The composite pattern can be used to iterate over a tree the represents a hierarchy of objects.
 * We can iterate by calling the node that you want to iterate from their function.
 * You generalize every element in the tree to iterate over them in an easy way. You iterate in a depth-first way.
 */
public class Main {
    public static void main(String[] args) {
        Manager ceo = new Manager("Steve Jobs");
        Manager m1 = new Manager("Henk");
        Manager m2 = new Manager("Piet");

        m1.add(new Developer("Kees"));
        m1.add(new Developer("Jan"));
        m1.add(new Developer("Klaas"));

        m2.add(new Developer("Johan"));
        m2.add(new Developer("Sietze"));
        m2.add(new Developer("Boeke"));

        ceo.add(m1);
        ceo.add(m2);

        // Print only henk's branch
        m1.printNames();

        System.out.println("");

        // Print out the whole company of Steve Jobs
        ceo.printNames();
    }
}
