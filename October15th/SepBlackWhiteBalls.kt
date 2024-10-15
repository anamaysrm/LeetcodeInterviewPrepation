Leetcode number -> 2938
Link -> https://leetcode.com/problems/separate-black-and-white-balls/?envType=daily-question&envId=2024-10-15

Approach 1
Two Pointers 

class Solution {
    fun minimumSteps(s: String): Long {
      var whitePosition = 0
      var totalSwaps = 0L

      for(currPosition in 0 until s.length) {
         if(s[currPosition] == '0') {
          totalSwaps += currPosition - whitePosition

          whitePosition++  
         } 
      }
      return totalSwaps  
    }
}

T.C = O(N) , where N is the length of the string
S.C = O(1)

Approach 2 
Counter 

class Solution {
    fun minimumSteps(s: String): Long {
      var totalBlackCount = 0L
      var totalSwaps = 0L

      for(i in 0 until s.length) {
          if(s[i] == '0') {
           totalSwaps += totalBlackCount
          }
          else {
            totalBlackCount++
          }
      } 
      return totalSwaps 
    }}

T.C = O(N) , where N is the length of the string
S.C = O(1)
