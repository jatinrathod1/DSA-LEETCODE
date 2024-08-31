class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            // primary diagonal
            sum = sum + mat[i][i];// 00 11 22 33
            // secodary diagonal; i+j=n-1; i+j=matrix.length-1;
            if (i != mat.length - 1 - i)
                sum = sum + mat[i][mat.length - 1 - i];// 03 12 21 30
        }
        return sum;
    }
}