
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight = 68.18;
		double basketball = 8;
		double running = 10;
		double sleeping = 1;
		
		System.out.print("Calories burned per min: ");
		System.out.print(0.0175 * weight * 30 * basketball + 0.0175 * weight * 30 * running + 0.0175 * weight * 360 * sleeping);
		
	
	}
	
	
}
