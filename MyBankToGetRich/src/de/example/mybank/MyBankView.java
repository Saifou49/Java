package de.example.mybank;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBankView extends JFrame implements ActionListener
{
	protected int confirmationTakeAllMony = 0;
	private int width = 1600;
	private int high = 900;
	protected String name;
	protected String gender;
	protected JButton submit;
	protected JTextField nameField;
	protected ButtonGroup groupRadioButton;
	protected String greetingsText = "";
	protected JButton cancel, balanceButton, putMoneyInTheAccountButton, takeMoneyFromTheAccountButton;
	protected String balanceInput = "";
	protected String moneyToPutInput = "";
	protected String  moneyToTakeInput = "";
	protected int balance = 0;
	protected int moneyToPut = 0;
	protected int moneyToTake = 0;
	
	//to check the status of the radioButtons
	
	protected boolean maleIsSelected = true;;
	protected boolean femaleIsSelected = true;
	protected boolean diverseIsSelected = true;
	
	
	JRadioButton male;
	JRadioButton female;
	JRadioButton diverse;
	
	JFrame mainFrame;
	
	MyBankView()
	{
		setTitle("The Main Frame");
		setSize(width, high);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		JPanel myPanelWelcome = new JPanel();
		myPanelWelcome.setBackground(Color.CYAN);
		myPanelWelcome.setBounds(0,0,1600,100);
		
		JPanel myPanelEnterNameMessage = new JPanel();
		myPanelEnterNameMessage.setBackground(Color.CYAN);
		myPanelEnterNameMessage.setBounds(0,100,1600,100);
		
		JPanel myPanelTextField = new JPanel();
		myPanelTextField.setBackground(Color.CYAN);
		myPanelTextField.setBounds(0,200,1600,100);
		
		JPanel myPanelGenderChoiceMessage = new JPanel();
		myPanelGenderChoiceMessage.setBackground(Color.CYAN);
		myPanelGenderChoiceMessage.setBounds(0,300,1600,100);
		
		JPanel myPanelGenderChoiceRadioButton = new JPanel();
		myPanelGenderChoiceRadioButton.setBackground(Color.CYAN);
		myPanelGenderChoiceRadioButton.setBounds(0,400,1600,100);
		
		JPanel myPanelSubmit = new JPanel();
		myPanelSubmit.setBackground(Color.CYAN);
		myPanelSubmit.setBounds(0,500,1600,100);
		
		
		JLabel welcomeLabel = new JLabel();
		welcomeLabel.setText("Welcome to the bank Diallo ");
		welcomeLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 50));
	
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Please enter your name ");
		nameLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
		
		JLabel genderLabel = new JLabel();
		genderLabel.setText("Please choose your gender ");
		genderLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
		
		nameField = new JTextField();
		nameField.setColumns(22);
				
		 male = new JRadioButton();
		 female = new JRadioButton();
		 diverse = new JRadioButton();

		male.setText("Male");
		female.setText("Female");
		diverse.setText("Diverse");
		
		male.setActionCommand("Male");
		female.setActionCommand("Female");
		diverse.setActionCommand("Diverse");
		
		
		
		groupRadioButton = new ButtonGroup();
		groupRadioButton.add(male);
		groupRadioButton.add(female);
		groupRadioButton.add(diverse);
		
		
		submit = new JButton();
		submit.setText("Submit");
		submit.setSize(60,30);
		submit.setFocusable(true);
		submit.addActionListener(this);
		
		/*
		if(male.isSelected())
			maleIsSelected = true;
		else
			maleIsSelected = false;
		
		if(female.isSelected())
			//femaleIsSelected
			femaleIsSelected= true;
		else
			femaleIsSelected = false;
		
		if(diverse.isSelected())
			diverseIsSelected = true;
		else
			diverseIsSelected = false;
		*/
		
		getContentPane().add(myPanelWelcome);
		getContentPane().add(myPanelEnterNameMessage);
		getContentPane().add(myPanelTextField);
		getContentPane().add(myPanelGenderChoiceMessage);
		getContentPane().add(myPanelGenderChoiceRadioButton);
		getContentPane().add(myPanelSubmit);
		
		myPanelWelcome.add(welcomeLabel);
		myPanelEnterNameMessage.add(nameLabel);
		myPanelTextField.add(nameField);
	  	myPanelGenderChoiceMessage.add(genderLabel);
		myPanelGenderChoiceRadioButton.add(male);
		myPanelGenderChoiceRadioButton.add(female);
		myPanelGenderChoiceRadioButton.add(diverse); 
		myPanelSubmit.add(submit);
		
		setVisible(true);
		
		
	}
	
	void TheMainBankView()
	{
		mainFrame = new JFrame();
		mainFrame.setTitle("The Main Frame");
		mainFrame.setSize(width, high);
		mainFrame.setResizable(true);
		mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		JPanel myGreetingsPanel = new JPanel();
		myGreetingsPanel.setBackground(Color.MAGENTA);
		myGreetingsPanel.setLayout(null);	
		
		JLabel greetingsLabel = new JLabel();
		greetingsLabel.setText(greetingsText);
		greetingsLabel.setFont(new Font("Panda",Font.PLAIN ,56));
		greetingsLabel.setBounds(400,50,1600,50);
		
		JLabel choiceAction = new JLabel();
		choiceAction.setText("What do you want to do ?");
		choiceAction.setBounds(500,100,1600,30);
		choiceAction.setFont(new Font("Panda",Font.PLAIN ,30));
		
		cancel= new JButton("Cancel"); 
		balanceButton= new JButton("Balance"); 
		putMoneyInTheAccountButton= new JButton("Put money in your account");
		takeMoneyFromTheAccountButton = new JButton("Take money from your account");
		
		balanceButton.setBounds(0,150,1600,180);
		putMoneyInTheAccountButton.setBounds(0,330,1600,180);
		takeMoneyFromTheAccountButton.setBounds(0,510,1600,180);
		cancel.setBounds(0,690,1600,180);
		
		balanceButton.addActionListener(this);
		putMoneyInTheAccountButton.addActionListener(this);
		takeMoneyFromTheAccountButton.addActionListener(this);
		cancel.addActionListener(this);
		

		
		myGreetingsPanel.add(greetingsLabel);
		myGreetingsPanel.add(choiceAction);
		myGreetingsPanel.add(putMoneyInTheAccountButton);
		myGreetingsPanel.add(balanceButton);
		myGreetingsPanel.add(takeMoneyFromTheAccountButton);
		myGreetingsPanel.add(cancel);
		
		
		mainFrame.add(myGreetingsPanel);
		mainFrame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == submit) 
		{
			name = nameField.getText();
			//to avoid a null value for the variable gender
			try
			{
				gender = groupRadioButton.getSelection().getActionCommand();
			}catch(NullPointerException ex){
				//JOptionPane.showMessageDialog(null, "Please selecte a gender");
			}
			
			
			if(gender == "Male") 
			{
				greetingsText = "Hallo mister " + name ;
			}
			else if(gender == "Female") 
			{
				greetingsText = "Hallo miss " + name ;
			}
			else if(gender == "Diverse") 
			{
				greetingsText = "Hallo " + name ;
			}
			else if(gender == null )
			{
				maleIsSelected = false;
				femaleIsSelected = false;
				diverseIsSelected= false;
			}
			
			
			if (name.isEmpty() && gender == null) 
			{
				JOptionPane.showMessageDialog(null, "Please enter your name and your gender");
			}
			else if (name.isEmpty()) 
			{
				JOptionPane.showMessageDialog(null, "Please enter your name ");
			}
			else if(gender == null)
			{
				JOptionPane.showMessageDialog(null, "Please choose your gender");
			}

			else 
			{
				TheMainBankView(); //cancel, balance, putMoneyInTheAccount, takeMoneyFromTheAccount
			}
		}

		
		else if(e.getSource() == balanceButton)
		{
			JOptionPane.showMessageDialog(null, "Your balance is " + balance + " euro");
		}
		else if(e.getSource() == putMoneyInTheAccountButton)
		{
			moneyToPutInput = JOptionPane.showInputDialog(null, "How much do you want to pay in?");
			balance += Integer.parseInt(moneyToPutInput);
			
			
		}
		else if(e.getSource() == takeMoneyFromTheAccountButton)
		{
			moneyToTakeInput = JOptionPane.showInputDialog(null, "How much do you want to take from your account?");
			moneyToTake = Integer.parseInt(moneyToTakeInput);
			
			if(moneyToTake > balance)
			{
				JOptionPane.showMessageDialog(null, "Sorry you can' t have this money because you didn' t have it\n"
						+ "your have just " + balance + " euro in your account");
			}
			else if(moneyToTake == balance)
			{
				/*
				 * I have to implement a variable that will store the status of the confirmDialog and then try to work with it!
				 * **/
				confirmationTakeAllMony = JOptionPane.showConfirmDialog(null, "The money that you want to take is all what you have in your account \n"
						+ "Do you want to take all your money?");
			
				if(confirmationTakeAllMony == JOptionPane.YES_OPTION)
				{
					balance -= moneyToTake;
					JOptionPane.showMessageDialog(null, "You took " + moneyToTake + " euro from your account \n"
							+ "your new balance is " + balance + " Euro \n"
									+ "Now you are a poor !" );
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Greet choice! don't take all your money otherwise you will become poor \n"
							+ "and the poor people don't have place in our society");
				}
			}
			else 
			{
				balance -= moneyToTake;
				JOptionPane.showMessageDialog(null, "You took " + moneyToTake + " euro from your account \n"
						+ "your new balance is " + balance );
			}
		}
		else if(e.getSource() == cancel)
		{
			mainFrame.dispose();
		}

			
	}

}
