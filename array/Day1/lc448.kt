Leetcode Number 448
Link -> https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

Approach ->

 fun findDisappearedNumbers(nums: IntArray): List<Int> {
        var size = nums.size
        var i = 0
        var ans = arrayListOf<Int>()

        while(i < size) {
            var currIndex = nums[i] - 1
            if(nums[i] != nums[currIndex]) {
               var temp = nums[i]
               nums[i] = nums[currIndex]
               nums[currIndex] = temp   
            } else i++
        }

      for(i in 0 until size) {
        if(nums[i]!=i+1) ans.add(i+1)
      }  
      return ans
    }

 S.C = O(1) (Excluding the space of return type as mentioned in the question)
 T.C = O(N) where N is the size of the Input Array
