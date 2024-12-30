/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {
        LinkedListStack<Integer> a = new LinkedListStack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
    }
}
