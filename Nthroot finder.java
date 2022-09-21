//author Ayoub
import java.text.DecimalFormat;
class assignment2
{
   public static void main(String[] args)
   {
      String result1 = squareRootFinder(41,5);     
      System.out.println(result1);
      String result2 = nthRootFinder(41,3,3);      
      System.out.println(result2);
   }
   public static String squareRootFinder(int number, int iterations)
   {
      int i=0;
      double start = 0.0, end = number,mid = (start+end)/2;    //initializes the variables
      while (i<iterations) {
      
         mid = (start + end) / 2;
         if (mid * mid < number) {
            start = mid;
         }
         else {
            end = mid;
         }
         i++;
      }
      DecimalFormat fivepointaccuracy;
      fivepointaccuracy = new DecimalFormat("0.00000");     //5 decimal point accuracy
            return fivepointaccuracy.format(mid);
   }
   public static String nthRootFinder(int number, int iterations, int n){
   
      int i=0;
      double start = 0.0, end = number,mid = (start+end)/2;          //initializes the variables
      while (i<iterations){
             
         mid = (start+end)/2;
         double temp=mid;
         for (int j=1; j<n; j++) {                              //loop to find the nth power 
         
            temp = temp*mid;
         }
         if (temp < number){
                                       
            start = mid;
         }
         else{
                         
            end = mid;
         }
         i++;
      }
      DecimalFormat fivepointaccuracy;
      fivepointaccuracy = new DecimalFormat("0.00000");       //5 decimal point accuracy
      return fivepointaccuracy.format(mid);
   }
}