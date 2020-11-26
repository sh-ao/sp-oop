# Revision Questions

### Java Basics

What is the proper filename extension for a Java bytecode compiled file?

1. .java
2. .bytecode
3. .class
4. .dll
<br/>

Which variables have a scope limited to a method?

1. Interface variables
2. Class variables
3. Instance variables
4. Local variables
<br/>

Which of the following is not a valid code comment in Java?

1. `// Add 5 to the result`
2. `/*** TODO: Fix bug 12312 ***/`
3. `# Add configuration value`
4. `/* Read file from system ****/`
<br/>

Which statement about a valid `.java` file is true?

1. It can only contain one class declaration.
2. It can contain one public class declaration and one public interface definition.
3. It must define at least one public class.
4. It may define at most one public class.
<br/>

What is the result of compiling and executing the following class?
```Java
public class ParkRanger {
    int birds = 10;
    public static void main(String[] data) {
        int trees = 5;
        System.out.print(trees+birds);
    }
}
```
1. It does not compile.
2. It compiles but throws an exception at runtime.
3. It compiles and outputs 5.
4. It compiles and outputs 15.
<br/>

Which statements about Java are true?

    I. The java command can execute `.java` and `.class` files.
    II. Java is not object oriented.
    III. The javac command compiles directly into native machine code.

1. I only
2. III only
3. II and III
4. None are true.
<br/>

What is the output of the following code snippet?
``` Java
String tree = "pine";
int count = 0;
if (tree.equals ("pine")) {
    int height = 55;
    count = count + 1;
}
System.out.print(height + count);
```

1. 1
2. 55
3. 56
4. It does not compile.
<br/>

Which of the following is true of a Java bytecode file?

1. It can be run on any computer with a compatible JVM.
2. It can only be executed on the same type of computer that it was created on.
3. It can be easily read and modified in a standard text editor.
4. It requires the corresponding .java that created it to execute.
<br/>

What is the correct character for terminating a statement in Java?

1. A colon (:)
2. An end-of-line character
3. A tab character
4. A semicolon (;)
<br/>

Which of the following variables are always in scope for the entire program?

1. Package variables
2. Class variables
3. Instance variables
4. Local variables
<br/>

Which of the following is a true statement?

1. The java command compiles a `.java` file into a `.class` file.
2. The javac command compiles a `.java` file into a `.class` file.
3. The java command compiles a `.class` file into a `.java` file.
4. The javac command compiles a `.class` file into a `.java` file.
<br/>

Which of the following statements about Java is true?

1. Java is a procedural programming language.
2. Java allows method overloading.
3. Java allows operator overloading.
4. Java allows direct access to objects in memory.
<br/>

Given the following code, what values inserted in order into the blank lines, allow the code to compile?
```Java
_______ agent;
public  _______ Banker {
   private static  _______ getMaxWithdrawal() {
      return 10;
   }
}
```

1. import, class, null
2. import, interface, void
3. package, int, int
4. package, class, long
<br/>

Which of the following is a valid code comment in Java?

1. `//////// Walk my dog`
2. `#! Go team!`
3. `/ Process fails at runtime /`
4. `None of the above`
<br/>


Which of the following method signatures is not a valid declaration of an entry point in a Java application?

1. ` public static void main(String... arguments)`
2. `public static void main(String arguments)`
3. `public static final void main(String[] arguments)`
4. `public static void main(String[] arguments)`
<br/>

What is required to define a valid Java class file?

1. A class declaration
2. A package statement
3. At least one import statement
4. The public modifier
<br/>

What is the proper filename extension for a Java source file?

1. .jav
2. .class
3. .source
4. .java
<br/>

Given the following application, what is the expected output?
```Java
public class Keyboard {
   private boolean numLock = true;
   static boolean capLock = false;
   public static void main(String... shortcuts) {
      System.out.print(numLock+" "+capLock);
   }
}
```
1. `true false`
2. `false false`
3. It does not compile.
4. It compiles but throws an exception at runtime.
<br/>

What is the result of compiling and executing the following class?
```Java
public class RollerSkates {
   static int wheels = 1;
   int tracks = 5;
   public static void main(String[] arguments) {
      RollerSkates s = new RollerSkates();
      int feet=4, tracks = 15;
      System.out.print(feet + tracks + s.wheels);
   }
}
```
1. The code does not compile.
2. `5`
3. `10`
4. `20`
<br/>

What is the result of compiling and executing the following class?
```Java
package sports;
public class Bicycle {
   String color = "red";
   private void printColor(String color) {
      color = "purple";
      System.out.print(color);
   }
   public static void main(String[] rider) {
      new Bicycle().printColor("blue");
   }
}
```
1. `red`
2. `purple`
3. `blue`
4. It does not compile.
<br/>

