class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
        Map<Character,Character> map=new HashMap();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if (c=='(' || c=='{' || c=='[' )
                 stack.push(map.get(c));
            else
            {
                if (stack.empty())
                    return false;
                char p=stack.peek();
                if (p==c)
                {
                    stack.pop();
                    continue;
                }
                else
                    return false;
            }
                
        }
        if (stack.empty())
            return true;
        else
            return false;
    }
}
