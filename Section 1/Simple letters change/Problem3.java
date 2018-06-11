
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String first = "John", last = "Doe", pigFirst, pigLast;
		  
		  pigFirst = first.substring(1, 2).toUpperCase();
		  pigLast = last.substring(1, 2).toUpperCase();
		  
		  pigFirst += first.substring(2);
		  pigLast += last.substring(2);
		  
		  pigFirst += first.substring(0, 1);
		  pigLast += last.substring(0, 1);
		  
		  pigFirst += "ay";
		  pigLast += "ay";
		  
		  String newName = pigFirst + " " + pigLast;
		  System.out.println(newName);
		  
	}
}
