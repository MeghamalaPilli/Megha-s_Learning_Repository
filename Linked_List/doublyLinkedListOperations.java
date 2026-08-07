class Node
{
    int data;
    Node prev;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class DoublyLinkedList
{
    public Node head=null;
    public void insertAtFirst(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void insertAtLast(int data)
    {
        if(head==null)
        {
            insertAtFirst(data);
            return;
        }
        Node cur=head;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        Node newNode=new Node(data);
        cur.next=newNode;
        newNode.prev=cur;
        newNode.next=null;
    }
    public void insertAtPosition(int data,int target)
    {
        if(head==null)
        {
            insertAtFirst(data);
            return;
        }
        Node cur=head;
        while(cur!=null && cur.data!=target)
        {
           cur=cur.next;
        }
        if(cur==null)
        {
            System.out.println("Target Not Found");
        }
        else
        {
            Node newNode=new Node(data);
            newNode.next=cur.next;
            newNode.prev = cur;
            if(cur.next!=null)
            {
              cur.next.prev=newNode;
            }
            cur.next=newNode;
        }
        return;

    }
 public void deleteAtFirst()
 {
    if (head==null)
    {
      System.out.println("Null");
    }
    else if(head.next==null)
    {
        head=null;
    }
    else
    {
        head=head.next;
        head.prev=null;
    }
    print();
    return;
}
public void deleteAtLast()
{
    if(head==null)
    {
        System.out.println("Null");
        return;
    }
    if(head.next==null)
    {
        head=null;
    }
    else
    {
        Node cur=head;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        cur.prev.next=null;
    }
    print();
}
public void deleteAtPosition(int target)
{
    if(head==null)
    {
        System.out.println("Null");
        return;
    }
    Node cur=head;
    while(cur!=null&&cur.data!=target)
    {
        cur=cur.next;
    }
    if(cur==null)
    {
        System.out.println("Target Not Found");
        return;
    }
    if(cur==head)
    {
        head=head.next;
        if(head!=null)
        {
            head.prev=null;
        }
    } 
    else
    {
        cur.prev.next=cur.next;
        if(cur.next!=null)
        {
            cur.next.prev=cur.prev;
        }
    }
    print();
}

public void print()
{
    Node cur=head;
    while(cur!=null)
    {
        System.out.print(cur.data+"->");
        cur=cur.next;
    }
    System.out.println("null");
}
public void reverse()
{
    if (head==null||head.next==null)
    {
        return; 
    }
    Node cur=head;
    Node temp=null;
    while (cur!=null)
    {
        temp=cur.prev;
        cur.prev=cur.next;
        cur.next=temp;
        cur=cur.prev;
    }
    if (temp!=null)
    {
        head=temp.prev;
    }
}
}
