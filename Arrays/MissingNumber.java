
import java.util.Scanner;
import java.util.Arrays;
 public class Missing
 {
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int actualsum=0;
      int ar[]=new int[n];
      System.out.println("Enter the elements between 0 to n");
      for(int i=0;i<n;i++)
      {
         int input=sc.nextInt();
         if(input<0 || input >n)
         {
           System.out.println("Error!,You must eneter the elements betwwen 0 to n");
           System.out.println("Program stopped");
           return;
         }
        ar[i]=input;
        actualsum=actualsum+input;
      }
     int expected_sum=(n*(n+1))/2;
     int missing_number=expected_sum-actualsum;
     System.out.println("Missing number is"+missing_number);
    }
}