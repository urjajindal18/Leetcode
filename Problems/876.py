# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def middleNode(self, head):
        if head==None or head.next==None:
            return head
        temp=head
        count=1
        while(temp.next):
            count+=1
            temp=temp.next
        pos=int(count/2)
        print(pos)
        while pos>0:
            head=head.next
            pos-=1
        return head
        
