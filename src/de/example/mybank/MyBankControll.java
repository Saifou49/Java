package de.example.mybank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyBankControll extends MyBankView implements ActionListener
{
	protected JButton submit;
	
	MyBankControll()
	{
		if(name.isEmpty() && gender.isEmpty()) 
		{
			
		}
	}
	 void submit()
	{
		submit.setText("Submit");
		submit.setSize(60,30);
		submit.setFocusable(true);
		submit.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == submit) 
		{
			name = nameField.getText();
			gender = groupRadioButton.getSelection().getActionCommand();
			
			
		}
	}

}
