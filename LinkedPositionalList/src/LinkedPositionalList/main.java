package LinkedPositionalList;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        LinkedPositionalList<Integer> l = new LinkedPositionalList<>();
        Position<Integer> p = l.addFirst(1);
        l.addLast(3);
        l.addAfter(p,2);
        Iterator<Integer> i = l.iterator();
        while(i.hasNext()){
            System.out.println("The Elment is : "+i.next());
        }
    }
}
