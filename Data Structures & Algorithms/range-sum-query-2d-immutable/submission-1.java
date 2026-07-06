/*Range Sum Query 2D Immutable
Medium
Topics
Company Tags
You are given a 2D matrix matrix, handle multiple queries of the following type:

Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
Implement the NumMatrix class:

NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
You must design an algorithm where sumRegion works on O(1) time complexity.
*/
//brute force solution
// class NumMatrix {
//     private int[][] num_matrix;
//     public NumMatrix(int[][] matrix) {
//         this.num_matrix = matrix;
//     }
    
//     public int sumRegion(int row1, int col1, int row2, int col2) {
//         int sum = 0;
//         for (int i = row1; i <= row2; i++){
//             for (int j = col1; j <= col2; j++){
//                 sum = sum + num_matrix[i][j];
//             }
//         }
//         return sum;
//     }
// }

class NumMatrix {
    private int[][] num_matrix;
    public NumMatrix(int[][] matrix) {
        int column_length = matrix[0].length+1;
        num_matrix = new int[matrix.length+1][column_length];
        for (int i = 0; i < matrix.length+1; i++){
            for (int j = 0; j < column_length; j++){
                if (i == 0 || j == 0){
                    num_matrix[i][j] = 0; 
                }
                else{
                    num_matrix[i][j] = matrix[i-1][j-1]
                    + num_matrix[i-1][j]
                    + num_matrix[i][j-1]
                    - num_matrix[i-1][j-1];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return num_matrix[row2+1][col2+1] - num_matrix[row1][col2+1] - num_matrix[row2+1][col1] + num_matrix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */