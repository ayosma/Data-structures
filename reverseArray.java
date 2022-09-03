//Author: Ayoub
import java.util.Scanner;
import java.util.*;
class reverseArray {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter array size"); //prompt's user to input array
      int n = in.nextInt();      //stores value
      int array[] = new int[n];
      System.out.println("Enter numbers");
      for(int i = 0; i<n;  i++) {
         array[i]=in.nextInt();
      }
      System.out.println("The reversed array is");
      for(int i=n-1;i>=0;i--) {
         System.out.print(array[i]+" ");  
      
      
      
      }
   }
}