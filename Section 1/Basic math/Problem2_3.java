import java.util.Scanner;
public class Problem2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstInt, secondInt;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter first integer: ");
		firstInt = keyboard.nextInt();
		
		System.out.print("Please enter second integer: ");
		secondInt = keyboard.nextInt();
		
		System.out.println("The sum of "+firstInt+" and "+secondInt+" is "+(firstInt + secondInt));
		System.out.println("The difference of "+firstInt+" and "+secondInt+" is "+(firstInt - secondInt));
		System.out.println("The product of "+firstInt+" and "+secondInt+" is "+(firstInt * secondInt));
		
	}

}
