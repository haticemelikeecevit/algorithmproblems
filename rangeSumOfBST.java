/*
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        int sum = 0;
        if (root.val >= L && root.val <= R)
            sum += root.val;
        if (root.val > L)
        sum =  sum + rangeSumBST(root.left, L, R);
        if (root.val < R)
        sum =  sum + rangeSumBST(root.right, L, R);
        return sum;
    }
}
