Leetcode -> 2501
Link-> https://leetcode.com/problems/longest-square-streak-in-an-array/?envType=daily-question&envId=2024-10-28

Approach 1 -> Using Set 

  class Solution {
    fun longestSquareStreak(nums: IntArray): Int {
      val setData = hashSetOf<Int>()
      
      for(num in nums) {
        setData.add(num)
      }
      var ans = 0
      for(num in nums) {
        var len = 0
        var current = num.toLong()
        while(setData.contains(current.toInt())) {
            len++

            if(current*current > 1e5) break

            current *= current
        }
        ans = Math.max(ans, len)     }
     return if(ans<2) -1 else ans
    }
}

  T.C -> O(n)
  s.c. -> O(n)

  Approach 2 -> Using sorting technique

  class Solution {
    fun longestSquareStreak(nums: IntArray): Int {
      val n = nums.size
      var ans = -1
      nums.sort()
      
      for(i in 0 until n) {
        var pow:Long = (nums[i] * nums[i]).toLong()
        if(searchEle(nums,i+1, n-1, pow)) {
        var len = 1
        while(searchEle(nums,0, n-1, pow)) {
            len++
            pow = pow*pow
        }
       ans = Math.max(ans, len)
      }
      }
      return ans
    }

    fun searchEle(nums : IntArray, low:Int, high:Int, target:Long): Boolean{
        var l = low
        var h = high
        while(l<=h) {
        var mid = l + (h - l)/2  
        if(nums[mid].toLong()==target) return true    
        else if(nums[mid].toLong()>target) h = mid-1
        else l = mid + 1
        }
        return false
    }
}

  T.C. -> O(n(log(n)))
  S.C -> O(log(n))
