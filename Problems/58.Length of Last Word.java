class Solution {
    public int lengthOfLastWord(String s) {
        if (s==null || s.length()==0)
            return 0;
        int len = s.length();
		int i = len - 1;
		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}
		if (i == -1) {
			return 0;
		}
		int count = 0;
		while (i >= 0 && s.charAt(i) != ' ') {
			count++;
			i--;
		}
		return count;
    }
}