### Data Types

Which of the following declarations does not compile?

1. `double num1, int num2 = 0;`
2. `int num1, num2;`
3. `int num1, num2 = 0;`
4. `int num1 = 0, num2 = 0;`
<br/>

What is the output of the following?
```Java
public static void main(String... args) {
   String chair, table = "metal";
   chair = chair + table;
   System.out.println(chair);
}
```
1. `metal`
2. `metalmetal`
3. `nullmetal`
4. The code does not compile.
<br/>

Which is correct about an instance variable of type String?

1. It defaults to an empty string.
2. It defaults to null.
3. It does not have a default value.
4. It will not compile without initializing on the declaration line.
<br/>

Which of the following is not a valid variable name?

1. `_blue`
2. `2blue`
3. `blue$`
4. `Blue`
<br/>

How many of the following methods compile?

```Java
public String convert(int value) {
   return value.toString();
}
public String convert(Integer value) {
   return value.toString();
}
public String convert(Object value) {
   return value.toString();
}
```
1. None
2. One
3. Two
4. Three
<br/>

Which is the first line to trigger a compiler error?
```Java
double d1 = 5f;    // p1
double d2 = 5.0;   // p2
float f1 = 5f;     // p3
float f2 = 5.0;    // p4
```
1. p1
2. p2
3. p3
4. p4
<br/>

Which of the following lists of primitive types are presented in order from smallest to largest data type?

1. `byte, char, float, double`
2. `byte, char, double, float`
3. `char, byte, float, double`
4. `char, double, float, bigint`
<br/>

Which type can fill in the blank?

```Java
_______  pi = 3.14;
```
1. `byte`
2. `float`
3. `double`
4. `short`
<br/>

### Operations and Decision

Which of the following variable types is not permitted in a switch statement?

1. `String`
2. `double`
3. `int`
4. `char`
<br/>

What is the value of tip after executing the following code snippet?
```Java
int meal = 5;
int tip = 2;
int total = meal + (meal>6 ? ++tip : ‐‐tip);
```
1. 1
2. 2
3. 3
4. 6
<br/>

What is the output of the following application?
```Java
package planning;
public class ThePlan {
   public static void main(String[] input) {
      int plan = 1;
      plan = plan++ + --plan;
      if(plan==1) {
         System.out.print("Plan A");
      } else { if(plan==2) System.out.print("Plan B");
      } else System.out.print("Plan C");
   }
}
```
1. `Plan A`
2. `Plan B`
3. `Plan C`
4. None of the above
<br/>

Which of the following statements about a `default` branch in a `switch` statement is correct?

1. All `switch` statements must include a default statement.
2. The `default` statement is required to be placed after all case statements.
3. Unlike a `case` statement, the `default` statement does not take a value.
4. A `default` statement can only be used when at least one `case` statement is present.
<br/>

What is the value of `thatNumber` after the execution of the following code snippet?
```Java
long thatNumber = 5 >= 5 ? 1+2 : 1*1;
if(++thatNumber < 4)
   thatNumber += 1;
```
1. `3`
2. `4`
3. `5`
4. The answer cannot be determined until runtime.
<br/>

Which statement immediately exits a `switch` statement, skipping all remaining `case` or `default` branches?

1. `exit`
2. `break`
3. `goto`
4. `continue`
<br/>

Which statement about `case` statements of a `switch` statement is not true?

1. A `case` value can be `final`.
2. A `case` statement must be terminated with a `break` statement.
3. A `case` value can be a literal expression.
4. A `case` value must match the data type of the switch variable, or be able to be promoted to that type.
<br/>

What is the output of the following application?
```Java
package jungle;
public class TheBigRace {
   public static void main(String[] in) {
      int tiger = 2;
      short lion = 3;
      long winner = lion+2*(tiger + lion);
      System.out.print(winner);
   }
}
```
1. `11`
2. `13`
3. `25`
4. None of the above
<br/>

What is the output of the following application?
```Java
package recreation;
public class Dancing {
   public static void main(String[] vars) {
      int leaders = 10 * (2 + (1 + 2 / 5);
      int followers = leaders * 2;
      System.out.print(leaders + followers < 10 ? "Too few" : "Too many");
   }
}
```
1. `Too few`
2. `Too many`
3. The code does not compile.
4. The code compiles but throws a division by zero error at runtime.
<br/>

