// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static Node head;
    public static int size=0;
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void insertatfirst(int data)//Insert at first
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
           head=newnode;
        }
        size++;
        print();
    }
    public static void insertatlast(int data)//Insert at last
    {
        Node newnode = new Node(data);
      if(head==null)
       {
         head=newnode;
       }
    else
     {
        Node cur=head;
        while(cur.next!=null)
        {
             cur=cur.next;
        }
        cur.next=newnode;
        newnode=null;
     }
     size++;
     print();
    }
public static void insertatpos(int data,int target)//Insert at any position
{
    if(head==null)
    {
         System.out.println("null");
    }
    else 
    {
        Node cur=head;
        while(cur!=null)
        {
            if(cur.data==target)
            {
               Node newnode=new Node(data);
               newnode.next=cur.next;
               cur.next=newnode;
               size++;
               break;
            }
            cur=cur.next;
       }
       print();
   }
}
   public static void deleteAtFirst()//Delete at first
   {
       if(head==null)
       {
         System.out.println("Null");
         return;
       }
       else
       {
           head=head.next;
       }
       size--;
       print();
   }
   public static void deleteAtLast()//Delete at last
   {
      if(head==null)
      {
          System.out.println("Null");
          return;
      }
      else if(head.next==null)
      {gi
          head=null;
      }
      else
      {
        Node cur=head;
        while(cur.next.next!=null)
        {
            cur=cur.next;
        }
        cur.next=null;
      }
      size--;
      print();
   }
   public static int getsize()//Get size
   {
       return size;
   }
   public static void deleteAtPos(int target)//Delete at any position
   {
      if(head==null)
      {
          System.out.println("Null");
      }
      else if(head.data==target)
       {
          head=head.next;
           size--;
           print();
           return;
       }
       else
       {
           Node cur=head;
           while(cur.next!=null && cur.next.data!=target)
           {
               cur=cur.next;
           }
           if(cur.next!=null)
           {
               cur.next=cur.next.next;
                size--;
                print();
           }
           else
            {
                System.out.println("Target not found");
            }
       }
   }
   public static void print()
   {
       Node cur=head;
       while(cur!=null)
       {
           System.out.print(cur.data + "->");
           cur=cur.next;
       }
       System.out.println("null");
   }
    public static void main(String[] args) 
    {
          Scanner scanner=new Scanner(System.in);
        
        System.out.println("---Initial List ---");
        insertatfirst(10);
        insertatfirst(20);
        insertatlast(30);
        System.out.print("\nEnter target value to insert at any position : ");
        int insertTarget=scanner.nextInt();
        System.out.print("Enter new data value to insert: ");
        int newData=scanner.nextInt();
        System.out.println("\nExecuting insertatpos("+newData+","+ insertTarget +"):");
        insertatpos(newData, insertTarget);
        System.out.print("\nEnter target value to delete: ");
        int deleteTarget=scanner.nextInt();
        System.out.println("\nExecuting deleteAtPos("+ deleteTarget +"):");
        deleteAtPos(deleteTarget);
        deleteAtFirst();
        deleteAtLast();
        System.out.println("Final list size:" + getsize());
        scanner.close(); 
    }
}
