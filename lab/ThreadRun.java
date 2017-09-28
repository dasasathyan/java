class Even implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<20;i+=2)
			{
				System.out.println("Even Number ="+i);
				Thread.sleep(1000);
			}
		}

		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class Odd implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<20;i+=2)
			{
				System.out.println("Odd Number ="+i);
				Thread.sleep(1000);
			}
		}

		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

public class ThreadRun
{
	public static void main(String args[])
	{
		Even e2 = new Even();
		Odd e1 = new Odd();

		Thread t1 = new Thread(e2);
		t1.start();
		Thread t2 = new Thread(e1);
		t2.start();
		for(int i=0;i<20;i++)
		{
			System.out.println("Natural Number ="+i);
		}
	}
}
