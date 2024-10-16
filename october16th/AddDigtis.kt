Leetcode : 258 Add Digits
link -> https://leetcode.com/problems/add-digits/description/

Approach 1
Using Recursion :-

  class Solution {
    fun addDigits(num: Int): Int {
      if(num/10 ==0) return num
      
      val newNum = sumOfNumDigits(num)
      return addDigits(newNum)     
    }

    fun sumOfNumDigits(n : Int) : Int {
      var sum = 0
      var k = n

      while(k>0) {
        sum += k%10
        k /= 10
      }
     return sum
    }
}

  T.C. ->
  S.C.-> 


  But the problem is said to be solved in O(1) time.

Approach 2: Iterative 

class Solution {
    fun addDigits(num: Int): Int {
      var k = num
      var digitRoot = 0

      while(k>0) {
        digitRoot += k%10
        k /= 10

        if(k==0 && digitRoot>9) {
          k = digitRoot  
          digitRoot = 0
        }
      }
      return digitRoot   
    }
}

T.C. -> O(log(N))
S.C ->


Approach 3:- Final Best solution O(1)

class Solution {
    fun addDigits(num: Int): Int {
       if(num ==0) return 0

       return if(num%9 ==0) 9
       else num%9
    }
}

T.C -> O(1)
S.C -> O(1)





  
