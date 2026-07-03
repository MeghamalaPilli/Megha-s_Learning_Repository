import java.util.io;
import java.Scanner;

/*141. Linked List Cycle
Solved
Easy
Topics
premium lock icon
Companies
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list. */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val=x;
        next=null;
    }
}

public class LL
{
    public static boolean LinkedListCycle(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return false;
        }
        ListNode n1=head;
        ListNode n2=head;
        while(n2!=null && n2.next!=null)
        {
            n1=n1.next;
            n2=n2.next.next;
            if(n1==n2)
            {
              return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ListNode head1=new ListNode(3);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(0);
        ListNode node4=new ListNode(5);
        head1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        System.out.println("Result"+LinkedListCycle(head1));
        //TestCase2
        ListNode head2=new ListNode(1);
        System.out.println("Result(No Cycle)"+LinkedListCycle(head2));
    }
}