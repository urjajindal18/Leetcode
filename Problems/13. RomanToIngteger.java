class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanChar= new HashMap();
        romanChar.put('I',1);
        romanChar.put('V',5);
        romanChar.put('X',10);
        romanChar.put('L',50);
        romanChar.put('C',100);
        romanChar.put('D',500);
        romanChar.put('M',1000);
        int l=s.length();
        l=l-1;
        int number=romanChar.get(s.charAt(l));
        for(int i=l-1;i>=0;i--)
        {
            if(romanChar.get(s.charAt(i))<romanChar.get(s.charAt(i+1)))
                number-=romanChar.get(s.charAt(i));
            else
                number+=romanChar.get(s.charAt(i));
        }
        return number;
    }
}
