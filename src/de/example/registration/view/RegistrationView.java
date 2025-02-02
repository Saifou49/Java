package de.example.registration.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField ;
import javax.swing.table.DefaultTableModel;

import de.example.registration.controller.RegistrationControll;
import de.example.registration.model.UserModell;
import de.example.registration.repository.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;

public class RegistrationView extends JFrame 
{
	RegistrationControll controll = new RegistrationControll();
	
	UserRepository label = new UserRepository();
	
	private final int width = 1600;
	private final int high = 1000;
	
	private JPanel myPanel, myPanelList;
	
	private JTextField   nameField;
	private JTextField   firstNameField;
	private JTextField   genderField;
	private JTextField   countryField;
	private JTextField   cityField;
	private JTextField   ageField;
	private JTextField   emailField;
	private JTextField   phoneNumberField;
	
	private JLabel   welcomeMessage;
	private JLabel    nameEntry;
	private JLabel    firstNameEntry;
	private JLabel    genderEntry;
	private JLabel    countryEntry;
	private JLabel   cityEntry;
	private JLabel    ageEntry;
	private JLabel   emailEntry;
	private JLabel   phoneNumberEntry;

	private JButton btnSave;
	private JButton btnShowTheList;
	private JButton btnReturn;
	
	
	JFrame mainFrame;
	
	JFrame frameForTheList;
	
	 JScrollPane jScrollPane;
	 JTable table;
	 String [][] tableData;
	 
	 DefaultTableModel model;
	 UserModell user;
	 
	 boolean frameForTheListIsLaunsched = false;
	 
		protected String name;
		protected String firstName;
		protected String country;
		protected String city;
		protected String email;
		protected String phoneNumber;
		protected String gender;
		protected String age;
		
		protected int size;
	
	public RegistrationView()
	{
		mainFrame = new JFrame();
		
		mainFrame.setTitle("Registration");
		mainFrame.setSize(width, high);	
		mainFrame.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		mainFrame.setLayout(new BorderLayout());
		
		//The panel
		myPanel = new JPanel();
		myPanel.setBackground( Color.LIGHT_GRAY);
		myPanel.setLayout(null);
		myPanel.setSize(1600,800);
		
		//The Method for the labels
		TheLabels();
		
		//The Method for the textFields
		TheTextFields();
		
		//The Method for the buttons
		TheButtons();
		
		//The Method for the MainPanel where the other JPanels are
		TheMainPanel();
		
		 
		mainFrame.setVisible(true); 
		
	}
	
	//Labels
	 public void  TheLabels()
	 { 
		welcomeMessage = new JLabel  ("Please enter your informations");
		welcomeMessage.setBounds(200,0,1400,100);
		welcomeMessage.setFont(new Font("Serif", Font.PLAIN, 80));
		
	    nameEntry= new JLabel("Name");
	    nameEntry.setBounds(0,200,150,40);
	    nameEntry.setFont(new Font("Serif", Font.PLAIN, 40));
	    
	    firstNameEntry= new JLabel("First Name");
	    firstNameEntry.setBounds(750,200,300,40);
	    firstNameEntry.setFont(new Font("Serif", Font.PLAIN, 40));
		   
	    genderEntry= new JLabel("Gender");
	    genderEntry.setBounds(0, 350, 200,40);
	    genderEntry.setFont(new Font("Serif", Font.PLAIN, 40));
		   
	    ageEntry= new JLabel("Age");
	    ageEntry.setBounds(750,350,150,40);
	    ageEntry.setFont(new Font("Serif", Font.PLAIN, 40));
	    
	    countryEntry= new JLabel("Country");
	    countryEntry.setBounds(0,500,200,40);
	    countryEntry.setFont(new Font("Serif", Font.PLAIN, 40));
	   
	    cityEntry= new JLabel("City");
	    cityEntry.setBounds(750,500,150,40);
	    cityEntry.setFont(new Font("Serif", Font.PLAIN, 40));
	   
	    emailEntry= new JLabel("Email");
	    emailEntry.setBounds(0,650,150,40);
	    emailEntry.setFont(new Font("Serif", Font.PLAIN, 40));
	   
	    phoneNumberEntry= new JLabel("Phone number");
	    phoneNumberEntry.setBounds(750,650,300,40);
	    phoneNumberEntry.setFont(new Font("Serif", Font.PLAIN, 40));		
	 }
	 
	 //The TextFields
	 public void TheTextFields()
	 {
		 nameField = new JTextField  ();
		 nameField.setColumns(100);
		 nameField.setBounds(200,210,400,30);
		 
		 firstNameField = new JTextField  ();
		 firstNameField.setColumns(50);
		 firstNameField.setBounds(1100,210,400,30);
		 
		 genderField = new JTextField  ();
		 genderField.setColumns(50);
		 genderField.setBounds(200,360,400,30);
		 
		 countryField = new JTextField  ();
		 countryField.setColumns(50);
		 countryField.setBounds(200,510,400,30);
		 
		 cityField = new JTextField  ();
		 cityField.setColumns(50);
		 cityField.setBounds(1100,510,400,30);
		 
		 ageField = new JTextField  ();
		 ageField.setColumns(50);
		 ageField.setBounds(1100,360,400,30);
		 
		 emailField = new JTextField  ();
		 emailField.setColumns(50);
		 emailField.setBounds(200,660,400,30);
		 
		 phoneNumberField = new JTextField  ();
		 phoneNumberField.setColumns(50);
		 phoneNumberField.setBounds(1100,660,400,30);
	 }
	 
