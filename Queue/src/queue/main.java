package queue;

public class main {
    public static void main(String[] args) {
        LinkedListQueue<Integer> aq = new LinkedListQueue<>();
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(3);
        aq.enqueue(4);
        System.out.println(aq.dequeue());
        System.out.println(aq.dequeue());
        System.out.println(aq.dequeue());
        System.out.println(aq.dequeue());
    }
}
