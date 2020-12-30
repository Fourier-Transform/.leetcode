import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int[] ret = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hashmap.containsKey(diff)){
                ret[0] = hashmap.get(diff);
                ret[1] = i;
            }else{
                hashmap.put(nums[i], i);
            }
        }
        return ret;
    }
}
// @lc code=end

