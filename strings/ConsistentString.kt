Leetcode -> 1684. Count the Number of Consistent Strings
Link -> https://leetcode.com/problems/count-the-number-of-consistent-strings/description/?envType=daily-question&envId=2024-09-12

Please try a different approach as well using BIT MANIPULATION.

Approcach 1 ->

   fun countConsistentStrings(allowed: String, words: Array<String>): Int {
      val freqArr = IntArray(26)
      var ans = 0

      allowed.forEach {
        freqArr[it - 'a'] = 1 
      }

      for(word in words) {
        if(checkIfConsistent(word, freqArr)) ans++
      }
  return ans
    }

    fun checkIfConsistent(word : String, freqArr : IntArray) : Boolean{
       word.forEach {
         if(freqArr[it - 'a']==0) return false
       }
       return true
    }

    Note -> Use the concept of frequency Array of fixd size 26. It does'nt depend on N(input size).
  
