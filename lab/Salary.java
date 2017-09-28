import java.io.*;

class Employee
{
private static int empId;
private String name;
private int basicPay;

  static{
    empId=100;
  }
  public Employee(){
    empId++;
  }

    public void readData() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the name of the Employee whose ID is "+empId);
      name=br.readLine();
      System.out.println("Enter the Basic Salary");
      basicPay=Integer.parseInt(br.readLine());
      calculateSalary();
    }

    public void calculateSalary() throws IOException{
      float da=(basicPay*0.5f);
      float hra=(basicPay*0.1f);
      System.out.println("HRA is "+hra);
      System.out.println("DA is "+da);
      float total;
      total=da+hra+basicPay;
      display(total);
    }

    public void display(float total) throws IOException{
      System.out.println("______________________________________");
      System.out.println("Employee ID = "+empId);
      System.out.println("______________________________________");
      System.out.println("The Basic Salary is "+basicPay);
      System.out.println("The total Salary is "+total+"\n\n");
    }
  }

  public class Salary{
    public static void main(String args[]) throws IOException{
      Employee obj[]=new Employee[2];

      for(byte i=0;i<2;i++)
              {
                obj[i]=new Employee();
                obj[i].readData();
              }
    }
  }
