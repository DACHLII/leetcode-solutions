/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        // babad
        int mid = 0;
        int count = 0;
        //String bestSubstring = s.substring(0, 1);
        // boolean isEven = s.length() %2 == 0 ? true : false;

        for (; mid < s.length(); mid++) {
            int left = mid;
            int right = mid;
            String currSubstring = "";
            while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
                currSubstring = s.substring(left, right + 1);
                left--;
                right++;
                count++;

            }

            left = mid;
            right = mid + 1;
            currSubstring = "";
            
            while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
                currSubstring = s.substring(left, right + 1);
                left--;
                right++;
                count++;

            }


            left = mid;
            right = mid;

            

        }
        return count;
    }
}
// @lc code=end

