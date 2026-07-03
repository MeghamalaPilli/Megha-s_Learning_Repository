import java.util.Scanner;
import java.util.HashMap;

public class Dup
{
    public static boolean containsNearbyDuplicate(int[] nums, int k)
    {
        HashMap<Integer,Integer> duplicate=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(duplicate.containsKey(num))
            {
                int prevIdx=duplicate.get(num);
                if(i-prevIdx <=k)
                {
                    return true;
                }
            }
            duplicate.put(num,i);
        }
    return false;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of n");
    int n=sc.nextInt();
    System.out.println("Enter"+ n + "Elements ");
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
    }
    System.out.println("Enter nearby index that you want to see the duplicate number");
    int ele=sc.nextInt();
    boolean res=containsNearbyDuplicate(ar,ele);
    System.out.println("Result" + res);
}
}
    