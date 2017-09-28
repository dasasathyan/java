Class Account{
  private String custName;
  private int accno;
  private float balance;
  Account(){
    custName="";
    accno=-1;
  }
  Account(String custName){
    this.custName=custName;
  }
  Account(String custName, int accno){
    this(custName);//constructor chaining
    this.accno=accno;
  }

  public void read(){
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Enter the customer Name");
      custName=br.readLine();
      System.out.println("Enter the Account Number");
      accno=Integer.parseInt(br.readLine());
    }
    catch(Exception e){
      System.out.println(e.toString());
    }
  }

  public void disp(){
    System.out.println("Customer Name"+custName);
    System.out.println("Account Number"+accno);
    System.out.println("Enter the customer Name");
  }
  public float getBalance(){
    return balance;
  }
}
