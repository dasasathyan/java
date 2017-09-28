import java.io.*;

class Purchase
{
  public String pdate;
  public String pitem;
  public int amt;
  public byte qty;
  public Double total;
  public String retailplace;

        public void bill()
        {
          System.out.println("******Function Overloading without parameters******\n");
          System.out.println("Purchase date : 19-June-2017 11:52 AM ");
          System.out.println("Purchased Item : Laptop");
          System.out.println("Amount : Rs 50,000 /-");
          System.out.println("Quantity : 1 ");
          System.out.println("Total : Rs 50,000 /-");
          System.out.println("Retail Place : Chennai ");
        }

        public void readBag()throws IOException
        {
            BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the brand name :");
            pitem=re.readLine();

            bill(pitem);
        }

        public void readItem()throws IOException
        {
            BufferedReader re=new BufferedReader(new InputStreamReader(System.in));


            System.out.println("Enter the purchased item name :");
            pitem=re.readLine();

            System.out.println("Enter the Total :");
            total=Double.parseDouble(re.readLine());

            bill(pitem,total);
        }


      public void bill(String pitem) throws IOException
    {
      System.out.println("******Function Overloading with 1 parameter******\n");
      System.out.println("Purchased Item : "+pitem);
      System.out.println("Amount : Rs 2,000 ");
      System.out.println("Quantity : 1");
      System.out.println("Total : Rs 2,000 ");
      System.out.println("Retail Place : Girdih");
    }

    public void bill(String pitem, Double total) throws IOException
  {
    System.out.println("******Function Overloading with 2 parameters******\n");
    System.out.println("Purchased Item : "+pitem);
    System.out.println("Quantity : 1");
    System.out.println("Total : "+total);
    System.out.println("Retail Place : Bengaluru");
  }
}

  public class FunctionOverload
  {
      public static void main (String[] args) throws IOException
      {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        boolean ch=true;
        byte res;
        Purchase obj[]= new Purchase[1];
        System.out.println("\n----------------------");
        System.out.println("Online Shopping Portal");
        System.out.println("----------------------");
        System.out.println("Customer Name : Dasa Sathyan");
        System.out.println("Customer ID : 1647257");
        System.out.println("Age : 22");
        System.out.println("Gender : M");
        System.out.println("Mobile no : +919003259882");
        System.out.println("----------------------\n\n");
        while(ch)
        {
            System.out.println("\nEnter the options for item you purchased");
            System.out.println("1. Laptop");
            System.out.println("2. Laptop Bag /-");
            System.out.println("3. Any other items");
            System.out.println("4. Exit\n");

            System.out.println("Enter your choice\n");
            res=Byte.parseByte(b.readLine());
            switch(res)
            {
              case 1:for(byte i=0;i<1;i++)
                      {
                        obj[i]=new Purchase();
                        obj[i].bill();

                      }
                      break;

              case 2:for(byte i=0;i<1;i++)
                      {
                        obj[i].readBag();

                      }
                      break;
              case 3:for(byte i=0;i<1;i++)
                      {
                        obj[i].readItem();

                      }
                      break;
              case 4: ch=false;

            } //end of outer
        }
      }
  }
