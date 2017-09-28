import java.io.*;
import java.util.Scanner;
class student{
  private String stuName;
  private Byte stuMarks[]=new Byte[5];
  private long roll;
  private String course;

public void read() throws IOException{
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  Scanner scan=new Scanner(System.in);
  System.out.println("\nEnter the name of the student");
  stuName=br.readLine();
  System.out.println("\nEnter the roll number");
  roll=Long.parseLong(br.readLine());
  System.out.println("\nEnter the COURSE name");
  course=br.readLine();
  for(byte i=0;i<5;i++){
  System.out.println("\nEnter the mark of " +i+" subject ");
  stuMarks[i]=Byte.parseByte(br.readLine());
}
}

public double calculate(){
  double average=0;
  int total=0;
  for(byte i=0;i<5;i++){
    total+=stuMarks[i];

  }
  average=total/5;
  //System.out.println("The average is " +average);
  return average;
}
public double display(){
  double avg=0;
  avg=calculate();
  System.out.println("The average = " +avg);
  return avg;
}
public static void main(String args[]) throws IOException{
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  Scanner scan=new Scanner(System.in);
  boolean ch=true;
  byte opt=0;
  student stu=new student();
  while(ch){
      System.out.println("\n1. Read Data");
    //  System.out.println("\n2. Calculate");
      System.out.println("\n2. Display");
      System.out.println("\n3. Exit");
      System.out.println("\nEnter your choice");
      opt=Byte.parseByte(br.readLine());

  switch (opt) {
    case 1:
    stu.read();
    break;
    case 2:
    stu.calculate();
    stu.display();
    case 3:
    ch=false;
}
}
}
}
