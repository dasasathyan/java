import java.awt.event.*;
import java.awt.*;
public class EventFrame{
  Button b1;
  TextField t1;
  Frame f1;
  public static void main(String args[]){
    EventFrame f = new EventFrame();
  }

  public EventFrame(){
    f1 = new Frame("Window Title");
    b1 = new Button("Click Here");
    b1.setSize(10,100);
    t1 = new TextField();
    t1.setSize(10,200);
    f1.setLayout(new FlowLayout());
    f1.add(b1);
    f1.add(t1);
    ButtonListener listen = new ButtonListener();
    b1.addActionListener(listen);
    f1.addWindowListener(listen);
    t1.addKeyListener(listen);
    f1.setSize(800,800);
    f1.setVisible(true);
  }
}

class ButtonListener extends WindowAdapter implements ActionListener, MouseMotionListener, KeyListener{

public void actionPerformed
}
