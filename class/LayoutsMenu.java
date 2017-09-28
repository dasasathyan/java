//	VIKRAMSINH DANTKALE		1647252		LAYOUT MANAGERS IN JAVA (7/9)

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LayoutsMenu extends JFrame implements ActionListener {
	JFrame f = new JFrame("LayoutsMenu");
	JPanel p = new JPanel(), p2 = new JPanel();

	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

	JMenuBar mb;
	JMenu menu;
	JMenuItem menu1, menu2, menu3, menu4, menu5, menu6, menu61, menu7,menu8, menu9;

	BorderLayout borderLayout = new BorderLayout();
	FlowLayout flowLayout = new FlowLayout();
	GridLayout gridLayout = new GridLayout(3, 3);
	CardLayout cardLayout = new CardLayout();
	GridBagLayout gridBagLayout = new GridBagLayout();
	BoxLayout boxLayoutX = new BoxLayout(p, BoxLayout.X_AXIS);
	BoxLayout boxLayoutY = new BoxLayout(p, BoxLayout.Y_AXIS);
	GroupLayout groupLayout = new GroupLayout(p);
	// ScrollPaneLayout scrollPaneLayout = new ScrollPaneLayout();
	// SpringLayout springLayout = new SpringLayout();

	LayoutsMenu() {
	    mb = new JMenuBar();
	    menu = new JMenu("Select Layout that you want");


	    menu1 = new JMenuItem("BorderLayout");			menu1.addActionListener(this);			menu.add(menu1);
	    menu2 = new JMenuItem("FlowLayout");			menu2.addActionListener(this);			menu.add(menu2);
	    menu3 = new JMenuItem("GridLayout");			menu3.addActionListener(this);			menu.add(menu3);
	    menu4 = new JMenuItem("CardLayout *");			menu4.addActionListener(this);			menu.add(menu4);
	    menu5 = new JMenuItem("GridBagLayout");		menu6.addActionListener(this);			menu.add(menu6);
	    menu6 = new JMenuItem("BoxLayout 1");			menu6.addActionListener(this);			menu.add(menu6);
	    menu61 = new JMenuItem("BoxLayout 2");			menu61.addActionListener(this);		menu.add(menu61);
	    menu7 = new JMenuItem("GroupLayout");			menu7.addActionListener(this);			menu.add(menu7);
	    menu8 = new JMenuItem("Next Card");			menu8.addActionListener(this);		menu2.add(menu8);
	    menu9 = new JMenuItem("Previous Card");		menu9.addActionListener(this);		menu2.add(menu9);

	    mb.add(menu);
	    mb.add(menu2);
	    f.setJMenuBar(mb);

	    b1 = new JButton("b1");
	    b2 = new JButton("b2");
	    b3 = new JButton("b3");
	    b4 = new JButton("b4");
	    b5 = new JButton("b5");
	    b6 = new JButton("b6");
	    b7 = new JButton("b7");
	    b8 = new JButton("b8");
	    b9 = new JButton("b9");

	    f.setPreferredSize(new Dimension(500, 500));
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);
	    f.pack();
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == menu1) {
			removeEverything();

			p.setLayout(borderLayout);
		    p.add(b1, BorderLayout.NORTH);
		    p.add(b2, BorderLayout.SOUTH);
		    p.add(b3, BorderLayout.EAST);
		    p.add(b4, BorderLayout.WEST);

			p2.setLayout(new BorderLayout());	p2.validate();

		    p2.add(b5, BorderLayout.NORTH);
		    p2.add(b6, BorderLayout.SOUTH);
		    p2.add(b7, BorderLayout.EAST);
		    p2.add(b8, BorderLayout.WEST);
		    p2.add(b9, BorderLayout.CENTER);

			p.add(p2, BorderLayout.CENTER);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == menu2) {
			removeEverything();		addEverything();

			p.setLayout(flowLayout);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == menu3) {
			removeEverything();		addEverything();

			p.setLayout(gridLayout);	p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == menu4) {
			removeEverything();		addEverything();

			p.setLayout(cardLayout);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == menu8) {
			cardLayout.next(p);
		}
		else if(ae.getSource() == menu9) {
			cardLayout.previous(p);
		}
		else if(ae.getSource() == menu6) {
			removeEverything();		addEverything();

			p.setLayout(gridBagLayout);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == menu6) {
			removeEverything();		addEverything();

			p.setLayout(boxLayoutX);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == menu61) {
			removeEverything();		addEverything();

			p.setLayout(boxLayoutY);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == menu7) {
			removeEverything();		addEverything();

			groupLayout.setAutoCreateGaps(true);
			groupLayout.setAutoCreateContainerGaps(true);

			groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                .addComponent(b1)
                .addComponent(b2)
                .addComponent(b3)
                .addComponent(b4)
                .addComponent(b5)
                .addComponent(b6)
                .addComponent(b7)
                .addComponent(b8)
                .addComponent(b9)
                );

			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(b1)
                .addComponent(b2)
                .addComponent(b3)
                .addComponent(b4)
                .addComponent(b5)
                .addComponent(b6)
                .addComponent(b7)
                .addComponent(b8)
                .addComponent(b9)
				);

			p.setLayout(groupLayout);		p.validate();

			f.add(p);		f.validate();
		}
		/*else if(ae.getSource() == i8) {
			removeEverything();		addEverything();

			p.setLayout(scrollPaneLayout);
		}
		else if(ae.getSource() == i9) {
			removeEverything();		addEverything();

			p.setLayout(springLayout);

			springLayout.putConstraint(SpringLayout.WEST, b1, 6, SpringLayout.WEST, p);
			springLayout.putConstraint(SpringLayout.NORTH, b2, 6, SpringLayout.NORTH, p);
			springLayout.putConstraint(SpringLayout.WEST, b3, 6, SpringLayout.EAST, p);
			springLayout.putConstraint(SpringLayout.NORTH, b4, 6, SpringLayout.NORTH, p);
			springLayout.putConstraint(SpringLayout.EAST, b5, 6, SpringLayout.EAST, p);
			springLayout.putConstraint(SpringLayout.SOUTH, b6, 6, SpringLayout.SOUTH, p);
			springLayout.putConstraint(SpringLayout.WEST, b7, 6, SpringLayout.WEST, p);
			springLayout.putConstraint(SpringLayout.WEST, b8, 6, SpringLayout.WEST, p);
			springLayout.putConstraint(SpringLayout.WEST, b9, 6, SpringLayout.WEST, p);

			f.add(p);		f.validate();
		}*/
	}

	public void removeEverything() {
		p.remove(p2);
		p.remove(b1);		p2.remove(b1);
		p.remove(b2);		p2.remove(b2);
		p.remove(b3);		p2.remove(b3);
		p.remove(b4);		p2.remove(b4);
		p.remove(b5);		p2.remove(b5);
		p.remove(b6);		p2.remove(b6);
		p.remove(b7);		p2.remove(b7);
		p.remove(b8);		p2.remove(b8);
		p.remove(b9);		p2.remove(b9);
		f.remove(p);
	}

	public void addEverything() {
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		f.add(p);
	}

	public static void main(String[] args) {
	    new LayoutsMenu();
	}
}
