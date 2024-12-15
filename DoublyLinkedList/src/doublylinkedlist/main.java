package doublylinkedlist;

public class main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist = new DoublyLinkedList<>();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.display();
        dlist.removeLast();
        dlist.removeLast();
        dlist.removeLast();
        dlist.removeLast();
        dlist.removeLast();
        dlist.display();
    }
}
