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
