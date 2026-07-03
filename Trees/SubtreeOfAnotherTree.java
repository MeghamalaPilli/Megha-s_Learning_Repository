/**
 * 572. Subtree of Another Tree
Easy
Topics
premium lock icon
Companies
Hint
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

 

Example 1:


Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true
Example 2:


Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false
 

Constraints:

The number of nodes in the root tree is in the range [1, 2000].
The number of nodes in the subRoot tree is in the range [1, 1000].
-104 <= root.val <= 104
-104 <= subRoot.val <= 104
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.LinkedList;
import java.util.Queue;
class Solution
{
    public boolean isSubtree(TreeNode root, TreeNode subRoot)
    {
        if (root==null)
        {
            return false;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            TreeNode current=queue.poll();

            if(current.val==subRoot.val && isSameTreeIterative(current,subRoot))
            {
                return true;
            }

            if(current.left!=null)
            {
                queue.add(current.left);
            }
            if(current.right!=null)
            {
                queue.add(current.right);
            }
        }
        return false;
    }
    private boolean isSameTreeIterative(TreeNode p,TreeNode q)
    {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty())
        {
            TreeNode n1=q1.poll();
            TreeNode n2=q2.poll();
            if(n1==null&&n2==null) {
                continue;
            }
            if(n1==null||n2==null)
            {
                return false;
            }
            if(n1.val!=n2.val)
            {
                return false;
            }
            q1.add(n1.left);
            q2.add(n2.left);
            q1.add(n1.right);
            q2.add(n2.right);
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}
