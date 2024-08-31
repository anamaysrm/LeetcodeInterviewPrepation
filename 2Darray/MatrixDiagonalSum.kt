Leetcode 1572 - Matrix Diagonal Sum

link -> https://leetcode.com/problems/matrix-diagonal-sum/description/

Approach 1 ->

 fun diagonalSum(mat: Array<IntArray>): Int {
       val n = mat.size
       val mid = n/2
       var sum = 0

       for(i in 0 until n) {
        sum += mat[i][i]

        sum += mat[i][n-1-i]
       }

       if(n%2!=0)
       sum -= mat[mid][mid]
       return sum
    }

 T.C = O(n)
 S.C = O(1)

 Note -> 1. Iterate till n from 0.
2. Keep adding the sum of both the primary and diagonal matrix.
3. At last substract the mid of the diagonal sum added twice in case of odd number of matrix size.
4. if matrixSize%2 != 0 remove the duplicate mid value.
5. return sum.
