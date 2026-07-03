import java.util.HashSet;
import java.util.Scanner;


/*
  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/
public class Dup
{
    public static boolean DuplicateElement(int array[])
    {
       HashSet<Integer> duplicate=new HashSet<>();
       for(int i=0;i<array.length;i++)
       {
        int num=array[i];
        if(duplicate.contains(num))
         {
           return true;
         }
        duplicate.add(num);
       }
       return false;
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
         int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
         boolean res=DuplicateElement(ar);
         System.out.println("Result" +res);
    }
}