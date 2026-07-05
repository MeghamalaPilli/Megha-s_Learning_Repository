import java.util.Scanner;
public class Solution
{
    public int reverseBits(int n)
    {
        int result=0;
        for (int i=0;i<32;i++)
        {
            result=(result<<1)|(n&1);
            n>>>=1;
        }
        return result;
    }
     public static void main(String[] args)
     {
        Solution solution=new Solution();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a 32-bit signed integer:");
        if(scanner.hasNextInt())
        {
            int input=scanner.nextInt();
            int output=solution.reverseBits(input);
            System.out.println("Output:"+output);
        }
        else
        {
            System.out.println("Invalid integer input.");
        }
     }
}
