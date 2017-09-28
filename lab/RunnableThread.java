import java.awt.Graphics;
import java.text.DateFormat;
import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;

public class RunnableThread extends Applet implements Runnable
{
    Font bigFont;
Color yellowColor;
Color weirdColor;
Thread t2;
   Thread t,t1;
 public void init()
    {
    System.out.println("init");
    bigFont=new Font("Arial",Font.BOLD,16);
     setBackground(Color.cyan);
    }

   public void start()
   {
      t = new Thread(this);
      t.start();
   }

   public void run()
   {
      t1 = Thread.currentThread();
      while(t1 == t)
      {
         repaint();
         try
         {
            t1.sleep(1000);
         }
         catch(InterruptedException e)
         {}
      }
   }

   public void paint(Graphics g)
   {

          g.setColor(Color.black);
        g.setFont(bigFont);
        g.drawString("Online Shopping Portal",160,150);

        g.setColor(Color.orange);
        g.fillRoundRect(170,170,160,160,30,30);

        g.setColor(Color.red);
        g.fillRoundRect(180,180,140,140,30,30);

        g.setColor(Color.blue);
        g.fillRoundRect(190,190,120,120,30,30);

        g.setColor(Color.black);
        g.fillRoundRect(200,200,100,100,30,30);

        g.setColor(Color.yellow);
        g.fillOval(215,215,70,70);

        g.setColor(Color.red);
        g.fillOval(230,230,40,40);

        g.setColor(Color.green);
        g.fillOval(245,245,10,10);

      Calendar cal = new GregorianCalendar();
      String hour = String.valueOf(cal.get(Calendar.HOUR));
      String minute = String.valueOf(cal.get(Calendar.MINUTE));
      String second = String.valueOf(cal.get(Calendar.SECOND));
      g.setColor(Color.black);

      g.drawString("Time : "+hour + ":" + minute + ":" + second, 370, 30);
   }
}