What is the output of the following application?
```Java
package schedule;
public class PrintWeek {
   public static final void main(String[] days) {
      System.out.print(5 + 6 + "7" + 8 + 9);
   }
}
```
1. `56789`
2. `11789`
3. `11717`
4. The code does not compile.
<br/>

Which two operators would be used to test if a number is equal to or greater than `5.21` but strictly less than `8.1`?

1. `>` and `<=`
2. `>=` and `>`
3. `<` and `>=`
4. `<` and `>`
<br/>

Fill in the blanks: A `switch` statement can have `_______` `case` statements and `_______` `default` statements.

1. at most one, at least one
2. any number of, at most one
3. at least one, any number of
4. at least one, at most one
<br/>

What is the value of `(5 + (!2 + 8) * 3 - 3 % 2)/2` in Java?

1. `2`
2. `11`
3. `16`
4. None of the above
<br/>

### Arrays
Fill in the blank in the following code to get the first element from the varargs parameter.
```Java
public void toss (Frisbee... f) {
   Frisbee first = ____________;
}
```
1. `f`
2. `f[0]`
3. `f[1]`
4. None of the above
<br/>

How many of the following are legal declarations?
```Java
[]double lion;
double[] tiger;
double bear[];
```
1. None
2. One
3. Two
4. Three
<br/>

How do you determine the number of elements in an array?

1. `buses.length`
2. `buses.length()`
3. `buses.size`
4. `buses.size()`
<br/>

Which of the following create an empty two-dimensional array with dimensions 2×2?

1. `int[][] blue = new int[2, 2];`
2. `int[][] blue = new int[2], [2];`
3. `int[][] blue = new int[2][2];`
4. `int[][] blue = new int[2 x 2];`
<br/>

How many lines does the following code output?
```Java
String[] days = new String[] { "Sunday", "Monday", "Tuesday",
      "Wednesday", "Thursday", "Friday", "Saturday" };
for (int i = 0; i < days.length; i++)
      System.out.println(days[i]);
```
1. Six
2. Seven
3. The code does not compile.
4. The code compiles but throws an exception at runtime.
<br/>

Which of the following references the first and last element in a non-empty array?

1. `trains[0] and trains[trains.length]`
2. `trains[0] and trains[trains.length - 1]`
3. `trains[1] and trains[trains.length]`
4. `trains[1] and trains[trains.length - 1]`
<br/>

How many of the following are legal declarations?
```Java
String lion [] = new String[] {"lion"};
String tiger [] = new String[1] {"tiger"};
String bear [] = new String[] {};
String ohMy [] = new String[0] {};
```

1. None
2. One
3. Two
4. Three
<br/>

How many of the following are legal declarations?
```Java
float[] lion = new float[];
float[] tiger = new float[1];
float[] bear = new[] float;
float[] ohMy = new[1] float;
```
1. None
2. One
3. Two
4. Three
<br/>

Which is not a true statement about an array?

1. An array expands automatically when it is full.
2. An array is allowed to contain duplicate values.
3. An array understands the concept of ordered elements.
4. An array uses a zero index to reference the first element.
<br/>

What happens when calling the following method with a non-null and non-empty array?
```Java
public static void addStationName(String[] names) {
   names[names.length] = "Times Square";
}
```
1. It adds an element to the array the value of which is `Times Square`.
2. It replaces the last element in the array with the value `Times Square`.
3. It does not compile.
4. It throws an exception.
<br/>

What is the output of the following?
```Java
String[][] listing = new String[][] { { "Book" }, { "Game", "29.99" } };
System.out.println(listing.length + " " + listing[0].length);
```
1. `2 1`
2. `2 2`
3. The code does not compile.
4. The code compiles but throws an exception at runtime.
<br/>

### Loops

Which type of loop is best known for its boolean condition that controls entry to the loop?

1. `do-while` loop
2. `for` (traditional)
3. `for-each`
4. `while`
<br/>

Which type of loop is best known for using an index or counter?

1. `do-while` loop
2. `for` (traditional)
3. `for-each`
4. `while`
<br/>

Which type of loop is guaranteed to have the body execute at least once?

1. `do-while` loop
2. `for` (traditional)
3. `for-each`
4. `while`
<br/>

Which of the following can loop through an array without referring to the elements by index?

1. `do-while` loop
2. `for` (traditional)
3. `for-each`
4. `while`
<br/>

What keyword is used to end the current loop iteration and proceed execution with the next iteration of that loop?

1. `break`
2. `continue`
3. `end`
4. `skip`
<br/>

What keyword is used to proceed with execution immediately after a loop?

1. `break`
2. `continue`
3. `end`
4. `skip`
<br/>

