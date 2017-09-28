import java.io.*;

class Input
{
  public String name[]=new String[5];

  public void read()throws IOException
  {
    FileWriter writer = new FileWriter("names");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the names");
     for(int i=0;i<5;i++)
     {
         name[i]=br.readLine();
         writer.write(name[i]+"\n");
     }
      writer.close();
  }

      public void fWrite()throws IOException,FileNotFoundException
      {
        BufferedReader br = new BufferedReader(new FileReader("names"));
        String line[]=new String[11];
       for(int i=0;i<5;i++)
        {
          name[i] = br.readLine();
          System.out.println(name[i]);
        }

      }

      public void fsort()throws IOException
      {
        String temp;
        int i,j;
        BufferedReader br = new BufferedReader(new FileReader("names"));
		//sorting
        for(i=0; i<5; i++)
      {
          for(j=1; j<5; j++)
          {
              if(name[j-1].compareTo(name[j])>0)
              {
                  temp=name[j-1];
                  name[j-1]=name[j];
                  name[j]=temp;
              }
          }
      }

      FileWriter writer = new FileWriter("names");
         for(i=0;i<5;i++)
         {
             writer.write(name[i]+"\n");
         }
          writer.close();
      }
}


public class FileIO
{
  public static void main(String arg[]) throws IOException
  {
    Input obj =new Input();
    obj.read();
  System.out.println("\nThe Names are ");
    obj.fWrite();
    obj.fsort();
    System.out.println("\nThe names after sorting :");
    obj.fWrite();
  }
}
