
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mouseWeight = 0.020;
		double mouseDeath = 0.0000013;
		double friendWeight = 120.0;
		double desiredWeight = 90.0;
		double fatalSoda;
		final double CONCENTRATION = 0.001;
		
		fatalSoda = (mouseDeath / mouseWeight)* desiredWeight / CONCENTRATION;
		
		System.out.println("Dieter can safely have up"+" to "+fatalSoda+" liters of soda a day before"+" dying");
	}

}
