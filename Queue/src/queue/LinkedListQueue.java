package queue;

/**
 *
 * @author khaled
 */
public class LinkedListQueue<E> implements Queue<E>{
    SinglyLinkedList<E> sliList = new SinglyLinkedList<>();

    @Override
    public int size() {
        return sliList.size();
    }

    @Override
    public boolean isEmpty() {
        return sliList.isEmpty();
    }

    @Override
    public void enqueue(E element) {
        sliList.addLast(element);
    }

    @Override
    public E dequeue() {
        return sliList.removeFirst();
    }

    @Override
    public E front() {
        return sliList.getFirst();
    }
}