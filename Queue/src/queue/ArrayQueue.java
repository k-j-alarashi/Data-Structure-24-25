package queue;

public class ArrayQueue<E> implements Queue<E> {

    private E data[];
    private static final int capacity = 1000;
    private int size; // the size for actual elements in array.
    private int front;
    
    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
        size = 0;
        front = 0;
    }

    public ArrayQueue() {
        this(capacity);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void enqueue(E element) {
        if (size() == capacity) {
            System.out.println("The Queue is Full ..!");
        } else {
            int avilable = (front + size()) % data.length;
            this.data[avilable] = element ;
            size++;
        }
    }

    @Override
    public E dequeue() {
        if(isEmpty()) return null;
        E delete = data[front]; 
        front = (front + 1) % data.length ;
        size--;
        return delete ;
    }

    @Override
    public E front() {
        if(isEmpty()) return null;
        return data[front];
    }

}
