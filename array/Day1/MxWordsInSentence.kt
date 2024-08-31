Letcode 1929 -> Maximum Number of Words Found in Sentences

Link -> https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

Approach 1 ->

  fun mostWordsFound(sentences: Array<String>): Int {
      val n = sentences.size
      var max = Int.MIN_VALUE
      for(item in sentences) {
        var curr_max = 0
        item.forEach { it ->
          if(it == ' ') curr_max++      
        }
        max = Math.max(max , curr_max+1)  
      }
  return max
    }

  T.C -> O(N)
  S.C -> O(N)

  Note -> Create 2 max values one curr and other final and keep updating based on each strings result while iterating the whole Array<String>.
