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
        ListNode dummyHead= new ListNode(0);
        ListNode l3 = dummyHead;
        
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;
        int carry=0;
        int sum=0;
        
        
        while(l1!=null || l2!=null)
        {
            int a = (l1!=null)?l1.val:0; // l1 node value
            int b = (l2!=null)? l2.val:0; // l2 node value
            
            int tempSum =a+b+carry; // sum of these nodes
            carry= tempSum/10;      // calcualting the carry 
            tempSum= tempSum%10;     // geting the last number of the sum
            ListNode newNode= new ListNode(tempSum);
            l3.next=newNode;
            
            if (l1!=null)
                l1=l1.next;
            if (l2!=null)
                l2=l2.next;
            
            l3=l3.next;
                
        }
        if (carry>0){
            ListNode newNode=new ListNode(carry);
            l3.next=newNode;
            l3=l3.next;
        }
        
        return dummyHead.next;
    }
}
