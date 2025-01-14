package LinkedPositionalList;

public class main {
    public static void main(String[] args) {
        LinkedPositionalList<Integer> l = new LinkedPositionalList<>();
        Position<Integer> p = l.addFirst(1);
        l.addLast(3);
        l.addAfter(p,2);
        System.out.println(l.remove(l.first()));
        System.out.println(l.remove(l.first()));
        System.out.println(l.remove(l.first()));
    }
}