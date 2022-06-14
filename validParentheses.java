/** Problem description:
  * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
  * determine if the input string is valid. An input string is valid if:
  *   1. Open brackets must be closed by the same type of brackets.
  *   2. Open brackets must be closed in the correct order.
  */

class Solution {
    public boolean isValid(String s) {
        
        // if the length of 's' is odd, there is an open bracket somewhere
        // so we don't need to verify the rest of the string
        if(s.length() % 2 != 0) return false;
        
        // use a stack to manage the string data
        Stack <Character> stack = new Stack<>();
        
        // iterate through the string
        for(char c: s.toCharArray()){
            
            // if 'c' matches an opening bracket in the stack, pop it
            if(c == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            
            // otherwise, push it onto the stack
            else{
                stack.push(c);
            }
        }
        
        return stack.isEmpty();        
    }
}
