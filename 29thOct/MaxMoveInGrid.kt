Leetcode 2684
Link -> Maximum Number of Moves in a Grid
https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/?envType=daily-question&envId=2024-10-29

Approach 1 -> Using Backtracking

class Solution {
    var maxMove = 0
    fun maxMoves(grid: Array<IntArray>): Int {
     val m = grid.size
     val n = grid[0].size 

      for(i in 0 until m) {
         helper(i, 0, grid, 0)
      }
    return maxMove    
    }

    fun helper(row : Int, col:Int, grid : Array<IntArray>, move : Int) {

        if(row<0 || row>=grid.size || col>=grid[0].size) {
            return
        }

        maxMove = Math.max(maxMove, move)

        if(row-1>=0 && col+1<grid[0].size && grid[row-1][col+1]>grid[row][col]) {
         helper(row-1, col+1, grid, move+1)
         }
        
        if(col+1<grid[0].size && grid[row][col+1]>grid[row][col]){
            helper(row,col+1, grid, move+1)
        }

        if(row+1<grid.size && col+1<grid[0].size && grid[row+1][col+1]>grid[row][col]) {
          helper(row+1, col+1, grid, move+1)
        }
    }
}

T.C -> O(3^(n*m))
S.C -> O(n) (n is the column)

Approach 2 -> Dp Approach Top Down approach.

    class Solution {
    fun maxMoves(grid: Array<IntArray>): Int {
     val m = grid.size
     val n = grid[0].size 
     var maxMoves = 0

     val memo = Array<IntArray>(m) {IntArray(n) {-1}}
      for(i in 0 until m) {
       maxMoves = Math.max(maxMoves,helper(i, 0, grid, memo))
      }
    return maxMoves   
    }

    fun helper(row : Int, col:Int, grid : Array<IntArray>, memo : Array<IntArray>) : Int {

        if(memo[row][col]!=-1) return memo[row][col]

        var maxMove = 0

        if(row-1>=0 && col+1<grid[0].size && grid[row-1][col+1]>grid[row][col]) {
         maxMove = 1 + helper(row-1, col+1, grid, memo)
         }
        
        if(col+1<grid[0].size && grid[row][col+1]>grid[row][col]) {
            maxMove = Math.max(maxMove, 1 + helper(row,col+1, grid, memo))
        }

        if(row+1<grid.size && col+1<grid[0].size && grid[row+1][col+1]>grid[row][col]) {
          maxMove = Math.max(maxMove,1 + helper(row+1, col+1, grid, memo))
        }
        memo[row][col] = maxMove 
        return memo[row][col]
    }
}

T.C -> O(3(m*n)) ->O(mn)
S.C -> o(m*n)
    
