import java.io.*;
class Employee{
  String eName;
  byte age;
  void read() throws IOException{
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the employee name");
      eName=br.readLine();
      System.out.println("Enter the employee age");
      age = Byte.parseByte(br.readLine());
   }
    catch(IOException e1){
      System.out.println("The exception generated: "+e1);
      e1.printStackTrace();
    }
    catch(NumberFormatException e1){
      System.out.println("The exception generated :"+e1);
    }
    catch(NullPointerException e){

    }
    finally{
      System.out.println("Inside final block No matter what I will execute");
    }
  }
}
public class Excep{
  public static void main(String [] s1){
    Employee obj = new Employee();
try{
    obj.read();
}
catch(IOException e1){


    /*Employee o2;
    o2=obj;
    o2.read();*/
  }
}
}
