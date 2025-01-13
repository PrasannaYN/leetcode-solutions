/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 *
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/
 *
 * algorithms
 * Easy (49.91%)
 * Likes:    1343
 * Dislikes: 224
 * Total Accepted:    165.1K
 * Total Submissions: 330.3K
 * Testcase Example:  '26'
 *
 * Given a 32-bit integer num, return a string representing its hexadecimal
 * representation. For negative integers, two’s complement method is used.
 * 
 * All the letters in the answer string should be lowercase characters, and
 * there should not be any leading zeros in the answer except for the zero
 * itself.
 * 
 * Note: You are not allowed to use any built-in library method to directly
 * solve this problem.
 * 
 * 
 * Example 1:
 * Input: num = 26
 * Output: "1a"
 * Example 2:
 * Input: num = -1
 * Output: "ffffffff"
 * 
 * 
 * Constraints:
 * 
 * 
 * -2^31 <= num <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    private static Map<Integer, Character> map = new HashMap<>();
    static {
        map.put(0, '0');
        map.put(1, '1');
        map.put(2, '2');
        map.put(3, '3');
        map.put(4, '4');
        map.put(5, '5');
        map.put(6, '6');
        map.put(7, '7');
        map.put(8, '8');
        map.put(9, '9');
        map.put(10, 'a');
        map.put(11, 'b');
        map.put(12, 'c');
        map.put(13, 'd');
        map.put(14, 'e');
        map.put(15, 'f');
    }
    
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        
        int mask = 0xf;
        StringBuilder hex = new StringBuilder();
        while (num != 0) {
            hex.append(map.get(num & mask));
            num >>>= 4;
        }
        
        return hex.reverse().toString();
    }
}
// @lc code=end

