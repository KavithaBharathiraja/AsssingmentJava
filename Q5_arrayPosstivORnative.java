package InterviewPreparationAssignments;

public class Q5_arrayPosstivORnative {

	public static void main(String[] args) {
		// 5.WJP to check if Number is Positive or Negative using If loop.

		 int [] array  = {0, 3, 4, -1};
		 
		 
		 for(int i = 0; i< array.length; i++ ) {
			 
			 if(i > 0) {
				 
				 System.out.println(i + " is positive");
			 }else if(i < 0){
				 
				 System.out.println(i + " is negative");	 
			 }else {
				 
				 System.out.println(i + " is zero");	
			 }
		 }
		 
		
		
		
		
		
		
	}

}
