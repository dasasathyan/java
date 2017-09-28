
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Toy  extends JApplet
{
	JPanel shopPanel;
	JPanel orderDetailPanel;
	JPanel recipientPanel;
	JTabbedPane tabPane;

	JLabel labelShopperId;
	JLabel labelPasswd;
	JLabel labelFirstName;
	JLabel labelLastName;
	JLabel labelEmailId;
	JLabel labelAddress;
	JLabel labelCity;
	JLabel labelState;
	JLabel labelCountryId;
	JLabel labelZipCode;
	JLabel labelPhone;
	JLabel labelCreditCardNo;
	JLabel labelCreditCardType;
	JLabel labelExpiryDate;


	JTextField tShopperId;
	JTextField tPasswd;
	JTextField tFirstName;
	JTextField tLastName;
	JTextField tEmailId;
	JTextField tAddress;
	JTextField tCity;
	JTextField tState;
	JComboBox comboCountryId;
	JTextField tZipCode;
	JTextField tPhone;
	JTextField tCreditCardNo;
	JComboBox comboCreditCardType;
	JTextField tExpiryDate;

// Recipient database

	JLabel labelRecOrderNo;
	JLabel labelRecFirstName;
	JLabel labelRecLastName;
	JLabel labelRecAddress;
	JLabel labelRecCity;
	JLabel labelRecState;
	JLabel labelRecCountryId;
	JLabel labelRecZipCode;
	JLabel labelRecPhone;


	JTextField tRecOrderNo;
	JTextField tRecFirstName;
	JTextField tRecLastName;
	JTextField tRecAddress;
	JTextField tRecCity;
	JTextField tRecState;
	JComboBox comboRecCountryId;
	JTextField tRecZipCode;
	JTextField tRecPhone;

//Variable for the OrderDetails Database

	JLabel labelOrderDetailOrderNo;
	JLabel labelToyId;
	JLabel labelQuantity;
	JLabel labelGiftWrap;
	JLabel labelWrapperId;
	JLabel labelMessage;
	JLabel labelToyCost;



	JTextField tOrderDetailOrderNo;
	JTextField tToyId;
	JTextField tQuantity;
	JTextField tGiftWrap;
	JTextField tWrapperId;
	JTextField tMessage;
	JTextField tToyCost;

//Variables for the Layout

	GridBagLayout gls,glr,glod;
	GridBagConstraints gbcs,gbcr,gbcod;
	JButton shopperAccept,recipientAccept,orderDetailAccept;
	JButton shopperCancel,recipientCancel,orderDetailCancel;

	public void init()
	{

		 tabPane=new JTabbedPane();
	      	getContentPane().add(tabPane);
		gls=new GridBagLayout();
		gbcs=new GridBagConstraints();
		glr=new GridBagLayout();
		gbcr=new GridBagConstraints();
		glod=new GridBagLayout();
		gbcod=new GridBagConstraints();

		shopPanel=new JPanel();
		shopPanel.setLayout(gls);
		shopperDetail();
		orderDetailPanel=new JPanel();
		orderDetailPanel.setLayout(glod);
		orderDetail();
		 recipientPanel=new JPanel();
		recipientPanel.setLayout(glr);

		recipientDetail();
		tabPane.addTab("Shopper Registration ",null,shopPanel,"Shopper Details");
		tabPane.addTab("Recipient Information ",null,recipientPanel,"RecipientDetails");
		tabPane.addTab("Ordetails form",null,orderDetailPanel,"OrderDetails Information");
	}




	public void shopperDetail()
		{

		//shopPanel.setLayout(gls);
		//getContentPane().add(shopPanel);
//Initialize label controls

		labelShopperId=new JLabel("Shopper Id:");
                	labelPasswd=new JLabel("PassWord:");
		labelFirstName=new JLabel("First Name:");
		labelLastName=new JLabel("Last Name");
		labelEmailId=new JLabel("EmailId:");
		labelAddress=new JLabel("Address:");
	                labelCity=new JLabel("City:");
		labelState=new JLabel("State");
                	labelCountryId=new JLabel("Country Id:");
		labelZipCode=new JLabel("ZipCode:");
		labelPhone=new JLabel("Phone:");
		labelCreditCardNo=new 			JLabel("CreditCardNo:");
		labelCreditCardType=new JLabel("Credit Card 			Type");
		labelExpiryDate=new JLabel("ExpiryDate:");




// Initialize data entry controls

		 tShopperId=new JTextField(6);
		 tPasswd= new JTextField(15);
		 tFirstName  =new JTextField(25);
		 tLastName=new JTextField(25);
		 tEmailId=new JTextField(20);
		 tAddress=new JTextField(30);
		 tCity=new JTextField(20);
		 tState=new JTextField(20);
		 String country[]={"Japan","America","India","Jermany"};
		 comboCountryId = new JComboBox(country);
		 tZipCode=new JTextField(20);
		 tPhone=new JTextField(8);
		 String card[]={"Master Card","VisaCard"};
		 comboCreditCardType= new JComboBox(card);

		 tCreditCardNo=new JTextField(15);
		 tExpiryDate=new JTextField(10);
		 shopperAccept =new JButton("Accept");
		 shopperCancel=new JButton("Cancel");

//Add controls for the candidate Id

		gbcs.anchor=GridBagConstraints.NORTHWEST;
		gbcs.gridx=1;
		gbcs.gridy=1;
		gls.setConstraints(labelShopperId,gbcs);
		shopPanel.add(labelShopperId);
		gbcs.gridx=4;
		gbcs.gridy=1;
		gls.setConstraints(tShopperId,gbcs);
		shopPanel.add(tShopperId);
		gbcs.gridx=1;
		gbcs.gridy=2;
		gls.setConstraints(labelPasswd,gbcs);
		shopPanel.add(labelPasswd);
		gbcs.gridx=4;
		gbcs.gridy=2;
		gls.setConstraints(tPasswd,gbcs);
		shopPanel.add(tPasswd);
		gbcs.gridx=1;
		gbcs.gridy=3;
		gls.setConstraints(labelFirstName,gbcs);
		shopPanel.add(labelFirstName);
		gbcs.gridx=4;
		gbcs.gridy=3;
		gls.setConstraints(tFirstName,gbcs);
		shopPanel.add(tFirstName);
		gbcs.gridx=1;
		gbcs.gridy=4;
		gls.setConstraints(labelLastName,gbcs);
		shopPanel.add(labelLastName);
  		 gbcs.gridx=4;
		gbcs.gridy=4;
		gls.setConstraints(tLastName,gbcs);
		shopPanel.add(tLastName);
		gbcs.gridx=1;
		gbcs.gridy=5;
		gls.setConstraints(labelEmailId,gbcs);
		shopPanel.add(labelEmailId);
		gbcs.gridx=4;
		gbcs.gridy=5;
		gls.setConstraints(tEmailId,gbcs);
		shopPanel.add(tEmailId);
		gbcs.gridx=1;
		gbcs.gridy=6;
		gls.setConstraints(labelAddress,gbcs);
		shopPanel.add(labelAddress);
		gbcs.gridx=4;
		gbcs.gridy=6;
		gls.setConstraints(tAddress,gbcs);
		shopPanel.add(tAddress);
		gbcs.gridx=1;
		gbcs.gridy=7;
		gls.setConstraints(labelCity,gbcs);
		shopPanel.add(labelCity);
		gbcs.gridx=4;
		gbcs.gridy=7;
		gls.setConstraints(tCity,gbcs);
		shopPanel.add(tCity);
		gbcs.gridx=1;
		gbcs.gridy=8;
		gls.setConstraints(labelState,gbcs);
		shopPanel.add(labelState);
		gbcs.gridx=4;
		gbcs.gridy=8;
		gls.setConstraints(tState,gbcs);
		shopPanel.add(tState);
		gbcs.gridx=1;
		gbcs.gridy=9;
		gls.setConstraints(labelCountryId,gbcs);
		shopPanel.add(labelCountryId);
		gbcs.gridx=4;
		gbcs.gridy=9;
		gls.setConstraints(comboCountryId,gbcs);
		shopPanel.add(comboCountryId);
		gbcs.gridx=1;
		gbcs.gridy=10;
		gls.setConstraints(labelZipCode,gbcs);
		shopPanel.add(labelZipCode);
		gbcs.gridx=4;
		gbcs.gridy=10;
		gls.setConstraints(tZipCode,gbcs);
		shopPanel.add(tZipCode);




		gbcs.gridx=1;
		gbcs.gridy=11;
		gls.setConstraints(labelPhone,gbcs);
		shopPanel.add(labelPhone);
		gbcs.gridx=4;
		gbcs.gridy=11;
		gls.setConstraints(tPhone,gbcs);
		shopPanel.add(tPhone);
		gbcs.gridx=1;
		gbcs.gridy=12;
		gls.setConstraints(labelCreditCardNo,gbcs);
		shopPanel.add(labelCreditCardNo);
		gbcs.gridx=4;
		gbcs.gridy=12;
		gls.setConstraints(tCreditCardNo,gbcs);
		shopPanel.add(tCreditCardNo);
		gbcs.gridx=1;
		gbcs.gridy=13;
		gls.setConstraints(labelCreditCardType,gbcs);
		shopPanel.add(labelCreditCardType);
		gbcs.gridx=4;
		gbcs.gridy=13;
		gls.setConstraints(comboCreditCardType,gbcs);
		shopPanel.add(comboCreditCardType);
		gbcs.gridx=1;
		gbcs.gridy=14;
		gls.setConstraints(labelExpiryDate,gbcs);
		shopPanel.add(labelExpiryDate);


		gbcs.gridx=4;
		gbcs.gridy=14;
		gls.setConstraints(tExpiryDate,gbcs);
		shopPanel.add(tExpiryDate);

		gbcs.gridx=1;
		gbcs.gridy=17;
		gls.setConstraints(shopperAccept,gbcs);
		shopPanel.add(shopperAccept);
		gbcs.gridx=4;
		gbcs.gridy=17;
		gls.setConstraints(shopperCancel,gbcs);
		shopPanel.add(shopperCancel);

		ActionValidation acceptListen =
new ActionValidation();

		ActionValidation cancelListen =
new ActionValidation();
//   	for(int c=0,i=0;i<2;i++,c++)
	//	{
		shopperAccept.addActionListener(acceptListen);
		shopperCancel.addActionListener(cancelListen);
//	}
	}





 public void recipientDetail()
 {

		//recipientPanel.setLayout(glr);
		//getContentPane().add(recipientPanel);
//Initialize label controls

		labelRecOrderNo=new JLabel("Order No:");

		labelRecFirstName=new JLabel("First Name:");
		labelRecLastName=new JLabel("Last Name");
		labelRecAddress=new JLabel("Address:");
	                labelRecCity=new JLabel("City:");
		labelRecState=new JLabel("State");
                	labelRecCountryId=new JLabel("Country Id:");
		labelRecZipCode=new JLabel("ZipCode:");
		labelRecPhone=new JLabel("Phone:");


// Initialize data entry controls

		 tRecOrderNo=new JTextField(6);
		 tRecFirstName  =new JTextField(25);
		 tRecLastName=new JTextField(25);
		 tRecAddress=new JTextField(30);
		 tRecCity=new JTextField(20);
		 tRecState=new JTextField(20);
		 String country[]={"Japan","America","India","Indiatan","Jermany"};
		 comboRecCountryId = new JComboBox(country);
		 tRecZipCode=new JTextField(20);
		 tRecPhone=new JTextField(8);
		 recipientAccept =new JButton("Accept");
		 recipientCancel=new JButton("Cancel");

//Add controls for the candidate Id

		gbcr.anchor=GridBagConstraints.NORTHWEST;
		gbcr.gridx=1;
		gbcr.gridy=1;
		glr.setConstraints(labelRecOrderNo,gbcr);
		recipientPanel.add(labelRecOrderNo);
		gbcr.gridx=4;
		gbcr.gridy=1;
		glr.setConstraints(tRecOrderNo,gbcr);
		recipientPanel.add(tRecOrderNo);

		gbcr.gridx=1;
		gbcr.gridy=3;
		glr.setConstraints(labelRecFirstName,gbcr);
		recipientPanel.add(labelRecFirstName);
		gbcr.gridx=4;
		gbcr.gridy=3;
		glr.setConstraints(tRecFirstName,gbcr);
		recipientPanel.add(tRecFirstName);
		gbcr.gridx=1;
		gbcr.gridy=4;
		glr.setConstraints(labelRecLastName,gbcr);
		recipientPanel.add(labelRecLastName);
  		 gbcr.gridx=4;
		gbcr.gridy=4;
		glr.setConstraints(tRecLastName,gbcr);
		recipientPanel.add(tRecLastName);

		gbcr.gridx=1;
		gbcr.gridy=6;
		glr.setConstraints(labelRecAddress,gbcr);
		recipientPanel.add(labelRecAddress);
		gbcr.gridx=4;
		gbcr.gridy=6;
		glr.setConstraints(tRecAddress,gbcr);
		recipientPanel.add(tRecAddress);
		gbcr.gridx=1;
		gbcr.gridy=7;
		glr.setConstraints(labelRecCity,gbcr);
		recipientPanel.add(labelRecCity);
		gbcr.gridx=4;
		gbcr.gridy=7;
		glr.setConstraints(tRecCity,gbcr);
		recipientPanel.add(tRecCity);
		gbcr.gridx=1;
		gbcr.gridy=8;
		glr.setConstraints(labelRecState,gbcr);
		recipientPanel.add(labelRecState);
		gbcr.gridx=4;
		gbcr.gridy=8;
		glr.setConstraints(tRecState,gbcr);
		recipientPanel.add(tRecState);
		gbcr.gridx=1;
		gbcr.gridy=9;
		glr.setConstraints(labelRecCountryId,gbcr);
		recipientPanel.add(labelRecCountryId);
		gbcr.gridx=4;
		gbcr.gridy=9;
		glr.setConstraints(comboRecCountryId,gbcr);
		recipientPanel.add(comboRecCountryId);
		gbcr.gridx=1;
		gbcr.gridy=10;
		glr.setConstraints(labelRecZipCode,gbcr);
		recipientPanel.add(labelRecZipCode);
		gbcr.gridx=4;
		gbcr.gridy=10;
		glr.setConstraints(tRecZipCode,gbcr);
		recipientPanel.add(tRecZipCode);




		gbcr.gridx=1;
		gbcr.gridy=11;
		glr.setConstraints(labelRecPhone,gbcr);
		recipientPanel.add(labelRecPhone);
		gbcr.gridx=4;
		gbcr.gridy=11;
		glr.setConstraints(tRecPhone,gbcr);
		recipientPanel.add(tRecPhone);

		gbcr.gridx=1;
		gbcr.gridy=17;
		glr.setConstraints(recipientAccept,gbcr);
		recipientPanel.add(recipientAccept);
		gbcr.gridx=4;
		gbcr.gridy=17;
		glr.setConstraints(recipientCancel,gbcr);
		recipientPanel.add(recipientCancel);

		ActionValidation acceptListen =	new ActionValidation();

		ActionValidation cancelListen =	new ActionValidation();

		recipientAccept.addActionListener(acceptListen);
		recipientCancel.addActionListener(cancelListen);

	}


public void orderDetail()
{
		//orderDetailPanel.setLayout(glod);
		//getContentPane().add(orderDetailPanel);


//Initialize label controls

		labelOrderDetailOrderNo=new JLabel("Order No:");

		labelToyId=new JLabel("ToyId:");
		labelQuantity=new JLabel("Quantity");
		labelWrapperId=new JLabel("WrapperId:");
	                labelGiftWrap=new JLabel("GiftWrap:");
		labelMessage=new JLabel("Message");
                	labelToyCost=new JLabel("Toy Cost:");



// Initialize data entry controls

		 tOrderDetailOrderNo=new JTextField(6);
		 tToyId  =new JTextField(10);
		 tQuantity=new JTextField(5);
		 tWrapperId=new JTextField(10);
		 tGiftWrap=new JTextField(20);
		 tMessage=new JTextField(20);
		 tToyCost=new JTextField(8);
		 orderDetailAccept =new JButton("Accept");
		 orderDetailCancel=new JButton("Cancel");

//Add controls for the candidate Id

		gbcod.anchor=GridBagConstraints.NORTHWEST;
		gbcod.gridx=1;
		gbcod.gridy=1;
		glod.setConstraints(labelOrderDetailOrderNo,gbcod);
		orderDetailPanel.add(labelOrderDetailOrderNo);
		gbcod.gridx=4;
		gbcod.gridy=1;
		glod.setConstraints(tOrderDetailOrderNo,gbcod);
		orderDetailPanel.add(tOrderDetailOrderNo);

		gbcod.gridx=1;
		gbcod.gridy=3;
		glod.setConstraints(labelToyId,gbcod);
		orderDetailPanel.add(labelToyId);
		gbcod.gridx=4;
		gbcod.gridy=3;
		glod.setConstraints(tToyId,gbcod);
		orderDetailPanel.add(tToyId);
		gbcod.gridx=1;
		gbcod.gridy=4;
		glod.setConstraints(labelQuantity,gbcod);
		orderDetailPanel.add(labelQuantity);
  		 gbcod.gridx=4;
		gbcod.gridy=4;
		glod.setConstraints(tQuantity,gbcod);
		orderDetailPanel.add(tQuantity);

		gbcod.gridx=1;
		gbcod.gridy=6;
		glod.setConstraints(labelWrapperId,gbcod);
		orderDetailPanel.add(labelWrapperId);
		gbcod.gridx=4;
		gbcod.gridy=6;
		glod.setConstraints(tWrapperId,gbcod);
		orderDetailPanel.add(tWrapperId);
		gbcod.gridx=1;
		gbcod.gridy=7;
		glod.setConstraints(labelGiftWrap,gbcod);
		orderDetailPanel.add(labelGiftWrap);
		gbcod.gridx=4;
		gbcod.gridy=7;
		glod.setConstraints(tGiftWrap,gbcod);
		orderDetailPanel.add(tGiftWrap);
		gbcod.gridx=1;
		gbcod.gridy=8;
		glod.setConstraints(labelMessage,gbcod);
		orderDetailPanel.add(labelMessage);
		gbcod.gridx=4;
		gbcod.gridy=8;
		glod.setConstraints(tMessage,gbcod);
		orderDetailPanel.add(tMessage);
		gbcod.gridx=1;
		gbcod.gridy=9;
		glod.setConstraints(labelToyCost,gbcod);
		orderDetailPanel.add(labelToyCost);
		gbcod.gridx=4;
		gbcod.gridy=9;
		glod.setConstraints(tToyCost,gbcod);
		orderDetailPanel.add(tToyCost);

		gbcod.gridx=1;
		gbcod.gridy=17;
		glod.setConstraints(orderDetailAccept,gbcod);
		orderDetailPanel.add(orderDetailAccept);
		gbcod.gridx=4;
		gbcod.gridy=17;
		glod.setConstraints(orderDetailCancel,gbcod);
		//orderDetailPanel.add(orderDetailCancel);

	// 	ActionValidation acceptListen =	new ActionValidation();

	 //	ActionValidation cancelListen =	new ActionValidation();

		//orderDetailAccept.addActionListener(acceptListen);
		//orderDetailCancel.addActionListener(cancelListen);

	}








class ActionValidation implements ActionListener
	{
		public void actionPerformed(ActionEvent en)
		 {

   			Object  obj =en.getSource();


			if(obj==shopperAccept)
			  {
				String Shopper = tShopperId.getText();
				if(Shopper.length()==0)
				{
				getAppletContext().showStatus("Shopper Id Can not be blank");
				return;
				}
				String password = tPasswd.getText();
				if(password.length()==0)
				{
				getAppletContext().showStatus("Password Can not be blank");
				return;
				}
				String firstName = tFirstName.getText();
				if(firstName.length()==0)
				{
				getAppletContext().showStatus("First Name Can not be blank");
				return;
				}
				String lastName = tLastName.getText();
				if(lastName.length()==0)
				{
				getAppletContext().showStatus("Last NameCan not be blank");
				return;
				}
		String emailId = tEmailId.getText();
		if(emailId.length()==0)
		  {
		getAppletContext().showStatus("email Id Can not be blank");
     		return;
   		 }
		String address = tAddress.getText();
		if(address.length()==0)
		  {
		getAppletContext().showStatus("Address Can not be blank");
     		return;
   		 }
 		String city = tCity.getText();
		if(city.length()==0)
		  {
		getAppletContext().showStatus("City Can not be blank");
     		return;
   		 }
		String state = tState.getText();
		if(state.length()==0)
		  {
		getAppletContext().showStatus("State Can not be blank");
     		return;
   		 }
		String country = String.valueOf(comboCountryId.getSelectedItem());

		if(country.length()==0)
		  {
		getAppletContext().showStatus("At least one item must be selected from the Combo Box");
     		return;
   		 }
		String zipCode = tZipCode.getText();
		if(zipCode.length()==0)
		  {
		getAppletContext().showStatus("Zip Code  Can not be blank");
     		return;
   		 }
		String phone = tPhone.getText();
		if(phone.length()==0)
		  {
		getAppletContext().showStatus("Phone value Can not be blank");
     		return;
   		 }
		String cardNo = tCreditCardNo.getText();
		if(cardNo.length()==0)
		  {
		getAppletContext().showStatus("Credit Card No  not be blank");
     		return;
   		 }

		String expDate = tExpiryDate.getText();
		if(expDate.length()==0)
		  {
		getAppletContext().showStatus("Expiry Date Can not be blank");
     		return;
   		 }
		getAppletContext().showStatus(" ");
	   }

	else if(obj==shopperCancel)
	  {
		tShopperId.setText(" ");
		tPasswd.setText(" ");
		tFirstName.setText(" ");
		tLastName.setText(" ");
		tEmailId.setText(" ");
		tAddress.setText(" ");
		tCity.setText(" ");
		tState.setText(" ");
		tZipCode.setText(" ");
		tPhone.setText(" ");
		tCreditCardNo.setText(" ");
		tExpiryDate.setText(" ");
       // }
     }

                       else if(obj==recipientAccept)
		{

	 	String recOrder = tRecOrderNo.getText();
		if(recOrder.length()==0)
		  {
		getAppletContext().showStatus("Order Number Can not be blank");
     		return;
   		 }

		String recFirstName = tRecFirstName.getText();
		if(recFirstName.length()==0)
		  {
		getAppletContext().showStatus("First Name Can not be blank");
     		return;
   		 }
		String recLastName = tRecLastName.getText();
		if(recLastName.length()==0)
		  {
		getAppletContext().showStatus("Last NameCan not be blank");
     		return;
   		 }

		String recAddress = tRecAddress.getText();
		if(recAddress.length()==0)
		  {
		getAppletContext().showStatus("Address Can not be blank");
     		return;
   		 }
		 String recCity = tRecCity.getText();
		if(recCity.length()==0)
		  {
		getAppletContext().showStatus("City Can not be blank");
     		return;
   		 }
		String recState = tRecState.getText();
		if(recState.length()==0)
		  {
		getAppletContext().showStatus("State Can not be blank");
     		return;
   		 }
		String recCountry = String.valueOf(comboRecCountryId.getSelectedItem());

		if(recCountry.length()==0)
		  {
		getAppletContext().showStatus("At least one item must be selected from the Combo Box");
     		return;
   		 }
		String recZipCode = tRecZipCode.getText();
		if(recZipCode.length()==0)
		  {
		getAppletContext().showStatus("Zip Code  Can not be blank");
     		return;
   		 }
		String recPhone = tRecPhone.getText();
		if(recPhone.length()==0)
		  {
		getAppletContext().showStatus("Phone value Can not be blank");
     		return;
   		 }

		getAppletContext().showStatus(" ");
           }

	else if(obj==recipientCancel)
	  {
		tRecOrderNo.setText(" ");

		tRecFirstName.setText(" ");
		tRecLastName.setText(" ");

		tRecAddress.setText(" ");
		tRecCity.setText(" ");
		tRecState.setText(" ");
		tRecZipCode.setText(" ");
		tRecPhone.setText(" ");

        }

		else if(obj==orderDetailAccept )
    		{
		String torder = tOrderDetailOrderNo.getText();
		if(torder.length()==0)
		  {
	      	getAppletContext().showStatus("Order Number Can not be blank");
     		return;
   		 }

		String toyId = tToyId.getText();
		if(toyId.length()==0)
		  {
		getAppletContext().showStatus("Toy Id Cannot be Blank");
     		return;
   		 }
		String quantity = tQuantity.getText();
		if(quantity.length()==0)
		  {
		getAppletContext().showStatus("Quantity Can not be blank");
     		return;
   		 }

		String wrapperId = tWrapperId.getText();
		if(wrapperId.length()==0)
		  {
		getAppletContext().showStatus("Wrapper Id Can not be blank");
     		return;
   		 }
 		String giftWrap = tGiftWrap.getText();
		if(giftWrap.length()==0)
		  {
		getAppletContext().showStatus("GiftWrap Can not be blank");
     		return;
   		 }
		String message = tMessage.getText();
		if(message.length()==0)
		  {
		getAppletContext().showStatus("MessageCan not be blank");
     		return;
   		 }
		String toycost = tToyCost.getText();
		if(toycost.length()==0)
		  {
		getAppletContext().showStatus("Toy Cost  Can not be blank");
     		return;
   		 }

		getAppletContext().showStatus(" ");
	   }

	else if(obj==orderDetailCancel)
	  {
		tOrderDetailOrderNo.setText(" ");

		tToyId.setText(" ");
		tQuantity.setText(" ");

		tWrapperId.setText(" ");
		tGiftWrap.setText(" ");
		tMessage.setText(" ");
		tToyCost.setText(" ");

       // }
    	 }
    }
   }
}
