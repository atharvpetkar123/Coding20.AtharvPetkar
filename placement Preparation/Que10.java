//2D matrix question - Find row with maximum no. of 1’s in java
class MaxOnesRow {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 1}
        };

        int maxOnesRowIndex = findMaxOnesRow(matrix);

        System.out.println("Row with maximum 1's is: " + maxOnesRowIndex);
    }

    public static int findMaxOnesRow(int[][] matrix) {
        int maxOnesCount = 0;
        int maxOnesRowIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRowIndex = i;
            }
        }

        return maxOnesRowIndex;
    }
}
