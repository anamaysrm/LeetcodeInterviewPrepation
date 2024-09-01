Leetcode 11 -> Container With Most Water

Link -> https://leetcode.com/problems/container-with-most-water/description/

Approach 1 -> O(N^2)
Note -> Two pointers i , j (One beside the other and iterate it to get the max_count).

Approach 2 -> 

  fun maxArea(height: IntArray): Int {
       val n = height.size  
       var i = 0
       var j = n-1
       var max_area = Int.MIN_VALUE

       while(i < j) {
         val indxDiff = j - i
         val minHeight = Math.min(height[i],height[j])
         val curr_area = indxDiff*minHeight
         max_area = Math.max(max_area,curr_area)
        
        if(height[i] > height[j]) {
            j--
        } else i++
       } 
       return max_area   
    }

T.C -> O(N)
S.C -> O(1)

Note -> Using two pointers , from start and end we can solve this problem, and at each point we can pick the max one(from nums[i] and nums[j]).
