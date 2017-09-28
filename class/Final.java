import Account.Deposit;
import Account.withdraw;
import java.io.*;
import java.util.Scanner;

abstract class Account
{
	final String bankName="SBI";
	public String custName;
	private int accno;
	abstract float interestCalc();
	private float balance;
	Account()
	{
		custName = "";
		accno = -1;
	}

	Account(String custName)
	{
		this.custName = custName;
	}

	Account(String custName , int accno)
	{
		this(custName); //constructor Chaining
		this.accno = accno;
	}

	/*public void read()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			System.out.println("\n  Enter the Customer Name = ");
			custName = br.readLine();

			System.out.println("\n Enter the Account Number = ");
			accno =Integer.parseInt(br.readLine());

			System.out.println("\nEnter the balance : ");
			 balance=Float.parseFloat(br.readLine());
		}

		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

	public void disp()
	{
		System.out.println("Bank Name = "+bankName);
		System.out.println("Customer Name = "+custName);
		System.out.println("Account Name = "+accno);
		System.out.println("balance = "+balance);
	}*/
}

/*class LoanAccount extends Account
{
	float intRate;
	int amountSanc;

	public LoanAccount()
	{
		super();
		intRate = (float)0.0;
		amountSanc = 0;
	}

	public LoanAccount(String custName,int accno, float intRate, int amount)
	{
		super(custName,accno);
		this.intRate=intRate;
		amountSanc = amount;
	}
*/
/*	public void read()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			super.read();
			System.out.println("Enter the interest rate = ");
			intRate = Float.parseFloat(br.readLine());
			System.out.println("Enter the Maximum Amount santioned = ");
			amountSanc = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	public void disp()
	{
		super.disp();
		// access specifier
		System.out.println("Interest rate  = "+intRate);
		//System.out.println("account no = "+accno);
		System.out.println("Maximum amount sanctioned = "+amountSanc);
	}

	final float interestCalc()
	{
		return (intRate*amountSanc)/100;
	}

}*/

/*final class CarLoan extends LoanAccount
{
	String carCompany;
	String carModel;
	int carCost;

	CarLoan(){
		carCompany="BMW";
		carModel="X3";
		carCost=8000000;
		}

	CarLoan(String custName, int accno,float intRate,int amount,String comp,String model, int cost)
	{
		super(custName,accno,intRate,amount);
		carCompany=comp;
		carModel=model;
		carCost=cost;
	}
	public void read()
	{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	try
	{
	super.read();
	System.out.println("Enter the car company Name");
	carCompany=br.readLine();

	System.out.println("Enter the car model : ");
	carModel=br.readLine();

	System.out.println("Enter the cost of the car : ");
	carCost=Integer.parseInt(br.readLine());
}

catch(Exception e)
{
System.out.println(e.toString());
}
}

public void disp()
{
float totInte;
totInte=interestCalc();
super.disp();
System.out.println("Car company name : "+carCompany);
System.out.println("car model : "+carModel);
System.out.println("car cost : "+carCost);
System.out.println("total interest : "+totInte);
}
}


*/

class SavingAccount extends Account implements withdraw{
	private float minbal;
	public void read() throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

			super.read();
			System.out.println("Enter the minimum balance");
			minbal=Float.parseFloat(br.readLine());

	}
	public void disp(){
		super.disp();
		System.out.println("minimum balance : " +minbal);
	}

	public void withdraw1(){
		int amt;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the amount to withdraw");
		amt=Integer.parseInt(br.readLine());
		if(balance-amt>minbal){
			balance=balance-amt;
		}
		else{
			System.out.println("Sorry Amount exceeds min balance");
		}
	}
}





public class Final
{
	public static void main(String args[])
	{
		/*Account a2 = new Account();
		/*a2.read();
		a2.disp();

		/*X obj=new obj();
		System.out.println(obj.custName);*/


		/*LoanAccount lc1=new LoanAccount();
		lc1.read();
		System.out.println(la.custName);*/

		/*CarLoan c1=new CarLoan("Hari",121,(float)10.0,100000,"Maruti","800",200000);
		c1.disp();*/

	/*	Account ac = new LoanAccount();
		ac.disp();

		Account ac1 = new CarLoan();
		ac1.disp();

		Account a2= new LoanAccount();
		a2.read();
		a2.disp();*/
		SavingAccount ac= new SavingAccount();
		ac.read();
		ac.disp();
		ac.withdraw1();
		ac.disp();
	}
}
