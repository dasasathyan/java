import java.io.*;
import java.util.Scanner;
class overload{
  String custName;
  byte custAge;
  long accNo;
  char gender;
  short minBalance;
  float currBalance;
  private long custId;
  static long scustId;

  static{
    int a=10;
    int b=20;
    int c=a+b;
    scustId=100;
    System.out.println("The value of C = "+c);
    System.out.println(scustId);
  }
  public overload(){
    scustId++;
    custId=scustId;
  }

public static void show(){
  System.out.println("Last Employee ID  = "+scustId);
}
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
    System.out.println("Customer ID  = "+custId);
}
/*public overload(){
  System.out.println("Hello");
  custName="dasa";
  custAge=21;
  accNo=233432;
  gender='m';
  minBalance=213;
  currBalance=123231;
}
public overload(String a,Byte a1){
  System.out.println("Hello");
  custName=a;
  custAge=a1;
  accNo=233432;
  gender='m';
  minBalance=213;
  currBalance=123231;
}
byte search(String name){
  if(custName.equals(name))
  return 1;
  else
  return 0;
}

byte search(long accno){
  if(accNo==accno)
  return 1;
  else
  return 0;
}

byte search(float balance,char gend){
  if(currBalance >= balance && gender==gend)
  return 1;
  else
  return 0;
}*/
public static void main(String args[]) throws IOException{
  /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  boolean ch=true;
  byte res,res1,b1=0;
  overload ob1=new overload();
  ob1.display();
  overload obj[]=new overload[2];

  while(ch){
    System.out.println("1.Read Data");
    System.out.println("2.Display Data");
    System.out.println("3.Search Data");
    System.out.println("4.Exit");
    System.out.println("Enter your choice");
    res=Byte.parseByte(br.readLine());
    switch(res){
case 1:
      for(byte i=0;i<1;i++){
        obj[i]=new overload();
        obj[i].read();
      }
      break;
case 2:      for(byte i=0;i<1;i++){
        obj[i].display();
      }
      break;
case 3:
System.out.println("1.By name");
System.out.println("2.By A/C No.");
System.out.println("3.By Gender Balance");
System.out.println("Enter your choice");
res1=Byte.parseByte(br.readLine());
switch(res1){

case 1:
  String n;
  System.out.println("Enter the name to search");
  n=br.readLine();
  for(byte i=0;i<1;i++){
    b1=obj[i].search(n);
    if(b1==1){
      obj[i].display();
      break;
    }
  }
  if(b1==0){
    System.out.println("Record not available\n");
  }
  break;
  case 2:
  long accno;
  System.out.println("Enter the A/C No. to search");
  accno=Long.parseLong(br.readLine());
  for(byte i=0;i<1;i++){
    b1=(byte)obj[i].search(accno);
    if(b1==1){
      obj[i].display();
      break;
    }
  }
  if(b1==0){
    System.out.println("Record not available");
  }
  break;

  case 3:
  char gend;
  float balance;
  System.out.println("Enter the balance to search");
  balance=Float.parseFloat(br.readLine());
  System.out.println("Enter the gender to search");
  gend=(char)br.read();

  for(byte i=0;i<1;i++){
    b1=obj[i].search(balance,gend);
    if(b1==1){
      obj[i].display();
      break;
    }
  }
if(b1==0){
  System.out.println("Record not available");
}
break;
}


      case 4:
      ch=false;
    }
  }*/
  overload obje=new overload();
  obje.show();
}
}
