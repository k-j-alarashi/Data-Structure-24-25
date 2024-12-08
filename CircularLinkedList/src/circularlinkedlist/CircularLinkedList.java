package circularlinkedlist;

public class CircularLinkedList<E> {

    private Node<E> tail;
    private int size;

    public CircularLinkedList() {
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void addFirst(E data) {
        if (size() == 0) {
            Node<E> newNode = new Node(data, null);
            tail = newNode;
            tail.setNext(tail);
        } else {
            Node<E> newNode = new Node(data, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public E getFirst() {
        return tail.getNext().getData();
    }

    public E removeFirst() {
        if (size() == 0) {
            return null;
        }
        E delete = tail.getNext().getData();
        if (tail.getNext() == tail)
            tail = null;
        else
            tail.setNext(tail.getNext().getNext());
        size--;
        return delete;
    }

    public void addLast(E data) {
        addFirst(data);
        tail = tail.getNext();
    }
    
    public E getLast() {
        return tail.getData();
    }

    public E removeLast(){
        if(size()==0) return null ;
        E delete = tail.getData();
        if(tail.getNext()==tail)
            tail = null;
        else{
            Node<E> temp = tail.getNext();
            while(temp.getNext() != tail){
                temp = temp.getNext();
            }
            temp.setNext(tail.getNext());
            tail = temp ;
        }
        size--;
        return delete ;
    }
    
    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node<E> temp = tail.getNext();
        do {
            System.out.print(temp.getData() + " ----> ");
            temp = temp.getNext();
        } while (temp != tail.getNext());

        System.out.println("go to first ( "+temp.getData()+" )");
    }

    public class Node<E> {

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
