public class MatrixMultiplication {
    public static void main(String[] args) {
        
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        
        int[][] result = multiplyMatrices(A, B);

        
        System.out.println("Resulting Matrix:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int m = A.length; 
        int n = A[0].length; 
        int p = B[0].length; 

    
        int[][] C = new int[m][p];

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
}

