public class Demo3 {

	public static void main(String[] args) {
		int valueA = 100;

		System.out.println("Before calling demoMethod()");
		System.out.println("valueA is " + valueA);
		
		demoMethod(valueA);

		
		System.out.println("After calling demoMethod()");
		System.out.println("valueA is " + valueA);
		
	}
	
	public static void demoMethod(int valueA) {
		
		System.out.println("\nWITHIN NEW METHOD");
		System.out.println("    Before: valueA is " + valueA);
	
		valueA += 99;
		
		System.out.println("        After: valueA is " + valueA);
		
		System.out.println("EXIT NEW METHOD\n");
		
		
	}
}
