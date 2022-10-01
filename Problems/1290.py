# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def getDecimalValue(self, head):
        """
        :type head: ListNode
        :rtype: int
        """
        num=''
        while head:
            
            num=num + str(head.val)
            head=head.next
        #num=str(num)
        return int(num,2)
