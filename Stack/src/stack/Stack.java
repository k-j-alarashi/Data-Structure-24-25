package stack;

public interface Stack<E> {
    public int size();
    public boolean isEmpty();
    public void push(E data); // add
    public E pop(); // remove
    public E top();
}
