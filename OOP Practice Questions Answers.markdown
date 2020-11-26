# Answers

### Java Basics
```Text
C. The proper extension for a Java compiled bytecode file is .class, making Option C the correct answer.

D. Only local variables have such a small scope, making Option D the correct answer.

C. Java accepts Options A, B, and D as valid comments. Note that the /* */ syntax can have additional (and uneven) star (*) characters as shown in B and D. Option C is incorrect as hashtag (#) is not a valid comment character in Java.

D. A valid .java file may define any number of classes or interfaces but have at most one public class. It can also not define any public classes. For these reasons, Option A, B, and C are incorrect, leaving Option D as the only correct answer.

A. The code does not compile because of line 5, making Option A the correct answer. For this question, it helps to understand variable scope. The main() method is static and does not have access to any class instance variables. The birds variable is not static and requires a class instance variable to access. Therefore, the code does not compile when the static method attempts to access a non-static variable without an instance of the class.

D. The java command can only execute compiled .class files, so I is false. Java is most certainly object oriented, one of the key design principles, so II is also false. The javac command compiles into bytecode, which must be run in a Java virtual machine (JVM), and is not native machine code, so III is false as well. Since none of the statements are true, Option D is the correct answer.

D. The height variable is declared within the if-then statement block. Therefore, it cannot be referenced outside the if-then statement and the code does not compile.

A. A Java bytecode file is a binary encoded set of instructions designed to be run on any computer with a compatible JVM, making Option A the only correct answer. By compatible JVM, we mean one capable of running the class file. For example, a Java 6 JVM may have trouble executing a Java 8 compiled file. Option B is incorrect, and is more a facet of machine language compiled programming classes. Option C is also incorrect as binary data is not particularly human readable. Finally, Option D is incorrect as the compiled file can be distributed without its .java source file and execute without issue.

D. Unlike with some other programming languages, the proper way to terminate a line of code is with a semicolon (;), making D the only correct answer.

B. There is no such thing as package variables, so Option A is incorrect. Option C is incorrect as the variable is only in scope within a specific instance of the class. Option D is also incorrect as the variable is only in scope for a single method that it is defined in. Option B is the only correct answer as class variables are in scope within the program.

B. Java is object oriented, not procedural, so Option A is a false statement. Java allows method overloading in subclasses, so Option B is correct. Operator overloading is permitted in languages like C++, not Java, so Option C is also untrue. Finally, Option D is not a true statement as the JVM manages the location of objects in memory that can change and is transparent to the Java application.

D. Option A is incorrect as the return type of the method cannot be null. Option B is also incorrect as the return type cannot be void if the method uses a return statement. Option C is incorrect too as the class keyword is replaced with int. Option D is correct because it’s the only answer that allows the code to compile without issue. Note that other values are possible for this question. For example, either int or long can be entered in the last blank. The key here is that only one of the available answer choices allows the code to compile.

A. The double slash (//) syntax can have any number of slashes as a comment, so long as it starts with two of them, making Option A the correct answer. The (#) is not a comment character in Java, regardless of whether it is followed by a (!), so Option B is incorrect. Option C is incorrect as a single slash (/) is not a valid comment in Java. Finally, Option D is incorrect as Option A is a valid comment.

B. An entry point in a Java application consists of a main() method with a single String[] argument, return type of void, and modifiers public and static. Option D is the typical syntax for this method, although Options A and C are also valid forms of this method. Note that the modifier final is optional and may be added to the method signature. Furthermore, the main() method may take a vararg or array. Option B is the only invalid declaration as it does not take an array as an argument.

A. Option A is the only correct answer as a class definition is the only required component in a Java class file. Note that we said a Java class file here; Java also allows interfaces and enums to be defined in a file. A package statement and import statements are optional for declaring a class, making Options B and C incorrect. A class may also be defined with package-level access in a file, making Option D an incorrect answer.

D. The proper extension for a Java compiled bytecode file is .java, making Option D the correct answer.

C. The numLock variable is not accessible in the static main() method without an instance of the Keyboard class; therefore, the code does not compile, and Option C is the correct answer.

D. The code compiles and runs without issue, so Option A is incorrect. The question involves understanding the value and scope of each variable at the print() statement. The variables feet and tracks are locally scoped and set to 4 and 15, respectively, ignoring the value of tracks of 5 in the instance of the class. Finally, the static variable s.wheels has a value of 1. The result is the combined value is 20, making Option D the correct answer.

B. First off, the color variable defined in the instance and set to red is ignored in the method printColor() as local scope overrides instance scope, so Option A is incorrect. The value of color passed to the printColor() method is blue, but that is lost by the assignment to purple, making Option B the correct answer and Option C incorrect. Option D is incorrect as the code compiles and runs without issue.
```

