package queue;

public interface Queue<E> {
    public int size();
    public boolean isEmpty();
    public void enqueue(E element);
    public E dequeue();
    public E front();
}
