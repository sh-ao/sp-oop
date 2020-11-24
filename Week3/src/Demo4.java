

public class Demo4 {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c = 3;
		
		
		//computeAvg(computeAvg(a, b, c), computeAvg(a, b, c), computeAvg(a, b, c));
		
		double x = computeAvg(a, b, c) + 1;
		double y = computeAvg(a, b, c) + 2;
		double z = computeAvg(a, b, c) + 3;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		

		
		

	}
	
	public static double computeAvg(double a, double b, double c) {
		double result = 0;
		
		double sum = a + b + c;
		result = sum / 3;
		
		return result;

	}
	

}
