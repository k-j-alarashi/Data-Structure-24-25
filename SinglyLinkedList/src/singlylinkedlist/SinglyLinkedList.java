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

    public void addFirst(E data) {
        Node<E> newNode = new Node(data, head);
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

    public void addLast(E data) {
        Node<E> newNode = new Node(data, null);
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
        } else {

            Node<E> temp = head;
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail = temp;
        }
        size--;
        return delete;
    }

    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "---->");
            temp = temp.getNext();
        }
        System.out.print("null \n");
    }

    public void addAtPosition(E data, int position) {
        Node<E> newNode = new Node(data, null);
        if (position == 1) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> temp = head;
            int count = 1;
            while (count < position - 1) {
                temp = temp.getNext();
                count++;
            }
            Node<E> change = temp.getNext();
            temp.setNext(newNode);
            newNode.setNext(change);
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
