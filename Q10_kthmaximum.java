package InterviewPreparationAssignments;

import java.util.Arrays;

public class Q10_kthmaximum {

	public static void main(String[] args) {
		int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int k = 3;

        Arrays.sort(array);
        
        int [] kLargest = new int [k];
        
        int n = array.length;
        
        for(int i =0; i< k; i++) {
        	
        	kLargest[i] = array[n-1-i];	
        	
        }
        
        System.out.println(Arrays.toString(kLargest));
        
        
	}

}
