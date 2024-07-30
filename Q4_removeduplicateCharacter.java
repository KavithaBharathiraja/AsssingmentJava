package InterviewPreparationAssignments;

import java.util.HashMap;

public class Q4_removeduplicateCharacter {

	public static void main(String[] args) {
		
		// # 4.How to remove duplicate characters from String?
		
		
		
     String Str = "I love java Coding";
		
		Str = Str.toLowerCase().replace(" ", "");
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		
		for(char c : Str.toCharArray() ) {
			
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c) +1);	
				
			}else {
				
				map.put(c, 1);
			}
		}
		
		
   StringBuilder SB = new StringBuilder();
		 
		 for(char c : Str.toCharArray() ) {
			 
			 if(map.containsKey(c)) {
			 
			 if(map.get(c) == 1) {
				
				 SB.append(c);
			 }
		 }
		
				
		
	}
		
		 System.out.println("uniquecharacters are: "+ SB );
		 
	}
	   }

		
		

	


