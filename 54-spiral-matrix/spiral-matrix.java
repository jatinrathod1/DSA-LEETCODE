class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                list.add(matrix[startRow][j]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }
            if (startRow < endRow && startCol < endCol) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    list.add(matrix[endRow][j]);
                }
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    list.add(matrix[i][startCol]);
                }
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        return list;
    }
}