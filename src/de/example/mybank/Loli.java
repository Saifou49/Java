package de.example.mybank;
import javax.swing.*;

public class Loli
{
	
	

	
	public static void main(String[] args) 
	{

	JFrame jFrame = new JFrame();

	String[][] tableData = {{"01", "Adam", "1986"},
	{"02", "John", "1990"},
	{"03", "Sam", "1989"},
	{"04", "Derek", "1991"},
	{"05", "Ben", "1981"}};

	String[] tableColumn = {"ID", "FIRST NAME", "BIRTH YEAR"};

	JTable jTable = new JTable(tableData, tableColumn);

	jTable.setBounds(30, 40, 230, 280);

	JScrollPane jScrollPane = new JScrollPane(jTable);
	jFrame.add(jScrollPane);
	jFrame.setSize(350, 300);
	jFrame.setVisible(true);
	}
}
	
	

