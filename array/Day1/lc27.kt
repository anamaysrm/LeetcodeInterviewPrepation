Leetcode problem -> 27
Link -> https://leetcode.com/problems/remove-element/

Approach 1 -> 
Solution :  
fun removeElement(nums: IntArray, `val`: Int): Int {
      var i = 0
      var j = nums.size-1

      while(i < j) {
         if(nums[i]==`val` && nums[i]!=nums[j]) {
            var temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
         } else if(nums[i]!=`val`) {
            i++
         } else {
            j--
         }
      }
      var k = 0
   for(i in 0 until nums.size) {
      if(nums[i]!=`val`)  k++ 
      else return k
   }
   return k
    }
Time Complexity -> O(nums.size)
Space Complexity -> O(1)

Note :- This problem can be solved in place by just moving the elements which are equal to `val` at the end and bringing all the remaining elements to front by swapping technique.

// 
Approach 2 ->

fun removeElement(nums: IntArray, `val`: Int): Int {
      var index = 0

      for(i in 0 until nums.size) {
        if(nums[i]!=`val`) {
            nums[index] = nums[i]
            index++
        }
      }
  return index
    }
  
Time Complexity -> O(nums.size)
Space Complexity -> O(1)

Note -> Itrate the whole array once with 2 indexs, one i to iterate the whole array and second "index" to place the non `val` elements in starting.

