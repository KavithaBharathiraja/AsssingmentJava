package InterviewPreparationAssignments;

public class Q12_average2D {

	
		
	   public static void main(String[] args) {
		
	    	
	        int[][] scores = {
	            {60, 55, 70},
	            {80, 60, 41}
	        };

	        double[] averages = new double[scores.length];

	        for (int i = 0; i < scores.length; i++) {
	            int sum = 0;
	            for (int j = 0; j < scores[i].length; j++) {
	                sum += scores[i][j];
	            }
	            averages[i] = sum / (double) scores[i].length;
	        }

	        for (int i = 0; i < averages.length; i++) {
	            System.out.println("Average score of student " + (i + 1) + ": " + averages[i]);
	        }
	    
	}

}	
	

