/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> open_characters = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' ||s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                open_characters.push(s.charAt(i));
                continue;
            }
            
            if(!open_characters.empty())
            {
                if( ( s.charAt(i) == ')' && open_characters.peek() == '(' ) || ( s.charAt(i) == ']' && open_characters.peek() == '[' ) || ( s.charAt(i) == '}' && open_characters.peek() == '{' ) )
                {
                    
                    open_characters.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }


        }

        if(open_characters.empty())
        {
            return true;
        }
        
        return false;

    }
}
// @lc code=end

