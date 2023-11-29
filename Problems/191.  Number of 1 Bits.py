#ounting each bit manually, left shift the number and check if there is one at last by taking modulus with 2
# time complexity O(32), since it is given as a contraint that the number has to be 32 bit
class Solution:
    def hammingWeight(self, n: int) -> int:
        count = 0
        while n:
            count += n%2
            n = n >> 1
        return count

