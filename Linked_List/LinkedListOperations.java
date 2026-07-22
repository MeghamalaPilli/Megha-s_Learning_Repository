import java.util.Scanner;

public class LinkedList
{
   public static Node head;
   static class Node
   {
     int data;
     Node nextnode;
     public Node(int data)
      {
        this.data=data;
        this.nextnode=null;
      }
   }
  public static void insertAtFirst(int data)//Insert at First
  { 
    Node newnode=new Node(data);
    if(head==null)
    {
      head=newnode;
    }
    else
    {
      newnode.nextnode=head;
      head=newnode; 
    }
print();
  }
 public static void insertAtEnd(int data)//insert At End
 {
   Node newnode=new Node(data);
   if(head==null)
    {
       head=newnode;
       return;
    }
    else
    {
      Node currentnode=head;
      while(currentnode.nextnode!=null)
       {
         currentnode=currentnode.nextnode;
       }
      currentnode.nextnode=newnode;
    }
print();
}
public static void print()//Traversal
{
  Node currentNode=head;
  while(currentNode!=null)
  {
    System.out.println(currentNode.data +"->");
    currentNode=currentNode.nextnode;
  }
}
public static void insertAtPos(int data,Node targetNode)//Inser At Position
{
  if(head==null)
   {
     System.out.println("Null");
      return;
   }
  else
   {
      Node currentNode=head;
      while(currentNode!=null)
       {
         if(currentNode==targetNode)
         {
           Node newnode=new Node(data);
           newnode.nextnode=currentNode.nextnode;
           currentNode.nextnode=newnode;
           break;
         }
       currentNode=currentNode.nextnode;
       }
   }
print();
 }
 public static void main(String[] args)
 {
     System.out.println("--- Executing Linked List Operations ---");
     insertAtFirst(10); 
     insertAtEnd(20);
     insertAtEnd(30);
     insertAtFirst(5);
     Node target=head; 
     System.out.println("\nInserting 99 after node with value: "+target.data);
     insertAtPos(99, target);
 }
}

      
   
   
   
