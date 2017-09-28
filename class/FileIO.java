import java.io.*;
class input implements Serializable{
  private String temp;
  private String name[] = new String[5];
  public void read(){
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
   try{
      for(byte i=0;i<5;i++){
      System.out.println("Enter the name of ");
      name[i]=br.readLine();
}
}
catch(Exception e){

}
}
public void disp(){
    for(byte i=0;i<5;i++){
  System.out.println("Names are "+name[i]);
}
  System.out.println("Sorting....... ");
  for (int i = 0; i < 5; i++)
  {
    for (int j = i + 1; j < 5; j++)
    {
      if (name[i].compareTo(name[j])>0)
      {
        temp = name[i];
        name[i] = name[j];
        name[j] = temp;
      }
    }
  }
  System.out.print("name in Sorted Order:");
  for (int i = 0; i < 5 - 1; i++)
  {

    System.out.print(name[i] + "\n");
  }
  System.out.print(name[5 - 1]);
}
}

public class FileIO{
  public static void main(String []args){
    try{
      //input [] obj = new input[5];
      FileOutputStream store=new FileOutputStream("names");
      ObjectOutputStream objstore = new ObjectOutputStream(store);
    /*  for(byte i=0;i<5;i++){
        obj[i]=new input();
        obj[i].read();
        objstore.writeObject(obj[i]);
      }*/
      input obj = new input();
      obj.read();
      obj.disp();
      objstore.close();
      }
      catch(Exception e){

      }

      //reading file contents
      try{
      input objdisp = new input();
      FileInputStream disp = new FileInputStream("names");
      ObjectInputStream dispobj = new ObjectInputStream(disp);
      for(int i=0;i<5;i++){
        try{
          objdisp = (input)dispobj.readObject();
        }
        catch(Exception e){

        }
      //  objdisp.disp();
      //  objdisp.sort();
      }
      dispobj.close();
    }
    catch (Exception e) {

    }
  }
}
