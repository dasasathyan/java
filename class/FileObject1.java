import java.io.*;
class Account {//implements Serializable{
  private int accno;
  private float balance;
  /*
      System.out.println("Enter the balance");
      balance=Float.parseFloat(br.readLine());
    }
    catch (Exception e) {
      System.out.println(e.toString());
    }
  }*/
    public void disp(){
      System.out.println("Account number ="+accno);
      System.out.println("Balance Amount ="+balance);
    }
    public float getBalance(){
      return balance;
    }
    public void setBalance(float bal){
      balance = bal;
    }
  }

public class FileObject1{
  public static void main(String []args){
  /*  try{//writing object into file
    Account [] obj = new Account[6]  ;
    FileOutputStream fileout = new FileOutputStream("dasa");
    ObjectOutputStream objout = new ObjectOutputStream(fileout);
    for(int i=0;i<3;i++){
      obj[i]=new Account();
      obj[i].read();
      objout.writeObject(obj[i]);
      }
      objout.close();
    }
    catch(Exception ex){
      System.out.println(ex.toString());
    }*/
    //reading object from file
    try{
      Account obj = new Account();
      FileInputStream fis = new FileInputStream("dasa");
      ObjectInputStream ois = new ObjectInputStream(fis);
      for(int i=0;i<3;i++){
        try{
          obj = (Account)ois.readObject();
        }
        catch(Exception e){

        }
        obj.disp();
        System.out.println("Hello");
      }
      ois.close();
    }
    catch(Exception e){

    }
  }
}
