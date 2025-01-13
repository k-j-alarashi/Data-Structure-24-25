/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarytree;

/**
 *
 * @author khaled
 */
public class main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(5);
        bt.insertNode(1);
        bt.insertNode(10);
        bt.insertNode(8);
        bt.searchNode(17);
        bt.printTree();
    }
}
