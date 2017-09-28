import java.awt.event.*;
import java.awt.*;
class Login extends Frame implements ActionListener
{
	TextField usrname;
	TextField pass;
	Label usrnamelbl;
	Label passlbl;
	Button log;
	Label result;
	Login()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		usrnamelbl= new Label("Username");
		usrname= new TextField(15);
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		passlbl=new Label("Password");
		pass= new TextField(15);
		log= new Button("Login");
		result= new Label("-------------------");
		add(usrnamelbl);
		add(usrname);
		add(passlbl);
		pass.setEchoChar('*');
		add(pass);
		add(log);
		add(result);

		setVisible(true);
		setSize(600,400);
		log.addActionListener(this);
	}
public static void main(String args[])
{
	Login ob= new Login();
}
@Override
public void actionPerformed(ActionEvent evt)
{
	String usr=usrname.getText();
	String passw= pass.getText();
	if(usr.equals("sanket")&& passw.equals("sanket"))
	{
		result.setText("Successfull");


	}
	else
	{
		result.setText("Not Successfull");

	}
}


}