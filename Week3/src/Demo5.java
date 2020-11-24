
import java.math.*;


public class Demo5 {
	public static void main(String[] args) {
		
		exchangeRate2SGD("ABC");
	}
	
	public static double exchangeRate2SGD(String a){
        double rate = 0;
        switch( a) {
            case "USD": rate = 1.35; return rate;
            case "GBP": rate = 1.82; return rate;
            case "MYR": rate = 2.9; return rate;
            default: return rate;
       } 
     
   }

	

}
