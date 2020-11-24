// ComputeArea.java: Compute the area of a circle
public class ComputeArea {
  /** Main method */
  public static void main(String args[]) {
	
	//declare a variable, data type is double, variable is radius
    double radius;
    double area;

    //declare a constant PI, its value cannot be changed later
    final double PI = 3.14159;

    // Assign a radius
    radius = 20.0;//assign a value to a variable
    //radius =100;//the variable value can be changed by assigning a different value to it
    // Compute area
    
    area = radius * radius * PI;//expression

    // Display results
    System.out.println("The area for the circle of radius "+ radius + " is " + area);
  }
 
}