package de.example.mybank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class LeTest extends JFrame implements ActionListener{

	JButton back;
	
	
	
	
	
	
	
	LeTest() {
	
		// TODO Auto-generated method stub
			
		
		
		
		setTitle("The list of the registrated person");
		setSize(1600,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		JPanel myPanelList = new JPanel();
		
		myPanelList.setBackground(Color.CYAN);
		myPanelList.setSize(1600,900);
		myPanelList.setLayout(null);
		
		
		 back = new JButton("Return");
		 back.setFont(new Font("Sherif", Font.PLAIN ,20));
		 back.setBounds(500,750, 600,40);
		 back.setFocusable(false);
		 back.setBackground(Color.GREEN);
		 back.addActionListener(this);
		 
		 String [][] tableData = {{"Diallo", "Mamadou Saifou", "Male", "22", "Germany", "Ulm", "MSAIFOUDIALLO@GMAIL.COM", "004915734138995"},
				                 {"Bah", "Mamadou Saifou", "Male", "22", "Germany", "Ulm", "MSAIFOUDIALLO@GMAIL.COM", "004915734138995"}};
		 /*
		  * nameField.getText(), firstNameField.getText(),genderField.getText(), 
				countryField.getText(), emailField.getText(), ageField.getText(),
				cityField.getText(),phoneNumberField.getText()
		  */
	 
		 String [] tableColumns = {"NAME" , "FIRSTNAME" , "GENDER", "AGE", "COUNTRY", "CITY", "EMAIL", "PHONE NUMBER"};
	 
		 JTable table = new JTable(tableData, tableColumns);
		 table.setBounds(100,100,1500,500);
	 
		JScrollPane jScrollPane = new JScrollPane(table);
		
		 this.getContentPane().add(myPanelList);
		
		 myPanelList.add(jScrollPane);
		 myPanelList.add(back);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] arg)
	{
		LeTest le = new LeTest();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == back)
		{
			JOptionPane.showMessageDialog(null, "Hallo The Ingenieur");
		}
		
	}

}
