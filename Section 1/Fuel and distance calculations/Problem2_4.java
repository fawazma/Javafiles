import java.util.Scanner;
public class Problem2_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double distance, mpg, gasPrice;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the distance of the commute in miles: ");
		
		distance = keyboard.nextDouble();
		System.out.print("Enter the fuel consumption rate of the car: ");
		
		mpg  = keyboard.nextDouble();
		System.out.print("Enter the cost of one gallon of gasoline: ");
		
		gasPrice = keyboard.nextDouble();
		
		System.out.println("The cost of commute is: "+(distance / mpg * gasPrice));
		
		
	}
}