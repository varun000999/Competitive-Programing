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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //ListNode sol=new ListNode();
        int remdr=0;
        int actual=0;
        ListNode head=l1;
        ListNode lifesaver=null;
        while(l1!=null&&l2!=null)
        {
            if(l1.next==null)
            {
                lifesaver=l1;
            }
            int temp=l1.val+l2.val+remdr;
            actual=temp%10;
            remdr=temp/10;
            if(temp>9)
            {
                if(l1.next==null)
                {
                    ListNode nw=new ListNode(remdr);
                    l1.next=nw;
                    remdr=0;
                }
            }
            else if(temp<10)
            {
                remdr=0;
            }
            l1.val=actual;
            l1=l1.next;
            l2=l2.next;
        }
        if(l2!=null)
        {
            lifesaver.next=l2;
        }
        if(l1!=null&&remdr!=0)
        {
            while(remdr!=0&&l1!=null)
            {
                int temp=l1.val+remdr;
                remdr=temp/10;
                l1.val=temp%10;
                if(l1.next==null)
                {
                    lifesaver=l1;
                }
                l1=l1.next;
            }
            if(remdr!=0&&l1==null)
            {
                ListNode tt=new ListNode(remdr);
                lifesaver.next=tt;
                remdr=0;
            }
        }
        return head;
    }
}

=================================================================A SHORTER VERSION(BUT USES EXTRA SPACE)
=================================================================

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}