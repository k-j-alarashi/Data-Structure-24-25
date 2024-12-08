package circularlinkedlist;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<Integer> clist = new CircularLinkedList<>();
        clist.addLast(1);
        clist.addLast(2);
        clist.addLast(3);
        clist.addLast(4);
        clist.display();
        System.out.println("=====================");
        clist.removeFirst();
        clist.removeLast();
        clist.removeFirst();
        clist.display();
    }
}
