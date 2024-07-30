package InterviewPreparationAssignments;

public class Q13_oddnumberinArray {
	
	public static void main(String[] args) {
		
		
		 //13. Given an array of integers, print only odd numbers array[]={3,8,6,14,5,17,19}

		int  array [] = {3, 8, 6, 14, 5, 17, 19};
		
		
		for(int num: array) {
			
			if(num %2 != 0) {
				
				System.out.print("odd numbers are: "+ num + " ");
			}
		}
		
				
	}
		

}
