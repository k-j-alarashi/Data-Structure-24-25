package arrays;

import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        
        Array arr = new Array();
        arr.traversal(a);
        System.out.println("===================");
        System.out.println("Enter Element to Search : ");
        int s = in.nextInt();
        System.out.println("Element at : "+arr.BinarySearch(a, 0, 4, s));
    }
}
