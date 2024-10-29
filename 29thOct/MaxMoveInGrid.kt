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
S.C -> O(n*m)

Approach 2 ->
  