### Data Types
```Text
A. Option A does not compile because Java does not allow declaring different types as part of the same declaration. The other three options show various legal combinations of combining multiple variables in the same declarations with optional default values.

D. The table variable is initialized to "metal". However, chair is not initialized. In Java, initialization is per variable and not for all the variables in a single declaration. Therefore, the second line tries to reference an uninitialized local variable and does not compile, which makes Option D correct.

B. Instance variables have a default value based on the type. For any non-primitive, including String, that type is a reference to null. Therefore Option B is correct. If the variable was a local variable, Option C would be correct.

B. An identifier name must begin with a letter, $, or `_`. Numbers are only permitted for subsequent characters. Therefore, Option B is not a valid variable name.

C. Objects have instance methods while primitives do not. Since int is a primitive, you cannot call instance methods on it. Integer and String are both objects and have instance methods. Therefore, Option C is correct.

D. Java uses the suffix f to indicate a number is a float. Java automatically widens a type, allowing a float to be assigned to either a float or a double. This makes both lines p1 and p3 compile. Line p2 does compile without a suffix. Line p4 does not compile without a suffix and therefore is the answer.

A. A byte is smaller than a char, making Option C incorrect. bigint is not a primitive, making Option D incorrect. A double uses twice as much memory as a float variable, therefore Option A is correct.

C. Options A and D are incorrect because byte and short do not store values with decimal points. Option B is tempting. However, 3.14 is automatically a double. It requires casting to float or writing 3.14f in order to be assigned to a float. Therefore, Option C is correct.
```

### Operations and Decision
```Text
B. A switch statement supports the primitive types byte, short, char, and int and the classes String, Character, Byte, Short, and Integer. It also supports enumerated types. Floating-point types like float and double are not supported, therefore Option B is the correct answer.

A. Remember that in ternary expressions, only one of the two right-most expressions are evaluated. Since meal>6 is false, ––tip is evaluated and ++tip is skipped. The result is that tip is changed from 2 to 1, making Option A the correct answer. The value of total is 6, since the pre-increment operator was used on tip, although you did not need to know this to solve the question.

D. This code does not compile because it has two else statements as part of a single if-then statement. Notice that the second if statement is not connected to the last else statement. For this reason, Option D, none of the above, is the correct answer.

C. A default statement inside a switch statement is optional and can be placed in any order within the switch’s case statements, making Options A and B incorrect. Option D is an incorrect statement as a switch statement can be composed of a single default statement and no case statements. Option C is correct because a default statement does not take a value, unlike a case statement.

B. The initial assignment of thatNumber follows the first branch of the ternary expression. Since 5 >= 5 evaluates to true, a value of 3 is assigned to thatNumber. In the next line, the pre-increment operator increments the value of thatNumber to 4 and returns a value of 4 to the expression. Since 4 < 4 evaluates to false, the if-then block is skipped. This leaves the value of thatNumber as 4, making Option B the correct answer.

B. The break statement exits a switch statement, skipping all remaining branches, making Option B the correct answer. In Option A, exit is not a statement in Java. In Option C, goto is a reserved word but unused in Java. Finally, in Option D, continue is a statement but only used for loops.

B. A case value must be a constant expression, such as a literal or final variable, so Options A and C are true statements about case values. A case statement may be terminated by a break statement, but it is not required, making Option B the false statement and correct answer. Option D is also a true statement about case values.

B. For this problem, it helps to recognize that parentheses take precedence over the operations outside the parentheses. Once we replace the variables with values, the expression becomes: 3+2*(2+3). We then calculate the value inside the parentheses to get 3+2*5. Since the multiplication operator has higher precedence than addition, we evaluate it first, resulting in 3+10 = 13, making Option B the correct answer.

C. While the code involves numerous operations, none of that matters for solving this problem. The key to solving it is to notice that the line that assigns the leaders variable has an uneven number of parentheses. Without balanced parentheses, the code will not compile, making Option C the correct answer.

B. Remember that Java evaluates + from left to right. The first two values are both numbers, so the + is evaluated as numeric addition, resulting in a reduction to 11 + "7" + 8 + 9. The next two terms, 11 + "7", are handled as string concatenation since one of the terms is a String. This allows us to reduce the expression to "117" + 8 + 9. Likewise, the final two terms are each evaluated one at a time with the String on the left. Therefore, the final value is 11789, making Option B the correct answer.

C. The question is asking which operator represents greater than or equal to and which operator is strictly less than. The >= and < correspond to these operators, respectively. Therefore, Option C is the correct answer. Note that the question does not specify which order the operators needed to appear in, only to select the two operators that match the question description.

B. Barring any JVM limitations, a switch statement can have any number of case statements (including none) but at most one default statement, with Option B correctly identifying this relationship.

D. The question looks a lot more difficult than it is. In fact, to solve it you don’t have to compute anything! You just have to notice that the logical complement operator (!), which can only be applied to boolean values, is being applied to a numeric value. Therefore, the answer is that the expression wouldn’t compile or run, making Option D the correct answer.
```

