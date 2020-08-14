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
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode head=A;
        ListNode tmp=A;
        Boolean higher=false;
        for(int i=0;i<B;i++)
        {
            if(tmp==null)
            {
                higher=true;
                break;
            }
            tmp=tmp.next;
        }
        while(higher==false&&tmp!=null)
        {
            tmp=tmp.next;
            A=A.next;
            if(tmp==null)
            {higher=true;}
        }
        if(A==head)
        {
            head=head.next;
        } 
        else if(A.next==null)
        {ListNode tmp2=head;
         while(tmp2.next!=A)
         {tmp2=tmp2.next;}
         tmp2.next=null;
            A=null;}
        else
        {
        ListNode tmp1=A.next;
        A.val=tmp1.val;
        A.next=tmp1.next;
        }
        return head;
    }
}