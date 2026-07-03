import java.util.Scanner;

public class ClimbStair
{
    public static int climbingStairs(int n)
    {
        if(n<=2)
        {
            return n;
        }
        int prev1=1;
        int prev2=2;
        for(int i=3;i<=n;i++)
        {
           int current=prev1+prev2;
           prev1=prev2;
           prev2=current;
        }
        return prev2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=climbingStairs(n);
        System.out.println("No. of steps is"+res);
    }
}