Leetcode number -> 1545
Link -> https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/?envType=daily-question&envId=2024-10-19

Approach 1-> Using recursion generating the string and finding the Kth Bit

class Solution {
    fun findKthBit(n: Int, k: Int): Char {
      val nthString = helper(n)
      return nthString[k-1]    
    }

    fun helper(n : Int) : String {
        if(n==1) return "0"
        
        val str = helper(n-1)
        return str + "1" + reverse(invertStr(str))
    }

    fun reverse(revStr : String) : String {
     val charArr = revStr.toCharArray()
     charArr.reverse()
     return String(charArr)
    }

    fun invertStr(str:String) : String {
      val strNew = StringBuilder()
      for(i in 0 until str.length) {
        if(str[i] == '0') strNew.append('1')
        else strNew.append('0')
      }
      return strNew.toString()
    }
}

T.C. -> O(2^n)
S.C -> O(2^n)

Approach 2 -> Optimised , instead of geneating the strings for Sn , we will play with length of the string based on observation which is 2^n -1 



  class Solution {
    fun findKthBit(n: Int, k: Int): Char {
      val length = (1 shl n) - 1
     return findKthBitHelper(n, k, length) 
    }

    fun findKthBitHelper(n:Int, k:Int, length:Int): Char {
       if(n == 1) return '0'
       val mid = (length+1)/2

       if(k == mid) return '1'
       else if(k<mid) return findKthBitHelper(n-1, k, (length-1)/2)

       else {
         val reverseInd = length - k + 1
        val bit = findKthBitHelper(n-1, reverseInd, (length-1)/2)
        return if(bit == '0') '1' else '0'
       }
    }
}











  



  
