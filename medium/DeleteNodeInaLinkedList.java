// 237 DELETE NODE IN A LINKED LIST
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        ListNode next= node.next.next;
        ListNode prev =node;
        prev.next=next;
    }
}
