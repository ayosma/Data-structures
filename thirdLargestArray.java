//Author: Ayoub
import java.util.Arrays;
public class thirdLargestArray{
/**
 * @param args
 */
    public static void main(String[] args){
   
      Integer arr[] = {20,33,40,43,55};
      int largest = 0, secondLargest = 0, thirdLargest = 0;
   
      for(int i = 1; i<arr.length; i++) {
         if(arr[i]>largest){
            thirdLargest=secondLargest;
            secondLargest=largest;
            largest=arr[i];
         }
         else if (arr[i]>secondLargest) {
            thirdLargest=secondLargest;
            secondLargest=arr[i];
         }
         else if (arr[i]>thirdLargest){
            thirdLargest=arr[i];
         }
      }
      System.out.println("The Third largest integer is "+thirdLargest);  
   
   
   }
    
}

