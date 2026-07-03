/**191. Number of 1 Bits
Solved
Easy
Topics
premium lock icon
Companies
Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

 

Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

 

Constraints:

1 <= n <= 231 - 1 **/
import java.util.Scanner;
public class NumberOfOneBits
{
    public int numberOfoneBits(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        NumberOfOneBits nbits=new NumberOfOneBits();   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive Integer n");
        int n=sc.nextInt();
        int res=nbits.numberOfoneBits(n);
        System.out.println("The number of setBits are " + res);
   }
}