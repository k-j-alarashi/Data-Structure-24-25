package arrays;

import java.util.Scanner;

public class Array {

    Scanner in = new Scanner(System.in);

    // traversal == print
    public void traversal(int[] a) {
        System.out.println("a[index]  =  element.");
        System.out.println("_____________________");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]      =      " + a[i]);
        }
    }

    public void input(int[] a) {
        System.out.println("Enter Elements  : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
    }
    
    public void update(int[] a , int index , int element){
        a[index] = element ;
    }
    
    public void delete(int[] a , int index ){
        a[index] = 0 ;
    }
    
    public int LinearSearch(int[] a , int search){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==search){
                return i;
            }
        }
        return -1;
    }
    
    public int BinarySearch(int[] a , int findex , int lindex , int search){
        while(findex<=lindex){
            int mid = (findex+lindex)/2;
            if(search==a[mid])
                return mid ;
            if(search < a[mid])
                lindex = mid - 1 ;
            if(search > a[mid])
                findex = mid + 1 ;
        }
        return -1 ;
    }
}
