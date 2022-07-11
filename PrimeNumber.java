package week1.assignment;

public class PrimeNumber
{

	public static void main(String[] args) 
	{
		int num=13;
		boolean flag=false;
		for(int i=2;i <=num/2;++i)
		{
			if(num%2==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(num +" is a prime number");
		else
			System.out.println(num +" is a not a prime number");
	}
}
        

//Assignment 5:
//Goal: To find whether a number is a Prime number or not
//* input: 13
//* output: 13 is a Prime Number
//Declare an int Input and assign a value 13

//Declare a boolean variable flag as false

//Iterate from 2 to half of the input

//Divide the input with each for loop variable and check the remainder

//Set the flag as true when there is no remainder

//break the iterator

//Check the flag (Provide a condition)

//Print 'Prime' when the condition matches

//Print 'Not a Prime' when the condition doesn't match 

	


