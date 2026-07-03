import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;
public class Twosum
{
      public int[] twoSum(int n[],int target)
      {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
           int idx=target-n[i];
           if(hm.containsKey(idx))
           {
              return new int[] { hm.get(idx),i};
           }
          hm.put(n[i],i);
        }
       return new int[] {};
      }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    Twosum tm=new Twosum();
    System.out.println("Enter the size of Array");
    int n=sc.nextInt();
    System.out.println("Enter Integers");
    int nums[]=new int[n];
    for(int i=0;i<n;i++)
    {
        nums[i]=sc.nextInt();
    }
    System.out.println("Enter target");
    int target=sc.nextInt();
    int[] res=tm.twoSum(nums, target);
    if(res.length==2)
    {
        System.out.println(Arrays.toString(res));
    }
    else
    {
        System.out.println("No indices");
    }
}
}