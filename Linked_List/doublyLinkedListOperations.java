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
    private Node head;
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
}
