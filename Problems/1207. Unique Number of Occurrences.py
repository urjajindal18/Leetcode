class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        ch={}
        l=[]
        for i in arr:
            if i in ch:
                ch[i]+=1
            else:
                ch[i]=1
        #print(ch,ch.values())
        for i in ch.values():
            if i in l:
                return False
            else:
                l.append(i)
        return True
            