	 //The Buttons
	 public void TheButtons()
	 {
		 //The btnSave button
		 btnSave = new JButton("Save");
		 btnSave.setFont(new Font("Sherif", Font.PLAIN ,20));
		 btnSave.setBounds(50,750, 700,40);
		 btnSave.setFocusable(false);
		 btnSave.setBackground(Color.GREEN);
		 //btnSave.addActionListener(this);
		 btnSave.addActionListener(e -> {
			 save();
		 });
		//The showList  button
		 btnShowTheList = new JButton("Show user list");
		 btnShowTheList.setFont(new Font("Sherif", Font.PLAIN ,20));
		 btnShowTheList.setBounds(750,750, 700,40);
		 btnShowTheList.setFocusable(false);
		 btnShowTheList.setBackground(Color.YELLOW);
		 btnShowTheList.addActionListener(e -> {
			 openUserList();
			 btnShowTheList.setEnabled(false);
		 });

	 }
	 
	 //The MainPanel
	 public void TheMainPanel()
	 {
		 mainFrame.getContentPane().add(myPanel);
			
		 myPanel.add(welcomeMessage);
		 
		 myPanel.add(nameEntry);
		 myPanel.add(genderEntry);
		 myPanel.add(countryEntry);
		 myPanel.add(emailEntry);
		 
		 myPanel.add(firstNameEntry);
		 myPanel.add(ageEntry);
		 myPanel.add(cityEntry);
		 myPanel.add(phoneNumberEntry);
		 
		 myPanel.add(nameField);
		 myPanel.add(genderField);
		 myPanel.add(countryField);
		 myPanel.add(emailField);
		 
		 myPanel.add(firstNameField);
		 myPanel.add(ageField);
		 myPanel.add(cityField);
		 myPanel.add(phoneNumberField);
		 
		 myPanel.add(btnSave);
		 myPanel.add(btnShowTheList);
	 }
	 
	
	
	public JFrame buildUserPageList()
	{
		frameForTheList = new JFrame();
		
		frameForTheList.setTitle("The list of the registrated person");
		frameForTheList.setSize(1600,900);
		frameForTheList.setDefaultCloseOperation(frameForTheList.EXIT_ON_CLOSE);
		frameForTheList.setLayout(null);
		
		//call the panel of the list
		PanelOfTheList();
		
		frameForTheList.getContentPane().add(myPanelList);
		frameForTheList.setVisible(true);
		
		return frameForTheList;
	}
	
	//The JPanel for frameForTheList
	public void PanelOfTheList()
	{
		myPanelList = new JPanel();
		
		myPanelList.setBackground(Color.CYAN);
		//myPanelList.setBounds(0,0,1600,900);
		myPanelList.setSize(1600,900);
		
		myPanelList.setLayout(null);
		
		
		 btnReturn = new JButton("Return");
		 btnReturn.setFont(new Font("Sherif", Font.PLAIN ,20));
		 btnReturn.setBounds(500,700, 600,40);
		 btnReturn.setFocusable(false);
		 btnReturn.setBackground(Color.GREEN);
		 btnReturn.addActionListener(e-> {
		frameForTheList.dispose();
		btnShowTheList.setEnabled(true);//allow to show the list again
		});
	  
		 //The title of the items
		// String [] tableColumns = {"NAME" , "FIRSTNAME" , "GENDER", "AGE", "COUNTRY", "CITY", "EMAIL", "PHONE NUMBER"};
		 
		 myPanelList.add(btnReturn);
	}
	
	//To clear the fields
	private void clearFields() 
	{
		nameField.setText(null);
		firstNameField.setText(null);
		genderField.setText(null);
		countryField.setText(null);
		cityField.setText(null);
		ageField.setText(null);
		emailField.setText(null);
		phoneNumberField.setText(null);
		
	}
	
	// to save the informations
	private void save() 
	{
		user= new UserModell(nameField.getText(), firstNameField.getText(),genderField.getText(), 
				countryField.getText(), emailField.getText(), ageField.getText(),
				cityField.getText(),phoneNumberField.getText());
		
		boolean registration = controll.registration(user);
		
		if(registration) 
		{	
			clearFields();
			JOptionPane.showMessageDialog(null, "User saved successfully");
		}
		else 
			JOptionPane.showMessageDialog(null, "This user exit already");

	}
	
	// to open the list of the users
	private void openUserList() 
	{
		buildUserPageList();
		
		String[][] createDataVector = createDataVector(controll.listUsers());
		String [] tableColumns = {"NAME" , "FIRSTNAME" , "GENDER", "AGE", "COUNTRY", "CITY", "EMAIL", "PHONE NUMBER"};
		
		model = new DefaultTableModel(tableColumns, 0);
		size = model.getColumnCount();
		
		table = new JTable(createDataVector,tableColumns);
		jScrollPane = new JScrollPane(  table);
		jScrollPane.setBounds(0,0,1600,600); 
		myPanelList.add(jScrollPane);
		frameForTheListIsLaunsched = true;
	}
	
	//The method to create the rows and to add item in them
		private String[][] createDataVector(List<UserModell> userList) {
			String[][] rows= new String[userList.size()][8];
			int index = 0;
			for(UserModell user : userList)
			{
				String[] row = new String[8];
				
					//DIese Schreibweise erlaubt die einzelne Elemente in die Tabelle zu zeigen
					row[0] = user.getName();
					row[1] = user.getFirstName();
					row[2] = user.getGender();
					row[3] = user.getAge();
					row[4] = user.getCountry();
					row[5] = user.getCity();
					row[6] = user.getEmail();
					row[7] = user.getPhoneNumber();
					rows[index] = row;
					index++;
			}
			
			
			return rows;
		}
	
	
}
