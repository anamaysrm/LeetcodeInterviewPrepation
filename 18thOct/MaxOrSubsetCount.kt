Leetcode -> 2044. Count Number of Maximum Bitwise-OR Subsets
Link -> https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/description/?envType=daily-question&envId=2024-10-18

  Approach 1:-

  class Solution {
    var maxItem = Int.MIN_VALUE
    fun countMaxOrSubsets(nums: IntArray): Int {
       val ans = arrayListOf<Int>() 
       val n = nums.size
       var count = 0
       helper(nums, 0,n-1, 0, ans) 

       ans.forEach {
        if(maxItem == it) count++
       }
    return count
    }

    fun helper(nums : IntArray, l:Int, r:Int, numOr:Int, ans:ArrayList<Int>) {
        if(l>r) {
         ans.add(numOr) 
         if(maxItem<numOr) maxItem = numOr  
         return
        }

        // element participates
        helper(nums, l+1, r, numOr or nums[l], ans)

        // element do not participate
        helper(nums, l+1, r, numOr, ans)
    }
}

  T.C = O(2^n)
  S.C = O(n)

  Approach 2 :- In order to optimise it we will not use the arraylist to store the subset xor values , instead we are confirm that the OR will be max of the complete array. 
  So we will calculate the OR of the complete array first and then find the subsets currOr and compare it with maxOr to get the total count.

class Solution {
  var count = 0
  fun countMaxOrSubsets(nums:IntArray):Int {
    var maxOr = 0 
    nums.forEach{ 
    maxOr = maxOr or it  
    }

   helperFunc(nums, 0, nums.size-1, maxOr, 0)
   return count
}
  
   fun helperFunc(nums:IntArray, l:Int, r:Int, maxOr:Int, targetOr:Int) {
      if(l > r) {
        if(maxOr == targetOr) count++
        return
    }

      // element participates
      helperFunc(nums, l+1, r, maxOr, targetOr or nums[l])

      // do not participate
      helperFunc(nums, l+1, r, maxOr, targetOr)
}
}

T.C. -> O(2^n)
S.C. -> O(n) (Max depth of the stack)
  
