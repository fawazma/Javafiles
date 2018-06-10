import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int candyBarPrice = 10, gumballPrice = 3;
		int numCandyBars, numGumballs;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of coupons you win: ");
		
		int numCoupons = keyboard.nextInt();
		numCandyBars = numCoupons / candyBarPrice;
		numGumballs = (numCoupons % candyBarPrice) / gumballPrice;
		
		System.out.println("You can buy at most  "+numCandyBars+"  candybars, and "+numGumballs+"  gumballs.");
		
		
	}

}
