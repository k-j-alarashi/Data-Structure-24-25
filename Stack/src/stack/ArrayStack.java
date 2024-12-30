/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

public class ArrayStack<E> implements Stack<E>{
    private E data[];
    private final int capacity = 1000 ;
    private int top ;

    public ArrayStack() {
        data = (E[]) new Object[capacity];
        top = -1 ;
    }
    
    

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void push(E data) {
        if(size()==capacity)
            System.out.println("The Stack is Full ..!");
        else
            this.data[++top] = data ;
    }

    @Override
    public E pop() {
        if(isEmpty()) return null;
        E delete = data[top];
        data[top] = null;
        top--;
        return delete ;
    }

    @Override
    public E top() {
        if(isEmpty()) return null;
        return data[top];
    }
    
}
