package InterviewPreparationAssignments;

public class Q14_ProgrammingConstructor {

//14.Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed. 
	
	
	public Q14_ProgrammingConstructor () {
		
		System.out.println("I love doing coding");
	}
	
   public Q14_ProgrammingConstructor (String str) {
		
		System.out.println("I love doing coding" +str);
	}
	
	
	public static void main(String[] args) {
		
		
		Q14_ProgrammingConstructor defaultconstructor = new Q14_ProgrammingConstructor();
		
		Q14_ProgrammingConstructor parameterized = new Q14_ProgrammingConstructor("java");
		Q14_ProgrammingConstructor parameterized1 = new Q14_ProgrammingConstructor("python");

	}

}
