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
    public ListNode swapPairs(ListNode head) {
        if (head== null || head.next==null)
            return head;
        ListNode one=head;
       // ListNode two=head.next;
        int temp;
        do{
            temp=one.val;    
            one.val=one.next.val;
            one.next.val=temp;
            one=one.next.next;
        }while (one!=null && one.next!=null);
        return head;
    }
}
