Leetcode 2914. Minimum Number of Changes to Make Binary String Beautiful

Link -> https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description/?envType=daily-question&envId=2024-11-05

Approach 1 ->

  class Solution {
    fun minChanges(s: String): Int {
    var count = 0
     
    for(i in 1 until s.length step 2) {
       if(s[i]!=s[i-1]) {
        count++  
       }
    } 
 return count
    }
}

  T.C -> O(n)
  S.C -> O(1)