### Arrays
```Text
B. Array indexes are zero based in Java. A varargs parameter is simply another way of passing in data to a method. From within the method, it is treated just like you had written Frisbee[] f as the method parameter. Therefore, the first element uses the 0th index, and Option B is correct.

C. The array braces are allowed to appear before or after the variable name, making the tiger and bear declarations correct. The braces are not allowed to appear before the type making the lion declaration incorrect. Therefore, Option C is correct.

A. Arrays use the length variable to determine the number of elements, making Option A correct. For an ArrayList, Option D would have been the answer.

C. A two-dimensional array is declared by listing both sizes in separate pairs of braces. Option C correctly shows this syntax.

B. There is nothing wrong with this code. It correctly creates a seven-element array. The loop starts with index 0 and ends with index 6. Each line is correctly output. Therefore, Option B is correct.

B. Array indices start with 0, making Options C and D incorrect. The length attribute refers to the number of elements in an array. It is one past the last valid array index. Therefore, Option B is correct.

C. When using an array initializer, you are not allowed to specify the size separately. The size is inferred from the number of elements listed. Therefore, tiger and ohMy are incorrect. When you’re not using an array initializer, the size is required. An empty array initializer is allowed. Option C is correct because lion and bear are legal.

D. names.length is the number of elements in the array. The last valid index in the array is one less than names.length. In Java, arrays do not resize automatically. Therefore, the code throws an ArrayIndexOutOfBoundsException.

A. This array has two elements, making listing.length output 2. While each array element does not have the same size, this does not matter because we are only looking at the first element. The first element has one. This makes the answer Option A.
```

