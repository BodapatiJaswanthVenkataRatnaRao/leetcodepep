class Solution {
    public int minAddToMakeValid(String s) {
        
                Stack<Character> stack = new Stack<>();
              for(int i=0;i<s.length();i++){

            if(stack.empty())
{
    stack.push(s.charAt(i));
    continue;
}                if(s.charAt(i)=='('){
                    stack.push('(');
                }
                else if(stack.peek()=='('){
                    stack.pop();
                    
                }
                else{
                    stack.push(s.charAt(i));
                }
              }
              return stack.size();
    }
}