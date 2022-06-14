/** I'll add the definition in a bit. #lazyrn
  */

class Solution {
    public boolean isPalindrome(int x) {
        
        // variables to test if input is a palindrome
        
        int numIn = x, reverseNum = 0;
        
        // if the input is negative, automatically not a palindrome
        if (numIn < 0)
            return false;
        
        // otherwise loop through the input number to create the reverse
        
        for(; numIn != 0; numIn /= 10){
        // single out each digit
            int digit = numIn % 10;
        
        // and add it to the reverse number
            reverseNum = reverseNum * 10 + digit;
            
        }
                
        // compare the input with the reverse and return true if they are the same
        return (x == reverseNum) ? true : false;
        
    }
}
