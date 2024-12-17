package doublylinkedlist;

public class DoublyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        head = new Node(null, null, null);
        tail = new Node(head, null, null);
        head.setNext(tail);
        size = 0;
    }

    public int size() {
        return size++;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private void addBetween(Node<E> left, E data, Node<E> right) {
        Node<E> newNode = new Node(left, data, right);
        left.setNext(newNode);
        right.setPrev(newNode);
        size++;
    }

    public void addFirst(E data) {
        addBetween(head, data, head.getNext());
    }

    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getNext().getData();
    }

    public void addLast(E data) {
        addBetween(tail.getPrev(), data, tail);
    }

    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getPrev().getData();
    }

    private E removeBetween(Node<E> deletedNode) {
        if(head.getNext()==tail) return null;
        Node<E> left = deletedNode.getPrev();
        Node<E> right = deletedNode.getNext();
        E delete = deletedNode.getData();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return delete;
    }

    public E removeFirst() {
        return removeBetween(head.getNext());
    }

    public E removeLast() {
        return removeBetween(tail.getPrev());
    }

    public void display() {
        Node<E> temp = head.getNext();
        System.out.print("null <--- head <-----> ");
        while (temp != tail) {
            System.out.print(temp.getData() + " <-----> ");
            temp = temp.getNext();
        }

        System.out.println("tail -----> null");
    }

    public class Node<E> {

        private Node<E> prev;
        private E data;
        private Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

    }

}
