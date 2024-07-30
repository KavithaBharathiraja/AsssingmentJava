package InterviewPreparationAssignments;

public class Q11_threedTo2DArray_11 {
	
	public static void main(String[] args) {
		
		
		int[][] originalArray = {
	            {10, 20, 30},
	            {40, 50, 60}
	        };
		int rowCount = originalArray.length;
        int colCount = originalArray[0].length;
        int[][] transposedArray = new int[colCount][rowCount];

		
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
		
            for (int[] row : transposedArray) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
			
	}

		            		  
	}
	}
	

