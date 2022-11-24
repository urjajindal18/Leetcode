class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        ch=[]
        rep=[]
        for c in s:
            if c  not in ch and c not in rep:
                ch.append(c)
                
            elif c not in rep:
                ch.remove(c)
                rep.append(c)
      #  print(ch)
        if len(ch)==0:
            ans=-1
        else:
            ans=s.find(ch[0])
        return ans
