import java.io.*;
class Even extends Thread
{
public void run()
{
try
  {
  for(int i=0;i<20;i+=2)
    {
    System.out.println("Even num" +i);
    Thread.sleep(1000);
    }
  }
    catch(InterruptedException e)
      {
      System.out.println(e);
      }
}
}
  class Odd extends Thread
  {
  public void run()
    {
    for(int i=1;i<20;i+=2)
      {
      System.out.println("odd num is" +i);
      }
    }
  }

    public class ThreadTest
    {
    public static void main(String[] args)
          {
          Even t2=new Even();
          Odd t1=new Odd();
          t2.start();
          t1.start();
          for(int i=0;i<=20;i++)
          {
            System.out.println("Natural number ="+i);
          }
           }
    }
