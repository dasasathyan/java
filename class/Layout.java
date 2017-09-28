import java.awt.*;

public class Layout{
  private Button b1;
  private Button b2;
  private Button b3;
  private Button b4;
  private Button b5;
  private Button b6;
  private Button b7;
  private Button b8;
  private Button b9;

  Frame f;
  private Panel p1,p2,p3;
  public Layout(){
    b1= new Button("1");
    b2= new Button("2");
    b3= new Button("3");
    b4= new Button("4");
    b5= new Button("5");
    b6= new Button("6");
    b7= new Button("7");
    b8= new Button("8");
    b9= new Button("9");

    f= new Frame("Layout Checking");
    f.setLayout(new GridBagLayout());
    p1 = new Panel();
    p2 = new Panel();
    p3 = new Panel();
    p1.setSize(150,150);
    p2.setSize(150,150);
    p3.setSize(150,150);

    f.setBackground(Color.blue);
    p1.setBackground(Color.red);
    p2.setBackground(Color.yellow);
    p3.setBackground(Color.green);

  }

  public void addComp(){

    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    f.add(p1);

    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    f.add(p2);

    p3.add(b7);
    p3.add(b8);
    p3.add(b9);
    f.add(p3);

    f.setSize(500,500);
    f.setVisible(true);

  }

  public static void main(String args[]){
    Layout obj =  new Layout();
    obj.addComp();
  }
}
