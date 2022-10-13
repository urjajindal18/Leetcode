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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null) return null;
        ListNode dummy1=new ListNode();
        ListNode dummy2=new ListNode();
        dummy1=dummy2=head;
        
        for (int i=0;i<n;i++){
            dummy2=dummy2.next;
        }
        while( dummy2!=null && dummy2.next!=null ){
            dummy1=dummy1.next;
            dummy2=dummy2.next;
        }
        if (dummy2==null)
            return head.next;
        dummy1.next=dummy1.next.next;
        return head;
    }
}
