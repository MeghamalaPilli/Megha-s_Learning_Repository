//Insert at Firts
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size");
   int n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter elements");
   for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
 System.out.println("Enter element to be added");
 int element=sc.nextInt();
 int b[]=new int[n+1];
 b[0]=element;
 for(int i=0;i<a.length;i++)
 {
    b[i+1]=a[i];
 }
for(int i=0;i<b.length;i++)//Travering
{
 System.out.println("After Insertion->" + b[i]);
}
//Insert at End 
System.out.println("Enter element to be added ");
        int endelement=sc.nextInt();
        int c[]=new int[n+1];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        c[c.length-1]=endelement;
        for(int i=0;i<c.length;i++)
        {
            System.out.println("After insertion at the end"+c[i]);
        }
//Insert at Position
 System.out.println("Enter element to be added at any position");
        int pos_element=sc.nextInt();
        System.out.println("Enter Index number to add the element");
        int index=sc.nextInt();
        if (index<0||index>n)
        {
            System.out.println("Invalid Index");
        }
        else
        {
            int d[]=new int[n+1];
            for (int i=0;i<d.length;i++)
            {
                if (i<index)
                {
                    d[i]=a[i];
                }
                else if(i==index)
                {
                    d[i]=pos_element;
                }
                else
                {
                    d[i]=a[i-1];
                }
            }
            for (int i=0;i<d.length;i++)
            {
                System.out.println("After Inserting"+d[i]);
            }
        }
//Delete at First
int n1=a.length;
        if(n1==0) 
        {
            System.out.println("Array is Empty");
        }
        else
        {
            int e[]=new int[n1-1];
            for(int i=0;i<e.length;i++)
            {
                e[i]=a[i+1];
            }
            for (int i=0;i<e.length;i++)
            {
                System.out.println("After Deletion at First->"+e[i]);
            }
        }
//Delete at End
int size=a.length;
        if(size==0)
        {
            System.out.println("Array is Empty");
        }
        else
        { 
            int f[]=new int[size-1];
            for (int i=0;i<f.length;i++)
            {
                f[i]=a[i];
            }
            for(int i=0;i<f.length;i++)
            {
                System.out.println("After Deletion at End->"+f[i]);
            }
        }
//Delete at Pos
 if(a.length==0)
 {
    System.out.println("Array is Empty");
 }
 else
 {
    System.out.println("Enter index to be deleted");
    int idx=sc.nextInt();
    if(idx<0||idx>=a.length)
    { 
      System.out.println("Invalid Index");
    }
    else
    {
      int g[]=new int[a.length-1];
      for(int i=0;i<idx;i++)
      {
        g[i]=a[i];
      }
      for(int i=idx;i<g.length;i++)
      {
        g[i]=a[i+1];
      }
      for(int i=0;i<g.length;i++)
      {
        System.out.println("After Deletion"+g[i]);
      }
    }
  }
}
}