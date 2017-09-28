import java.io.*;
import java.util.Scanner;
class Customer{
  String custName;
  byte custAge;
  long accNo;
  char gender;
  short minBalance;
  float currBalance;

public void read() throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Scanner scan=new Scanner(System.in);
  System.out.println("\nEnter the customer name");
  custName=br.readLine();
  System.out.println("Enter the age");
  custAge=Byte.parseByte(br.readLine());
  System.out.println("Enter the A/C No.");
  accNo=Long.parseLong(br.readLine());
  System.out.println("Enter the Minimum Balance");
  minBalance=Short.parseShort(br.readLine());
  System.out.println("Enter the Balance");
  currBalance=Float.valueOf(br.readLine());
  System.out.println("Enter the Gender");
  gender=(char)br.read();
}
public void display(){
    System.out.println("The customer name is "+custName);
    System.out.println("The customer is  "+custAge+" years old");
    System.out.println("The customer's A/C number is' "+accNo);
    System.out.println("The customer is a "+gender);
    System.out.println("The customer has  "+currBalance+" in his account\n\n");
}
public Customer(){
  System.out.println("Hello");
  custName="dasa";
  custAge=21;
  accNo=233432;
  gender='m';
  minBalance=213;
  currBalance=123231;
}
public Customer(String a,Byte a1){
  System.out.println("Hello");
  custName=a;
  custAge=a1;
  accNo=233432;
  gender='m';
  minBalance=213;
  currBalance=123231;
}
public static void main(String args[]) throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  boolean ch=true;
  byte res,res1,b1;
  Customer ob1=new Customer();
  ob1.display();
  Customer obj[]=new Customer[2];
  while(ch){
    System.out.println("1.Read Data");
    System.out.println("2.Display Data");
    System.out.println("3.Exit");
    System.out.println("Enter your choice");
    res=Byte.parseByte(br.readLine());
    switch(res){
      case 1:
      for(byte i=0;i<2;i++){
        obj[i]=new Customer();
        obj[i].read();
      }
      break;
case 2:      for(byte i=0;i<2;i++){
        obj[i].display();
      }
      break;
      case 3:
      ch=false;
    }
  }
}
}
