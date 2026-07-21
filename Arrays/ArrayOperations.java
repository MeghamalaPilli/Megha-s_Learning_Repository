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
System.out.println("Eneter element to be added ");
int endelement=sc.nextInt();
int c[]=new int[n+1];
for(int i=0;i<a.length;i++)
 {
   c[i]=a[i];
 }
c[c.length-1]=endelement;
for(int i=0;i<c.length;i++)//Traversing
{
 System.out.println("After insertion at the end" +c[i]);
}
//Insert at Position
System.out.println("Enter element to be added at any position");
int pos_element=sc.nextInt();
System.out.println("Enter Index number to add the element");
int index=sc.nextInt();
int d[]=new int[n+1];
for(int i=0;i<a.length;i++)
{
  if(i==index)
  {
    d[i]=pos_element;
  }
else if(i<index)
  { 
    d[i]=a[i]; 
  }
else
{
   d[i]=a[i-1];
}
for(int i=0;i<d.length;i++)// Traversing
{
 System.out.println("After Inserting at position"+ index "->" +d[i]);
}
}
}
 
