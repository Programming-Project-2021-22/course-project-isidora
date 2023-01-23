# Real Estate Management System

## 1. About

This Real Estate Management System is developed using Java. In this project customers can see the listing of offers one Real Estate Agency. It is implemented as a Desktop application. Class Program is used to display fields of activities one Real Estate Company.


### 1.1. Demo

Add a link to a demo of your project.

## 2. Authors

This project was created by:

* Isidora Erakovic

## 3. Usage

Describe how to compile, package, and run your project here.
From the Package Explorer tab, browse the examples in src/main/java folder. To run an example, just right click on the file and choose Run As - Java Application, the example will be executed and the output will be shown in the built in console output window.
A classes are the basic building blocks in java program. Classes are saved as .java and used to follow along with the different procedures.

To build the project, run:
mvn package


To test, run:
src/test/java

## 4. Implementation

### 4.1. Architectural Overview

There is one main class without a user interface(Program.java).
Main classes using a user interface are Banner.java, GUI.java, Home.java, Properties.java and PropertiesList.java.


### 4.2. Third-Party Libraries

- java.io.* for read and write .txt file
- javax.swing.* for GUI
- java.awt.* for GUI
- java.util.* for creating arrays and input from console
- java.io.IOException for catching exceptions

### 4.3. Programming Techniques

List and explain how you used the 10 programming techniques required for this project.

1. Interfaces – Rent and Buy interfaces are implemented. From Rent is created class
RentApartment and Furniture and from Buy is created BuyingHouse
2. Abstract classes – BuyBoat class is created. From that class is created class Boat where are
stored data about available boats and owners. Credit calculator is available
3. Generics methods – Car class used to display year and model of available cars. It is used
generic method because one method is used for display of different data.
4. Generic classes – GenericClass created and implemented in class Program – Clients and Field.
GenericPrinter created and implemented in class Program – ID and Turnover.
5. Varrgs – used in a class OurLocations to print all our locations in class Program. It was used
because number of parameters are not in all cases the same
6. Collections – in class BuyHouse we created a houselist with type of houses and we use
Hashset that we avoid double showing of streets where are the house. Hashset is also used
in class Furniture to avoid double showing in a list of furniture
7. Exception – in class RentApartment is used IOException, whenever an input or output
operation is failed or interpreted. In Class Banner is used InterruptedException to restore the
interrupted status. It is used if some other thread wants to interrupt the thread that is
sleeping.
8. Try-catch blocks – Class RentApartment uses try-catch block for writing and reading in
document apartments.txt. Catch was used to catch exceptions. in Class Banner is used to
catch Interruption in case thread is sleeping
9. Multithreading – Create class Commercial that we get effect repeating “****” using
Multithreads. Thread is used in class Banner
10. Lambda Expressions – It is used in Boat class in Foreach loop. It is also used in class GUI to
add buttons
11. File I/O – Created class Agreement where is stored Customer Agreement which can be
updated and read. It is used in class
RentApartment for writing and reading in document apartments.txt.
12. Streams - in the class PropertiesList to sort properties based on their value (price) and name
of streets in alphabetical order
13. Graphical user interface (Java GUI Swing) - is used in class Properties to show properties in
offer. Class GUI is showing future projects. Class Home is providing link to the Website which
is under construction

### 4.4. Tests

Briefly describe and motivate your test suite.
- BoatTest is used to test Calculator which calculates monthly payment based on amount that should be financed and number of years
- BoatHouse is used to test Calculator which calculates monthly payment based on amount that should be financed, interest rate and number of years
- IncomeTest was used to test Calculator which calculates income tax based on income.
Motivation for testing was to check correctnes of methods implemented in certain classes. 

## 5. Experience

### 5.1. Overall Experience

Describe your overall experience in developing this project.
This is a good approach to learn how to implement various techniques covered in the course.
It was challenging because of the requirements of the project. Particulary it was challenging to properly implement maven.


### 5.2. Division of Responsibilities

Describe the roles and responsibilities each member had in this project.

- I was responsible for complete project

### 5.3. Main Challenges

Elaborate on the main challenges each group member faced throughout the project and how they were surpassed.

As already mentioned in point 5.1, the main challenge was to implement maven and the techniques. The reason for this was, this is my first complex project where I had to test the methods using JUnit.

### 5.4. Learning Outcomes

Describe what you learned with this project.

I learned how to implement Lambda expression, Varrgs and Collections. 



