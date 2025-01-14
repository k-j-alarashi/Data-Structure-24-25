package LinkedPositionalList;

public class LinkedPositionalList<E> implements PositionalList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedPositionalList() {
        head = new Node<E>(null, null, null); // Sentinel head
        tail = new Node<E>(head, null, null); // Sentinel tail
        head.setNext(tail);                   // Link head to tail
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private Node<E> validation(Position<E> p) {
        if (!(p instanceof Node)) {
            throw new IllegalArgumentException("Invalid Position!");
        }
        Node<E> node = (Node<E>) p;
        if (node.getNext() == null || node.getPrev() == null) {
            throw new IllegalArgumentException("Position is no longer valid!");
        }
        return node;
    }

    private Position<E> position(Node<E> node) {
        if (node == head || node == tail) {
            return null;
        }
        return node;
    }

    @Override
    public Position<E> first() {
        return position(head.getNext());
    }

    @Override
    public Position<E> last() {
        return position(tail.getPrev());
    }

    @Override
    public Position<E> before(Position<E> p) {
        Node<E> node = validation(p);
        return position(node.getPrev());
    }

    @Override
    public Position<E> after(Position<E> p) {
        Node<E> node = validation(p);
        return position(node.getNext());
    }

    private Position<E> addBetween(Node<E> prev, E data, Node<E> next) {
        Node<E> newNode = new Node<>(prev, data, next);
        prev.setNext(newNode);
        next.setPrev(newNode);
        size++;
        return newNode;
    }

    @Override
    public Position<E> addFirst(E data) {
        return addBetween(head, data, head.getNext());
    }

    @Override
    public Position<E> addLast(E data) {
        return addBetween(tail.getPrev(), data, tail);
    }

    @Override
    public Position<E> addBefore(Position<E> p, E data) {
        Node<E> node = validation(p);
        return addBetween(node.getPrev(), data, node);
    }

    @Override
    public Position<E> addAfter(Position<E> p, E data) {
        Node<E> node = validation(p);
        return addBetween(node, data, node.getNext());
    }

    @Override
    public E remove(Position<E> p) {
        Node<E> node = validation(p);
        E del = node.getData();
        Node<E> left = node.getPrev();
        Node<E> right = node.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return del;
    }

    @Override
    public E set(Position<E> p, E data) {
        Node<E> node = validation(p);
        E oldNode = node.getData();
        node.setData(data);
        return oldNode;
    }

    private class Node<E> implements Position<E> {

        private Node<E> prev;
        private E data;
        private Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        @Override
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

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
