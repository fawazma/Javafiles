
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line = "I hate you. ";
		String newLine;
		
		System.out.println("The line of text to be changed is: ");
		System.out.println("I have rephrased that line to read: ");
		
		int hateIndex = line.indexOf("hate");
		newLine = line.substring(0, hateIndex) +"love"+line.substring(hateIndex + 4);
		
		System.out.println(newLine);
		
	}

}
