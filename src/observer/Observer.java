package observer;

public interface Observer {
    /**
     * Every observer needs to use the same function so the observer can call the update method.
     * @param value all the parameters are the values that the observer sends, the observer can use
     *              which ones he likes to use.
     */
    public void update(int value);
}
