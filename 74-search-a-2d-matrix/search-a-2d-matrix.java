class Solution {
    public boolean searchMatrix(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("key is found at" + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println(" key is not found");
        return false;
    }
}