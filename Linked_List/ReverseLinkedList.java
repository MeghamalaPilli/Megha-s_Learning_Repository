

public class ReverseLL
{
    public static class ListNode
    {
      public int val;
      public ListNode next;
      public ListNode(){};
        public ListNode(int val)
        {
            this.val=val;
        }
        public ListNode(int val,ListNode next)
        {
            this.val=val;
            this.next=next;
        }
}
    public static ListNode ReverseLinkedList(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public static void main(String args[])
    {
         ListNode first=new ListNode(10);
         ListNode second=new ListNode(20);
         ListNode third=new ListNode(30);
         ListNode fourth=new ListNode(40);
         ListNode fifth=new ListNode(50);
         first.next=second;
         second.next=third;
         third.next=fourth;
         fourth.next=fifth;
         fifth.next=null;

        //Traversing and printing
        System.out.println("Original List: ");
        printList(first);
        ListNode reverselist=ReverseLinkedList(first);
        System.out.print("Reversed List: ");
        printList(reverselist);
    }
    public static void printList(ListNode head)
    {
        ListNode curr=head;
        while(curr!=null)
        {
            System.out.print(curr.val+ "->");
            curr=curr.next;
        }
        System.out.println("null");
    }
}