
public class LectureTwoSol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 'a';//'a' has ASCII value 97, the ASCII value of a--z is increased by 1 for the next letter 
		char y = 'c';//'c' has ASCII value 99
		
		System.out.println((int) x);
  
		System.out.println(y++);//display y as 'c', then y become 'd'
		System.out.println(++y);//y become e, then displayed as 'e'
        System.out.println(x>y);//false
		System.out.println(x-y);//-4 printed, as char_type_value + char_type_value => int_type_Value
        System.out.println(x+1);//98 is printed, as char_type_value + char_	type_value => int_type_Value
        System.out.printf("%c\n",x+1);//b is printed, character with ASCII value 98
      
		System.out.println(x+"\t"+y);//display x as 'a' and y as 'd', there is a big gap in between 
	}

}
