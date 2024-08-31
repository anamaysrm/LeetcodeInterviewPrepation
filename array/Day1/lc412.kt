Leetcode 412

Link -> https://leetcode.com/problems/fizz-buzz/description/

Approach 1 -> 

 fun fizzBuzz(n: Int): List<String> {
      val ans = arrayListOf<String>()  
    
      for(i in 1..n) {
        if(i%3==0 && i%5==0) {
         ans.add("FizzBuzz")  
        } else if(i%3 ==0) {
            ans.add("Fizz")
        } else if(i%5 ==0) {
           ans.add("Buzz")
        } else {
            ans.add("$i")
        }
      }
return ans
    }

Note -> Just iterate the number n , n times and check each condition for divisibility and get the solution.
