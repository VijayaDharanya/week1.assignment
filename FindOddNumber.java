package week1.assignment;

public class FindOddNumber
{

	public static void main(String[] args)
	{
		System.out.println("printing only the odd numbers from 1 to 20");
		   for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
			System.out.println(i);
			}
		}
	}

}

//Assignment 8:
//Goal: Find the odd numbers in the specific range of numbers
//* Input: range of numbers (starting to end) [1 to 20]
//* Output: Printing only odd numbers [1,3,5,7,9...,19]
     //System.out.println("Printing only the odd numbers from 1 to 20");

	//	Iterate from 1 to 20 (tip: using loop concept)

	//	Within loop -> check whether the integer is odd (tip: use mod operator % )

	//	Within loop -> print the odd integer