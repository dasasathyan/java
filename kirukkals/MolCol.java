import java.io.*;
class Overload{
  public static int no=0;
  public String name;
  public int rate,qty,amt;

  public void purchase() throws IOException{
    no++;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(no+". Enter the name of the Item");
    name=br.readLine();
    System.out.println("Enter the rate & quantity");
    qty=Integer.parseInt(br.readLine());
    rate=Integer.parseInt(br.readLine());
    amt=qty*rate;
    System.out.println("The total amount is "+amt);
  }

  public void purchase(String item) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the rate & quantity");
    qty=Integer.parseInt(br.readLine());
    rate=Integer.parseInt(br.readLine());
    amt=qty*rate;
    System.out.println("The total amount for "+item+" = "+amt);
}

public void purchase(String item,int qty) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the rate ");
  rate=Integer.parseInt(br.readLine());
  amt=qty*rate;
  System.out.println("The total amount for "+item+" with "+qty+" = "+amt);

}

}
public class MolCol{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String item;
    int qty;
    boolean ch=true;
    byte op;
    while(ch){
      System.out.println("Enter you choice");
      System.out.println("1. Without Overloading");
      System.out.println("2. With 1 Op Overloading");
      System.out.println("3. With 2 Ops Overloading");
      System.out.println("4. Exit");
      op=Byte.parseByte(br.readLine());
      switch(op){
      case 1:
      Overload without = new Overload();
      without.purchase();
      break;

      case 2:
      Overload with1 = new Overload();
      System.out.println("Enter the item");
      item = br.readLine();
      with1.purchase(item);
      break;

      case 3:
      Overload with2 = new Overload();
      System.out.println("Enter the item and Quantity");
      item = br.readLine();
      qty = Integer.parseInt(br.readLine());
      with2.purchase(item,qty);
      break;

      case 4:
      ch =false;
    }
  }
  }
}
