import java.util.Scanner;
public class Problem2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first, last, PigFirst, PigLast;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		first = keyboard.next().toLowerCase();
		System.out.println("Enter last name: ");
		last = keyboard.next().toLowerCase();
		
		 PigFirst = first.substring(1, 2).toUpperCase();
		 PigLast = last.substring(1, 2).toUpperCase();
		  
		 PigFirst += first.substring(2);
		 PigLast += last.substring(2);
		  
		 PigFirst += first.substring(0, 1);
		 PigLast += last.substring(0, 1);
		  
		 PigFirst += "ay";
		 PigLast += "ay";
		 
		 String newName = PigFirst + " " + PigLast;
		 System.out.println("Pig latin name is: ");
		 System.out.println(newName);
	}

}
