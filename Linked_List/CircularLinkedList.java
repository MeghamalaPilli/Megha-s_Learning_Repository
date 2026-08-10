public class CircularLinkedList
{
    public Node head;
    public Node tail;
    private class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public CircularLinkedList()
    {
        this.head=null;
        this.tail=null;
    }
public void insertAtFirst(int data)
{
    Node newNode=new Node(data);
    if(head==null)
    {
        head=newNode;
        tail=newNode;
        newNode.next=head;
    }
    else
    {
        newNode.next=head;
        head=newNode;
        tail.next=head;
    }
}
public void insertAtLast(int data)
{
    Node newNode=new Node(data);
    if(head==null)
    {
        head=newNode;
        tail=newNode;
        newNode.next=head;
    }
    else
    {
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }
}
public void insertAtPosition(int position, int data)
{
    if(position<1)
    {
        System.out.println("Invalid position.");
        return;
    }
    if(position==1)
    {
        insertAtFirst(data);
        return;
    }
    Node newNode=new Node(data);
    Node temp=head;
    for(int i=1;i<position-1;i++)
    {
        temp=temp.next;
        if (temp==head)
        {
            System.out.println("Position out of bounds.");
            return;
        }
    }
    newNode.next=temp.next;
    temp.next=newNode;
    if(temp==tail)
    {
        tail=newNode;
    }
}
}