What is the result of the following code?
```Java
do {
   int count = 0;
   do {
      count++;
   } while (count < 2);
      break;
} while (true);
System.out.println(count);
```
1. `2`
2. `3`
3. The code does not compile.
4. This is an infinite loop.
<br/>

How many of the loop types (while, do while, traditional for, and enhanced for) allow you to write code that creates an infinite loop?

1. One
2. Two
3. Three
4. Four
<br/>

What happens when running the following code?
```Java
do (
   System.out.println("helium");
) while (false);
```
1. It completes successfully without output.
2. It outputs `helium` once.
3. It keeps outputting `helium`.
4. The code does not compile.
<br/>

What does the following code output?
```Java
int singer = 0;
while (singer > 0)
  System.out.println(singer++);
```
1. `0`
2. The code does not compile.
3. The loops completes with no output.
4. This is an infinite loop.
<br/>

What describes the order in which the three expressions appear in a `for` loop?

1. boolean conditional, initialization expression, update statement
2. initialization expression, boolean conditional, update statement
3. initialization expression, update statement, boolean conditional
4. None of the above
<br/>

What is the output of the following?
```Java
boolean baloonInflated = false;
do {
   if (!baloonInflated) {
      baloonInflated = true;
      System.out.print("inflate-");
   }
} while (baloonInflated);
System.out.println("done");
```
1. `done`
2. `inflate-done`
3. The code does not compile.
4. This is an infinite loop.
<br/>

### Methods

Which of the following is a valid method name in Java?

1. `Go_$Outside$2()`
2. `have-Fun()`
3. `new()`
4. `9enjoyTheWeather()`
<br/>

Which of the following lines of code can be inserted in the line below that would allow the class to compile?
```Java
package farm;
public class Coop {
   public final int static getNumberOfChickens() {
      // INSERT CODE HERE
   }
}
```
1. `return 3.0;`
2. `return 5L;`
3. `return 10;`
4. None of the above
<br/>

Which of the following statements about overloaded methods are true?
```
I. Overloaded methods must have the same name.
II. Overloaded methods must have the same return type.
III. Overloaded methods must have a different list of parameters.
```
1. I
2. I and II
3. I and III
4. I, II, and III
<br/>

Given the following method declaration signature, which of the following is a valid call of this method?
```Java
public void call(int count, String me, String... data)
```
1. `call(9,"me",10,"Al")`
2. `call(5)`
3. `call(2,"home","sweet")`
4. `call("answering","service")`
<br/>

What is the output of the following application?
```Java
public class ChooseWisely {
   public ChooseWisely() { super(); }
   public int choose(int choice) { return 5; }
   public int choose(short choice) { return 2; }
   public int choose(long choice) { return 11; }
   public static void main(String[] path) {
      System.out.print(new ChooseWisely().choose((byte)2+1));
   }
}
```
1. `5`
2. `2`
3. `11`
4. The code does not compile.
<br/>

Which of the following is a valid method name in Java?

1. `$sprint()`
2. `\jog13()`
3. `walk#()`
4. `%run()`
<br/>

### Excepetions

Choose the answer that lists the keywords in the order that they would be used together.

1. catch, try, finally
2. try, catch, finally
3. finally, catch, try
4. try, finally, catch
<br/>

If a try statement has catch blocks for both Exception and IOException, then which of the following statements is correct?

1. The catch block for Exception must appear before the catch block for IOException.
2. The catch block for IOException must appear before the catch block for Exception.
3. The catch blocks for these two exception types can be declared in any order.
4. A try statement cannot be declared with these two catch block types because they are incompatible.
<br/>

Which of the following statements about a `finally` block is true?

1. Every line of the finally block is guaranteed to be executed.
2. The `finally` block is executed only if the related catch block is also executed.
3. The `finally` statement requires brackets {}.
4. The `finally` block cannot throw an exception.
<br/>

Which keywords are required with a try statement?
```
I. catch
II. finalize
III. finally
```
1. I only
2. II only
3. I or III, or both
4. None of these statements are required with a try statement.
<br/>

If an exception matches two or more catch blocks, which catch block is executed?

1. The first one that matches is executed.
2. The last one that matches is executed.
3. All matched blocks are executed.
4. It is not possible to write code like this.
<br/>

Fill in the blanks: A try statement has `________` finally block(s) and `________` catch blocks.

1. zero or one, zero or more
2. one, one or more
3. zero or one, zero or one
4. one or more, zero or one
<br/>

Which of the following is the best scenario to use an exception?

1. The computer caught fire.
2. The code does not compile.
3. A caller passes invalid data to a method.
4. A method finishes sooner than expected.
<br/>

















