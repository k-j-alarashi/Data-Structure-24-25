package singlylinkedlist;

public class SinglyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node(element, head);
        head = newNode;
        if (size() == 0) {
            tail = head;
        }
        size++;
    }

    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E delete = head.getData();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = head;
        }
        return delete;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node(element, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getData();
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E delete = tail.getData();
        if (head == tail) {
            head = null;
            tail = null;
        }
        Node<E> current = head;
        while (current != tail) {
            current = current.getNext();
        }
        current.setNext(null);
        tail = current;
        size--;
        return delete;
    }

    public void display() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.getData() + "---->");
            current = current.getNext();
        }
        System.out.print("null\n");
    }

    public void addAtPosition(E element, int position) {
        Node<E> newNode = new Node(element, null);
        if (position == 1) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> current = head;
            int count = 1;
            while (count < position - 1) {
                current = current.getNext();
                count++;
            }
            Node<E> temp = current.getNext();
            current.setNext(newNode);
            newNode.setNext(temp);
        }
    }

    class Node<E> {

        private E data;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.data = element;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
