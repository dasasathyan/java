import java.io.*;
import java.util.Scanner;
class employee{
  private int empId;
  private String name;
  private double basicPay;

  public void read() throws IOException{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the employee ID,Name and basicPay");
    empId=Integer.parseInt(input.readLine());
    name=input.readLine();
    basicPay=Double.parseDouble(input.readLine());
  }

  public double calculate(){
    double da,hra,total;
    da=basicPay*0.5;
    hra=basicPay*0.1;
    total=(da+hra+basicPay);
    return total;
  }
  public double display(){
    double nett=0;
    nett=calculate();
    //System.out.println("The basic = "+basicPay+" HRA = "+hra+" DA = "+da+" Nett = "+nett);
    System.out.println("The Nett = "+nett);
    return nett;
  }
  public static void main(String args[]) throws IOException{
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    Scanner scan=new Scanner(System.in);
    boolean ch=true;
    byte opt=0;
    employee emp=new employee();
    while(ch){
        System.out.println("\n1. Read Data");
      //  System.out.println("\n2. Calculate");
        System.out.println("\n2. Display");
        System.out.println("\n3. Exit");
        System.out.println("\nEnter your choice");
        opt=Byte.parseByte(input.readLine());
        switch (opt) {
          case 1:
          emp.read();
          break;
          case 2:
          emp.calculate();
          emp.display();
          case 3:
          ch=false;
}
}
}
}
