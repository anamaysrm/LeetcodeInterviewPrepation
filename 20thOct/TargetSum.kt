Leetcode No-> 494
Target Sum
Link -> https://leetcode.com/problems/target-sum/description/

Approach 1->

  class Solution {
    var sol = 0
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        val n = nums.size-1
        helper(nums, 0, n, 0, target)
        return sol
    }

    fun helper(nums:IntArray, l:Int, r:Int,currSum:Int, target:Int) {
       if(l>r){
        if(currSum==target) sol++
        return;
       }   

       // symbol + taken care off
       helper(nums, l+1, r, currSum + nums[l], target)

       // symbol - taken care off
       helper(nums, l+1, r, currSum - nums[l], target)
    }
}

  T.C -> O(2^n)
  S.C.-> O(2^n)

  
