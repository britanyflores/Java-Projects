
//Assignment #1

public class GravityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//formula = x(t) = 0.5*at^2+v(i)t+x(i)
		// x(t) = final position initialize to 0
		double finalPosition = 0.0;
		
		//gravity = -9.8m/s^2 and negative because object is falling
		double gravity = -9.8; 
		
		// time = time takes to fall
		double time = 10.0;
		
		//initial velocity = initialVelocity
		double initialVelocity = 0.0;
		
		// x(i) initial position = initialPosition
		double initialPosition = 0.0;
		
		//formula executed here -->
		finalPosition = 0.5*(gravity*(time*time))+ (initialVelocity*time) + initialPosition;
//		
//		//to get the power of a number use Math.pow(double, double)
//		int t = 3;
//		int a = (int)Math.pow(t, 3);
//		System.out.println(a);
		
		System.out.println("The object's position after " + time + " seconds is "+ finalPosition + " m.");
	}

}