### Loops
```Text
D. A while loop has a condition that returns a boolean that controls the loop. It appears at the beginning and is checked before entering the loop. Therefore, Option D is correct. A traditional for loop also has a boolean condition that is checked before entering the loop. However, it is best known for having a counter variable, making Option B incorrect. Option A is incorrect because the boolean condition on a do-while loop is at the end of the loop. Option C is incorrect because there is no condition as part of the loop construct.

B. A traditional for loop is best known for having a loop variable counting up or down as the loop progresses. Therefore, Option B is correct. Options A and D are incorrect because do-while and while loops are known for their boolean conditions. Option C is incorrect because the for-each loop iterates through without an index.

A. A do-while loop checks the loop condition after execution of the loop body. This ensures it always executes at least once, and Option A is correct. Option B is incorrect because there are loops you can write that do not ever enter the loop body, such as for (int i=0;i<1;i++). Similarly, Option D is incorrect because a while loop can be written where the initial loop condition is false. Option C is incorrect because a for-each loop does not enter the loop body when iterating over an empty list.

C. While a traditional for loop often loops through an array, it uses an index to do so, making Option B incorrect. The for-each loop goes through each element, storing it in a variable. Option C is correct.

B. The continue keyword is used to end the loop iteration immediately and resume execution at the next iteration. Therefore, Option B is correct. Option A is incorrect because the break statement causes execution to proceed after the loop body. Options C and D are incorrect because these are not keywords in Java.

A. The break keyword is used to end the loop iteration immediately, skip any remaining executions of the loop, and resume execution immediately after the loop. Therefore, Option A is correct. Option B is incorrect because execution proceeds at the next execution of the current loop for continue. Options C and D are incorrect because these are not keywords in Java

C. At first this code appears to be an infinite loop. However, the count variable is declared inside the loop. It is not in scope after the loop where it is referenced by the println(). Therefore, the code does not compile, and Option C is correct.

C. It is not possible to create an infinite loop using a for-each because it simply loops through an array or ArrayList. The other types allow infinite loops, such as, for example, do { } while(true), for(;;) and while(true). Therefore, Option C is correct. And yes, we know it is possible to create an infinite loop with for-each by creating your own custom Iterable. This isn’t on the OCA or OCP exam though. If you think the answer is Option D, this is a great reminder of what not to read into on the real exam!

D. Braces are optional around loops if there is only one statement. Parentheses are not allowed to surround a loop body though, so the code does not compile, and Option D is correct.

C. A while loop checks the boolean condition before entering the loop. In this code, that condition is false, so the loop body is never run. No output is produced, and Option C is correct.

B. In a for loop, the segments are an initialization expression, a boolean conditional, and an update statement in that order. Therefore, Option B is correct.

D. On the first iteration of the loop, the if statement executes printing inflate-. Then the loop condition is checked. The variable baloonInflated is true, so the loop condition is true and the loop continues. The if statement no longer runs, but the variable never changes state again, so the loop doesn’t end.
```
### Methods
```Text
A. Option A is correct since method names may include the underscore _ character as well as the dollar $ symbol. Note that there is no rule that requires a method start with a lowercase character; it is just a practice adopted by the community. Option B is incorrect because the hyphen - character may not be part of a method name. Option C is incorrect since new is a reserved word in Java. Finally, Option D is incorrect. A method name must start with a letter, the dollar $ symbol, or an underscore `_` character.

D. The code does not compile, regardless of what is inserted into the line because the method signature is invalid. The return type, int, should go before the method name and after any access, final, or static modifiers. Therefore, Option D is the correct answer. If the method was fixed, by swapping the order of int and static in the method declaration, then Option C would be the correct answer. Options A and B are still incorrect, though, since each uses a return type that cannot be implicitly converted to int.

C. Overloaded methods have the same name but a different list of parameters, making the first and third statements true. The second statement is false, since overloaded methods can have the same or different return types. Therefore, Option C is the correct answer.

C. The method signature requires one int value, followed by exactly one String, followed by String varargs, which can be an array of String values or zero or more individual String values. Only Option C conforms to these requirements, making it the correct answer.

A. The code compiles without issue, so Option D is incorrect. In the main() method, the value 2 is first cast to a byte. It is then increased by one using the addition + operator. The addition + operator automatically promotes all byte and short values to int. Therefore, the value passed to the choose() in the main() method is an int. The choose(int) method is called, returning 5 and making Option A the correct answer. Note that without the addition operation in the main() method, byte would have been used as the parameter to the choose() method, causing the choose(short) to be selected as the next closest type and outputting 2, making Option B the correct answer.

A. Java methods must start with a letter, the dollar $ symbol, or underscore _ character. For these reasons, Options B and D are incorrect, and Option A is correct. Option C is incorrect. The hashtag (#) symbol cannot be included in a method name.
```

### Exceptions
```Text
B. The correct order of blocks is try, catch, and finally, making Option B the correct answer.

B. IOException is a subclass of Exception, so it must appear first in any related catch blocks. If Exception was to appear before IOException, then the IOException block would be considered unreachable code because any thrown IOException is already handled by the Exception catch block. For this reason, Option B is correct.

C. A finally block can throw an exception, in which case not every line of the finally block would be executed. For this reason, Options A and D are incorrect. Option B is also incorrect The finally block is called regardless of whether or not the related catch block is executed. Option C is the correct answer. Unlike an if-then statement, which can take a single statement, a finally statement requires brackets {}.

C. A try statement requires a catch or a finally block. Without one of them, the code will not compile; therefore, Option D is incorrect. A try statement can also be used with both a catch and finally block, making Option C the correct answer. Note that finalize is not a keyword, but a method inherited from java.lang.Object.

A. If an exception matches multiple catch blocks, the first one that it encounters will be the only one executed, making Option A correct, and Options B and C incorrect. Option D is also incorrect. It is possible to write two consecutive catch blocks that can catch the same exception, with the first type being a subclass of the second. In this scenario, an exception thrown of the first type would match both catch blocks, but only the first catch block would be executed, since it is the more specific match.

A. A try statement is not required to have a finally block, but if it does, there can be at most one. Furthermore, a try statement can have any number of catch blocks or none at all. For these reasons, Option A is the correct answer.

B. If both the catch and finally blocks throw an exception, the one from the finally block is propagated to the caller, with the one from the catch block being dropped, making Option B the correct answer. Note that Option C is incorrect due to the fact that only one exception can be thrown to the caller.

C. Option A is incorrect. You should probably seek help if the computer is on fire! Option B is incorrect because code that does not compile cannot run and therefore cannot throw any exceptions. Option C is the best answer, since an IllegalArgumentException can be used to alert a caller of missing or invalid data. Option D is incorrect; finishing sooner is rarely considered a problem.
```













