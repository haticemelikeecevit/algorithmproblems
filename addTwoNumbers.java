/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int carry = sum/10;
        sum = sum % 10;
        ListNode head = new ListNode (sum);
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        while (l1.next != null || l2.next != null || carry != 0){
            boolean first1 = l1.next != null;
            boolean second1 = l2.next != null;
            tmp = tmp.next;
            int first = 0;
            int second = 0;
            if (first1) {
                l1 = l1.next;
                first = l1.val;
            }
            if (second1) {
                l2 = l2.next;
                second = l2.val;
            }
            sum = first + second;
            if (carry == 1)
                sum += 1;
            carry = sum / 10;
            sum = sum % 10;
            tmp.next = new ListNode(sum);
        }
        return head;
    }
}
