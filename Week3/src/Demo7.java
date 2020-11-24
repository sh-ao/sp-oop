

public class Demo7 {
	public static void main(String[] args) {
		int val = 123;
		System.out.println(rev(val));
	}
	
	public static int rev(int num) {
		
		int reversed = 0;
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		
		return reversed;
	}
}
