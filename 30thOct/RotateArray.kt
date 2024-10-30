Leetcode No-> 189 Rotate Array
Link -> https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

Approach 1 -> Using extra res array

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
      val n = nums.size
      val res = IntArray(n)
  
      var l = k%n

      for(i in 0 until n) {
         res[(i+l)%n] = nums[i]
      } 

      for(i in 0 until n) {
        nums[i] = res[i]
      }
    }
}

T.C. -> o(n)
S.C -> o(n)

Approach 2 -> Using reversal technique

class Solution {

  fun rotate(nums:IntArray, k:Int) : Unit {
    val n = nums.size

    reverse(nums,0, n-1)
    reverse(nums, 0, k-1)
    reverse(nums, k, n-1)
  }

  fun reverse(nums:IntArray,start:Int, end:Int) {
   var l = start
   var r = end
    while(l<r) {
     var temp = nums[l]
     nums[l] = nums[r]
      nums[r] = temp
      l++
      r--
    }
  }
}
T.C -> O(n)
S.C. -> O(1)
