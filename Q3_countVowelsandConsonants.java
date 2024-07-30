package InterviewPreparationAssignments;

public class Q3_countVowelsandConsonants {
//3.How to count a number of vowels and consonants in a String?
	
	
	public static void main(String[] args) {
		
    String str = "i love python coding";
        
        String vowels = "aeiouAEIOU";
        int vowelsCount = 0;
        int consonantsCount = 0;
        
        
        for (char c : str.toCharArray()) {
           
            if (Character.isLetter(c)) {
              
                if (vowels.indexOf(c) != -1) {
                	
                    vowelsCount++;
                    
                } else {
                	
                    consonantsCount++;
                    
                }
            }
        }
        

        System.out.println("vowels_count: " + vowelsCount);
        System.out.println("consonants_count: " + consonantsCount);
    }
		
	}


