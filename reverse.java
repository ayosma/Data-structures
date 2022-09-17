//author : Ayoub
import java.util.*;
class reverse
{
   public static int array[]={3,4,7,6,1};
   public static void reverseArray(int []arr) {      
       
       //two pointer technique   
      int i=0;
      int j=arr.length-1;
       
      while(i<j) {
       
         int temp = array[i];
         array[i]= array[j];
         array[j]=temp;
         i++;   j--;
      }
   }
   public static void main(String[] args) {
      	
      reverseArray(array);           	   
      System.out.println(Arrays.toString(array));           // prints the reversed array	  
   }
}