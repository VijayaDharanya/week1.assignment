package week1.assignment;

public class MyMobile
{
	long cellno=8976512367l;
	String name="NOKIA";
	boolean touch=true;
	
	public void makeCall()
	{
		System.out.println("give a call");
	}
	public void sendMsg() 
	{
		System.out.println("text me");
	}
	private void payBills()
	{
		System.out.println("prepaid bill");
	}

	public static void main(String[] args) 
	{
		MyMobile cell=new MyMobile();
		System.out.println("my cellno is "+cell.cellno);
		System.out.println("my cell model is "+cell.name);
		System.out.println("touch screen "+cell.touch);
		cell.makeCall();
		cell.sendMsg();
		cell.payBills();
	}

}

//Assignment:1
//- Create a  new class as "MyMobile"
//- create variables for the class
//- Create 2 public methods (makeCall() , sendMsg()) with simple print statement
//- Create a private method payBills() with simple print statement
//- Create main method
//- Create object for "MyMobile" class and call the methods and variables using the object
//- Execute the class and get the result in console
