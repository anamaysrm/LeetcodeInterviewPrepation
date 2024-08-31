Leetcode 1929 -> Concatenation of Array

Link -> https://leetcode.com/problems/concatenation-of-array/description/

Approach 1 ->

   fun getConcatenation(nums: IntArray): IntArray {
     return IntArray(2*nums.size) { nums[it%nums.size] }
    }

   T.C -> O(N)
   S.C -> O(N)

   Note -> Just use the technique of % to travel in intervals.
