/*
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 1)
            return new TreeNode(nums[0]);
        else if (nums.length == 0)
            return null;
        int max = findMaxElement(nums);
        TreeNode head = new TreeNode(nums[max]);
        int[] leftSubTree = new int[max];
        int[] rightSubTree =  new int[nums.length - max - 1];
        for (int i = 0; i < leftSubTree.length; i++) {
            leftSubTree[i] = nums[i];
        }
        for (int i = 0; i < rightSubTree.length; i++){
            rightSubTree[i] =  nums[i + max + 1];
        }
        head.left = constructMaximumBinaryTree(leftSubTree);
        head.right = constructMaximumBinaryTree(rightSubTree);
        return head;
        
    }
    public int findMaxElement (int[] nums) {
        int max = nums[0];
        int place = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max){
                place = i;
                max = nums[i];
            }
        }
        return place;
    }
}
