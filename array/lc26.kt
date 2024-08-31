Leetcode 26
Link -> https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

Approach 1 -> 

fun removeDuplicates(nums: IntArray): Int {
      var index = 0
      val size = nums.size

      for(i in 1 until size) {
        if(nums[index]!=nums[i]) {
            index++
            var temp = nums[index]
            nums[index] = nums[i]
            nums[i] = temp
        }  
      }
  return index+1
    }
Time complexity -> O(nums.size)
Space Complexity -> O(1)

Note :- Use two pointer , one slow and other fast to iterate throughout the array.
