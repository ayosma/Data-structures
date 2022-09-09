//Author: Ayoub
public class linearSearch {

   public int smallestMissing(int[] num){
   
      int k = num[0],index = -1;
      int n = num.length;
      int k1 = num[n-1];
      for (int i = k; i <= k1; i++) 
      {
         index++;
         if (num[index] != i)
            return i;
      }
      return -1;
   }
	
   public static void main(String[] args)
   {
   	
      int[] arr = {0,1,2,3,4,6,7,8};
      linearSearch ls = new linearSearch();
   
      System.out.println(ls.smallestMissing(arr));
   }
}