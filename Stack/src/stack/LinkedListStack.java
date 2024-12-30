package stack;

public class LinkedListStack<E> implements Stack<E>{
    SinglyLinkedList<E> slist = new SinglyLinkedList<>();
    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public boolean isEmpty() {
        return slist.isEmpty();
    }

    @Override
    public void push(E data) {
        slist.addFirst(data);
    }

    @Override
    public E pop() {
        return slist.removeFirst();
    }

    @Override
    public E top() {
        return slist.getFirst();
    }
    
}
