import java.io.*;

abstract class Bill{
   abstract void purchase() throws IOException;
   abstract void sales() throws IOException;
   public int balance=10000;
}

 class Payment extends Bill{
      public int qty,rate,amt;
      public String item;
      public void purchase() throws IOException {
      System.out.println("Enter the Item Purchased");
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      item=br.readLine();
      System.out.println("Enter the Quantity Purchased");
      qty=Integer.parseInt(br.readLine());
      System.out.println("Enter the cost of the item");
      rate=Integer.parseInt(br.readLine());
      amt=qty*rate;
    /*  balance - = amt;
      System.out.println("The current Balance is "+balance);*/
    }
    public void sales() throws IOException{

    }
}

 class Receipt extends Payment{
  public int qty,rate,amt;
  public String item;
  public void sales() throws IOException{
    System.out.println("Enter the Item Purchased");
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    this.item=br.readLine();
    System.out.println("Enter the Quantity Sold");
    this.qty=Integer.parseInt(br.readLine());
    System.out.println("Enter the cost of the item");
    this.rate=Integer.parseInt(br.readLine());
    this.amt=this.qty*this.rate;
    System.out.println("The total purchase value is "+super.amt);
    System.out.println("The total Sales value is "+this.amt);
    System.out.println("The current Balance is "+balance);
    balance-=super.amt;
    balance+= this.amt;
    System.out.println("The current Balance after the transaction is "+balance);
  }
}

public class Absupthis{
  public static void main(String args[]) throws IOException{
    Receipt obj[]=new Receipt[2];
    for(byte i=0;i<2;i++)
            {
              obj[i]=new Receipt();
              obj[i].purchase();
              obj[i].sales();
            }
  }
}
