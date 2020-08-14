/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fstptr=head;
        ListNode slowptr=head;
        while(fstptr.next!=null&&fstptr.next.next!=null)
        {
                fstptr=fstptr.next.next;
                slowptr=slowptr.next;
        }
        if(fstptr.next!=null&&fstptr.next.next==null)
            {
                slowptr=slowptr.next;
            }
        return slowptr;
    }
}