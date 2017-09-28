import java.io.*;

class Sales
{
String name;
int qty;
long mobno;
float rate;
float amt;
float tax;
float total;
byte availableQty;

public void bill() throws IOException
{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the item name");
name=br.readLine();
System.out.println("Enter phone no :");
mobno= Long.parseLong(br.readLine());
System.out.println("Enter the quantity purchased");
qty=Integer.parseInt(br.readLine());
System.out.println("Enter the rate of each product");
rate=Float.valueOf(br.readLine());
amt=qty*rate;
System.out.println("Enter the tax rae");
tax=Float.valueOf(br.readLine());
System.out.println("The cost of the products:"+amt);
tax=amt*tax/100;
total=amt+tax;
System.out.println("The total bill amount is:"+total);

}
public overload(){
  System.out.println("Hello");
  name="bag";
  amt=2100;
  availableQty=56;
}
public overload(String a,Byte a1){
  System.out.println("Hello");
  name="laptop";
  amt=50000;
  availableQty=6;
}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

Sales ob1= new Sales();

ob1.bill();

	}

}
