import java.io.*;
import java.util.Scanner;
class worker{
  String name;
  Byte hrs;
  Short wpo;

  public void read() throws IOException{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  //  Scanner scan = new Scanner(System.in);
    System.out.println("Enter the name of the worker,No. of hours worked and the wage per hour");
    name=input.readLine();
    hrs=Byte.parseByte(input.readLine());
    wpo=Short.parseShort(input.readLine());
  }
  public void display(){
    float total=calcwg();
  System.out.println("Name of the WORKER : "+name);
  System.out.println("No. of hours worked : "+hrs);
  System.out.println("Wage per Hour : "+wpo);
  System.out.println("The wage of the worker : "+total);

  }

  public float calcwg(){
    float twage;
    twage=hrs*wpo;
    return twage;
  }

  public float extraWage(){
    float total,extra=0;
    total=calcwg();
    if(total<200){
      extra=150;
    }
    else{
      extra=50;
    }
    return extra;
  }

  public void TotalWage(){
    float totalwage,nett,net;
    totalwage=extraWage();
    nett=calcwg();
    //System.out.println("The Extra wage of the worker : "+totalwage);
    System.out.println("The extra wage of the worker : "+totalwage);
    net=totalwage+nett;
    System.out.println("The Nett wage of the worker : "+net);
  }

  public static void main(String args[]) throws IOException{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    worker emp = new worker();
    boolean ch=true;
    byte res;
    while(ch){
      System.out.println("1.Read Data");
      System.out.println("2.Display Data");
      System.out.println("3.Total Wage");
      System.out.println("4.Exit");
      System.out.println("Enter your choice");
      res=Byte.parseByte(input.readLine());
      switch(res){
        case 1:
        emp.read();
        case 2:
        emp.display();
        case 3:
        emp.TotalWage();
        case 4:
        ch=false;
    }
  }
}
}
