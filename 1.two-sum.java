/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        System.out.println(nums.length);

        for(int i = 0 ;i < nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

