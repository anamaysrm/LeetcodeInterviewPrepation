Leetcode -> 2149 Rearrange Array Elements by Sign
Link -> https://leetcode.com/problems/rearrange-array-elements-by-sign/description/


  Approach 1 -> Using the two pointer technique.

  class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
       val n = nums.size 
       val posArr = IntArray(n/2)
       val negArr = IntArray(n/2)
       val modArr = IntArray(n)
       var k= 0
       var g = 0 

      for(i in 0 until n) {
        if(nums[i]>0) posArr[k++] = nums[i]
        else negArr[g++] = nums[i]
      }
     var h = 0
     for(i in 0 until n/2) {
       modArr[h++] = posArr[i]
       modArr[h++] = negArr[i]   
     }
    
    return modArr
       }   
}
T.C. -> O(n)
S.C. -> O(n)

Approach 2 -> Brute force Using extra positive and negative space.

class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
       val n = nums.size 
       val posArr = IntArray(n/2)
       val negArr = IntArray(n/2)
       val modArr = IntArray(n)
       var k= 0
       var g = 0 

      for(i in 0 until n) {
        if(nums[i]>0) posArr[k++] = nums[i]
        else negArr[g++] = nums[i]
      }
     var h = 0
     for(i in 0 until n/2) {
       modArr[h++] = posArr[i]
       modArr[h++] = negArr[i]   
     }
    
    return modArr
       }   
}

T.C. -> O(n)
S.C. -> O(n)

  
