package week1.assignment;

public class MyCalculator {

	public static void main(String[] args) {
	Calculator1 arithmetic=new Calculator1();
	System.out.println("sum of three numbers = " + arithmetic.add(5,5,10));
	System.out.println("subration of two numbers = " +arithmetic.sub(100,50));
	System.out.println("product of two numbers = " +arithmetic.mul(50.12,0.013));
	System.out.println("divison of two numbers = " +arithmetic.div(5.1f, 2.1f));

	}

}

//Assignment: 3
//Goal:To understand  ( Class and Methods)

//Create a class "Calculator" with below methods
//(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
//(b) sub(int num1, int num2), it should return subtraction of of num1-num2
//(c) mul(double num1, double num2), it should return product of num1 * num2
//(d) divide(float num1, float num2), it should return division of num1 / num2

//-- Create another class as MyCalculator and call all the methods from Calculator and print the results
