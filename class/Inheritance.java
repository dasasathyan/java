import java.io.*;

class Account
{
	public String custName;
	private int accno;
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

	public void read()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			System.out.println("\n  Enter the Customer Name = ");
			custName = br.readLine();

			System.out.println("\n Enter the Account Number = ");
			accno = Integer.parseInt(br.readLine());

		}

		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

	public void disp()
	{
		System.out.println("Customer Name = "+custName);
		System.out.println("Account Name = "+accno);
	}
}

class LoanAccount extends Account
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

	public void read()
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
		return (intRate+amountSanc)/100;
	}

}

public class Inheritance
{
	public static void main(String args[])
	{
		X obj = new X();
		System.out.println(obj.custName);
		LoanAccount la=new LoanAccount();
		la.read();
		System.out.println(la.custName);
		Account a2 = new Account();
		a2.read();
		a2.disp();
	}
}

class X extends Account{

}
