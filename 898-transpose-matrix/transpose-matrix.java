class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] tr = new int[n][m];

        for (int i = 0; i < m; i++) {   // raw
            for (int j = 0; j < n; j++) { // raw ni coloums
                tr[j][i] = matrix[i][j];
            }
        }

        return tr;
    }
}