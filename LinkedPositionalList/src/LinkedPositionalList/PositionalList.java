package LinkedPositionalList;

public interface PositionalList<E> {
    int size();
    boolean isEmpty();
    Position<E> first();
    Position<E> last();
    Position<E> before(Position<E> p);
    Position<E> after(Position<E> p);
    Position<E> addFirst(E data);
    Position<E> addLast(E data);
    Position<E> addBefore( Position<E> p , E data);
    Position<E> addAfter( Position<E> p , E data);
    E remove(Position<E> p);
    E set(Position<E> p , E data);
}
