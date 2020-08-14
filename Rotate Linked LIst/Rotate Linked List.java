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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode len=head;
        int count=0;
        while(len!=null)
        {
            len=len.next;
            count++;
        }
        k=k%count;
        while(k!=0)
        {
            ListNode tmp=head;
            while(tmp.next.next!=null)
            {
                tmp=tmp.next;
            }
            tmp.next.next=head;
            head=tmp.next;
            tmp.next=null;
            k--;
        }
        return head;
    }
}