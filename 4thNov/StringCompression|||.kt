Leetcode no. -> 3163 String Compression III
Link -> https://leetcode.com/problems/string-compression-iii/description/?envType=daily-question&envId=2024-11-04

Approach 1 -> So in this I am using a len variable to store the count of all the charecters in the string and as soon as the new charecter is introduced then change len to 1 and put the data in stringBuilder count and charecter the i-1th.
At last print the last charecter will work for both the cases 1. equal char till last and second a char came at last then as well.

  class Solution {
    fun compressedString(word: String): String {
      var len = 1
      val n = word.length
      val newStr = StringBuilder()
      for(i in 1 until word.length) {
        if(word[i] == word[i-1] && len<9) {
            len++
        } else {
            newStr.append("${len}${word[i-1]}")
            len = 1
        }
      }
      newStr.append("${len}${word[n-1]}") 
      return newStr.toString()    
    }
}

  T.C -> O(words.length)
  S.C -> O(K)

  
