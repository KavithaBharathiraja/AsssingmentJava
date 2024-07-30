package InterviewPreparationAssignments;

public class Q2_StringContainsonlyDigits {

	
	// 2. 2.How to check if a String contains only digits
	
	public static void main(String[] args) {
		
		
		String str = "i love java coding123";
		boolean foundDigits = false;
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
                foundDigits = true;
                break;
	}

		}		
			
			if (foundDigits) {
	            System.out.println("yes");
	        } else {
	            System.out.println("no");
	        }
}
}