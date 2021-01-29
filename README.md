# Calculator2
Building an Object-Oriented CLICalculator
In this iteration, you will refactor the procedural code of your calculator/converter program to move from a procedural design/implementation to an object-oriented design/implementation; and add some color to the CLI.
General Requirements
1. Please review the following web-based calculator programs and determine what they do in detail:
o https://www.calculator.net/binary-calculator.html
o https://www.calculator.net/hex-calculator.html
o https://www.calculator.net/bandwidth-calculator.html
You will write a single program in Java that supports the full functionality of all three calculators.
2. Analyze the above web-based calculator programs to derive your program's detailed requirements. Your program should closely mimic the behavior of those calculators.
In other words, your program should support the same functions, accept or reject the same types of input values with the same ranges, print out similar warning/error messages, and print the functions' results in mostly the same way.
Document all your requirements clearly, not to miss any of them during your design/implementation. You can choose your own way of documenting them: lists, tables, graphics, hand-written/-drawn, etc.
TCSS 305 (Winter 2021) – Programming Assignment #02
Page 2 of 3
3. Your program should have a user-friendly and colorful command-line interface (CLI.)
You should prompt the user to select the calculator type, computation or conversion function, and enter the input values. Your program should then display the result of the computation/conversion to the user.
You should use the font colors consistently, i.e., the same color for the same purpose all the time.
4. Your program should validate all user inputs and reject the invalid entries as early as possible with an appropriate error/warning message.
Of course, if your program does not even allow the user to enter an invalid digit, etc., at all, it may not need to display an error/warning message like in the original web calculators. You have some flexibility in this respect.
You should not let invalid inputs to crash your program by handling the raised exceptions when necessary.
Design Constraints
1. You should only use the object-oriented constructs of Java in your design/implementation.
You should avoid any user-defined static methods, other than the main, in your implementation. You can also use built-in static library classes and methods of Java when necessary.
2. You should derive the classes necessary for your implementation and determine their attributes and methods based on your knowledge from previous 142/143 Java classes.
3. As before, you should not use the available Java library methods to do the calculations and conversions directly, not to make the required work trivial. One possible exception is in computing the expected values in your automatic test cases.
4. Note that you can view all your classes at once in a UML Class Diagram using the IntelliJ IDEA EDU's Diagrams > UML Class Diagram feature.
Documentation Comments
1. Your codes should be well documented using Javadoc comments that describe the classes, interfaces, methods, and fields in your program.
2. You should also use regular comments on a need basis to explain hard-to-understand code segments.
Implementation
1. You should use IntelliJ IDEA EDU for your implementation. You will need some features of the full version in this and coming programming assignments.
Please see the Guidelines documents on installing IntelliJ EDU - on the Pages page on Canvas - if you haven't installed it yet. You may want to uninstall the Community edition from your computer first to remove some clutter and save your disk space.

Testing
1. Your program should provide a "test mode" for each type of calculator where it automatically runs all kinds of computations and conversions with some valid and invalid test input values. We refer to each of them as a "test case."
You should develop a proper set of test cases that can represent the extent of your implementation.
The test cases' expected values for computations/conversions can be set manually or computed on-the-fly using the available built-in Java library methods.
2. In the case of valid inputs, the program should print out their expected and computed actual results and give a warning/error message – with an orange/red color font– if they don't match.
3. In invalid inputs, the program should print out a warning/error message and reject the inputs.
/.Building an Object-Oriented CLICalculator
In this iteration, you will refactor the procedural code of your calculator/converter program to move from a procedural design/implementation to an object-oriented design/implementation; and add some color to the CLI.
General Requirements
1. Please review the following web-based calculator programs and determine what they do in detail:
o https://www.calculator.net/binary-calculator.html
o https://www.calculator.net/hex-calculator.html
o https://www.calculator.net/bandwidth-calculator.html
You will write a single program in Java that supports the full functionality of all three calculators.
2. Analyze the above web-based calculator programs to derive your program's detailed requirements. Your program should closely mimic the behavior of those calculators.
In other words, your program should support the same functions, accept or reject the same types of input values with the same ranges, print out similar warning/error messages, and print the functions' results in mostly the same way.
Document all your requirements clearly, not to miss any of them during your design/implementation. You can choose your own way of documenting them: lists, tables, graphics, hand-written/-drawn, etc.

3. Your program should have a user-friendly and colorful command-line interface (CLI.)
You should prompt the user to select the calculator type, computation or conversion function, and enter the input values. Your program should then display the result of the computation/conversion to the user.
You should use the font colors consistently, i.e., the same color for the same purpose all the time.
4. Your program should validate all user inputs and reject the invalid entries as early as possible with an appropriate error/warning message.
Of course, if your program does not even allow the user to enter an invalid digit, etc., at all, it may not need to display an error/warning message like in the original web calculators. You have some flexibility in this respect.
You should not let invalid inputs to crash your program by handling the raised exceptions when necessary.
Design Constraints
1. You should only use the object-oriented constructs of Java in your design/implementation.
You should avoid any user-defined static methods, other than the main, in your implementation. You can also use built-in static library classes and methods of Java when necessary.
2. You should derive the classes necessary for your implementation and determine their attributes and methods based on your knowledge from previous 142/143 Java classes.
3. As before, you should not use the available Java library methods to do the calculations and conversions directly, not to make the required work trivial. One possible exception is in computing the expected values in your automatic test cases.
4. Note that you can view all your classes at once in a UML Class Diagram using the IntelliJ IDEA EDU's Diagrams > UML Class Diagram feature.
Documentation Comments
1. Your codes should be well documented using Javadoc comments that describe the classes, interfaces, methods, and fields in your program.
2. You should also use regular comments on a need basis to explain hard-to-understand code segments.
Implementation
1. You should use IntelliJ IDEA EDU for your implementation. You will need some features of the full version in this and coming programming assignments.
Please see the Guidelines documents on installing IntelliJ EDU - on the Pages page on Canvas - if you haven't installed it yet. You may want to uninstall the Community edition from your computer first to remove some clutter and save your disk space.

Testing
1. Your program should provide a "test mode" for each type of calculator where it automatically runs all kinds of computations and conversions with some valid and invalid test input values. We refer to each of them as a "test case."
You should develop a proper set of test cases that can represent the extent of your implementation.
The test cases' expected values for computations/conversions can be set manually or computed on-the-fly using the available built-in Java library methods.
2. In the case of valid inputs, the program should print out their expected and computed actual results and give a warning/error message – with an orange/red color font– if they don't match.
3. In invalid inputs, the program should print out a warning/error message and reject the inputs.
/.
