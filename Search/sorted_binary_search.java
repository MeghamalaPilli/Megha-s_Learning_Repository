import java.util.Scanner;
import java.util.Arrays;
public class binary
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n=sc.nextInt();
     System.out.println("Enter array elements in sorted order");
     int[] ar=new int[n];
     for(int i=0;i<n;i++)
     {
        ar[i]=sc.nextInt();
     }
     
     System.out.println("Enter search key value");
     int key=sc.nextInt();
     int res=binarySearch(ar,key);
     if(res!=-1)
     {
        System.out.println("Element Found at Position"+res);
     }
     else
     {
        System.out.println("Element not found");
     }
  }
  public static int binarySearch(int[] arrayEle,int val)
  {
     int low=0;
     int high=arrayEle.length-1;
     while(low<=high)
     {
        int mid=(low+high)/2;
        if(arayele[mid]==val)
        {
            return mid;
        }
        else if(arayele[mid]<val)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
     }
     return -1;
  }
}
