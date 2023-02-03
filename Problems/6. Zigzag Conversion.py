class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        c=0
        index=0
        r=numRows
        res=''
        if len(s)<=numRows or r==1:
            return s
        for n in range(numRows):
            i=n
            flag=0
            index=i
            while(i<len(s)):
                res+=s[i]
                if (c==r/2):
                    i=i+r-1
                    index=i
                else:
                    if flag==0:
                        i=i+2*(r-n-1)
                        flag=1
                        if(index==i):
                            i=i+2*n
                            flag=0
                        index=i
                    else:
                        i=i+2*n
                        flag=0
                        if index==i:
                            i=i+2*(r-n-1)
                            flag=1
                        index=i
        return res

                
