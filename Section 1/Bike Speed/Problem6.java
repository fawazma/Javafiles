
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cadence = 90, gearSize = 100, speed;
		
		speed = gearSize* Math.PI * (1.0/12.0)*(1.0/5280.0)*cadence*60.0;
		System.out.println("The bike is going "+speed+" miles per hour. ");
		
		
		
	}

}
