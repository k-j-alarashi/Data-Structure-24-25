package singlylinkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> slist = new SinglyLinkedList<>();
        slist.addFirst(1);
        slist.addFirst(2);
        slist.addFirst(3);
        slist.addFirst(4);
        slist.display();
    }
}
