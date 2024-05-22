package de.example.bank;

import javax.swing.*;

public class ErsteBank
{
    public static void main(String[] args)
    {
        String name = "";
        String gender;
        String choice;
        String money;
        //String moneyToTake;
        int confirm;
        int balance = 0;
        int genderNumber = 0;

        boolean startName = true;
        boolean startGender = false;
        boolean startChoice = false;


        while(startName)
        {
            name = JOptionPane.showInputDialog(null, "Wellcome to the Bank Diallo please enter your name");//The Wellcome message


            if(name.isEmpty())//to force the user to give a name
            {
                name = JOptionPane.showInputDialog(null, "Wellcome to the Bank Diallo please enter your name");//The Wellcome message
            }/*
			while(name.isEmpty())
			{
				name = JOptionPane.showInputDialog(null, "Wellcome to the Bankinformatic please enter your name");
			} */
            else if(name == null)
            {
                JOptionPane.showMessageDialog(null, "You cancelled it see you next time");
            }
            else
            {
                startName = false;
                startGender = true;
            }
        }

        while(startGender)
        {
            gender = JOptionPane.showInputDialog(null, "Please choice your gender \n" +
                    "Press 1 if you are male \n" +
                    "Press 2 if you are a female \n " +
                    "Press 3 if you are special ", "Gender", 1 );

            //genderNumber = Integer.parseInt(gender);

            while(gender.isEmpty())//to force the user to give the gender
            {
                gender = JOptionPane.showInputDialog(null, "Please choice your gender \n" +
                        "Press 1 if you are male \n" +
                        "Press 2 if you are a female \n " +
                        "Press 3 if you are special ", "Gender", 1 );

            }
			/*
			while(gender == null)
			{

			}*/
            genderNumber = Integer.parseInt(gender);

            if((genderNumber == 1) || (genderNumber == 2) || (genderNumber == 3))
            {

                startChoice = true;
                startGender = false;
            }
            else if(gender == null)
            {
                JOptionPane.showMessageDialog(null, "You cancelled it see you next time");
            }

			/*
			else
			{
				gender = JOptionPane.showInputDialog(null, "Please choice your gender \n" +
							"Press 1 if you are male \n" +
							"Press 2 if you are a female \n " +
							"Press 3 if you are special ", "Gender", 1 );
			}*/


        }


        while(startChoice)//allow the user to make a choice
        {
            if(genderNumber == 1)//for the mans
            {
                choice = JOptionPane.showInputDialog(null, "Wellcome mister " + name +
                                "\n Press 1 to show your balance " +
                                "\n Press 2 to put money in your account" +
                                "\n Press 3 to take money from your account" +
                                "\n Press 0 when you want to break the process"
                        , " Choice"
                        ,-1);

                while(choice.isEmpty())//to force the user to make a choice
                {
                    choice = JOptionPane.showInputDialog(null, "Wellcome mister " + name +
                                    "\n Press 1 to show your balance " +
                                    "\n Press 2 to put money in your account" +
                                    "\n Press 3 to take money from your account" +
                                    "\n Press 0 when you want to break the process"
                            , " Choice"
                            ,-1);
                }
                while(choice == null)
                {
                    JOptionPane.showMessageDialog(null, "You cancelled it see you next time");
                }

                int choiceNumber = Integer.parseInt(choice);//converte the choice in int

                if(choiceNumber == 0)
                {
                    startChoice = false;
                    JOptionPane.showMessageDialog(null, "See you later mister " + name , "Message" , 1);

                }else if(choiceNumber == 1)
                {
                    JOptionPane.showMessageDialog(null, "Mister " + name + " your balance is " + balance + " euro", "Info" , 1);
                }
                else if(choiceNumber == 2)
                {
                    money = JOptionPane.showInputDialog(null, "How much do you want to put in ? ", "Question", 3);

                    int moneyNumber = Integer.parseInt(money);

                    balance +=moneyNumber;

                    JOptionPane.showMessageDialog(null, "Thank you mister " + name + " your money is avalable rightnow in your account", "Info",-1);
                }
                else if(choiceNumber == 3)
                {
                    money = JOptionPane.showInputDialog(null,  "How much do you want to take ? ", "Question", 3);

                    int moneyNumber = Integer.parseInt(money);

                    //To check if the costumer has enough money
                    if(moneyNumber < balance)
                    {
                        balance -= moneyNumber ;
                        JOptionPane.showMessageDialog(null, "You took " + moneyNumber + " euro from your account. \n" +
                                "Your new balance is : " + balance + " euro", "Info" , 1);
                    }
                    else if(moneyNumber > balance)
                    {
                        JOptionPane.showMessageDialog(null, "Sorry mister " + name + " but you don't have this money in your account\n" +
                                "Please check your balance again", "Error_Message" , 0);
                    }
                    else if(moneyNumber == balance)
                    {
                        confirm = JOptionPane.showConfirmDialog(null, "If you take this money your balance will be 0 euro do you want to pursuive ?", "Question" , 2);


                        if(confirm == 0)
                        {
                            balance -= moneyNumber ;
                            JOptionPane.showMessageDialog(null, "You took " + moneyNumber + " euro from your account. \n" +
                                    "Your new balance is : " + balance + " euro", "Info" , 1);
                        }
                        else if(confirm == 1)
                        {
                            JOptionPane.showMessageDialog(null, "Good idea mister " + name + " otherwise you will be poor and become homeless ", "Info" , 1);
                        }
                    }


                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Mister " + name + " please give a number between 0-3", "Error_Message", 0);
                }


            }

            else if(genderNumber == 2)//For the female
            {
                choice = JOptionPane.showInputDialog(null, "Wellcome misses " + name +
                                "\n Press 1 to show your balance " +
                                "\n Press 2 to put money in your account" +
                                "\n Press 3 to take money from your account" +
                                "\n Press 0 when you want to break the process"
                        , " Choice"
                        ,-1);

                while((choice==null) || (choice.isEmpty()))//to force the user to make a choice
                {
                    choice = JOptionPane.showInputDialog(null, "Wellcome misses" + name +
                                    "\n Press 1 to show your balance " +
                                    "\n Press 2 to put money in your account" +
                                    "\n Press 3 to take money from your account" +
                                    "\n Press 0 when you want to break the process"
                            , " Choice"
                            ,-1);
                }

                int choiceNumber = Integer.parseInt(choice);//converte the choice in int

                if(choiceNumber == 0)
                {
                    startChoice = false;
                    JOptionPane.showMessageDialog(null, "See you later misses " + name , "Message" , 1);

                }else if(choiceNumber == 1)
                {
                    JOptionPane.showMessageDialog(null, "Misses " + name + " your balance is " + balance + " euro", "Info" , 1);
                }
                else if(choiceNumber == 2)
                {
                    money = JOptionPane.showInputDialog(null, "How much do you want to put in ? ", "Question", 3);

                    int moneyNumber = Integer.parseInt(money);

                    balance +=moneyNumber;

                    JOptionPane.showMessageDialog(null, "Thank you misses " + name + " your money is avalable rightnow in your account", "Info",-1);
                }
                else if(choiceNumber == 3)
                {
                    money = JOptionPane.showInputDialog(null,  "How much do you want to take ? ", "Question", 3);

                    int moneyNumber = Integer.parseInt(money);

                    //To check if the costumer has enough money
                    if(moneyNumber < balance)
                    {
                        balance -= moneyNumber ;
                        JOptionPane.showMessageDialog(null, "You took " + moneyNumber + " euro from your account. \n" +
                                "Your new balance is : " + balance + " euro", "Info" , 1);
                    }
                    else if(moneyNumber > balance)
                    {
                        JOptionPane.showMessageDialog(null, "Sorry misses " + name + " but you don't have this money in your account\n" +
                                "Please check your balance again", "Error_Message" , 0);
                    }
                    else if(moneyNumber == balance)
                    {
                        confirm = JOptionPane.showConfirmDialog(null, "If you take this money your balance will be 0 euro do you want to pursuive ?", "Question" , 2);


                        if(confirm == 0)
                        {
                            balance -= moneyNumber ;
                            JOptionPane.showMessageDialog(null, "You took " + moneyNumber + " euro from your account. \n" +
                                    "Your new balance is : " + balance + " euro", "Info" , 1);
                        }
                        else if(confirm == 1)
                        {
                            JOptionPane.showMessageDialog(null, "Good idea misses " + name + " otherwise you will be poor and become homeless ", "Info" , 1);
                        }
                    }


                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Misses " + name + " please give a number between 0-3", "Error_Message", 0);
                }


            }

            else if(genderNumber == 3)//For the special
            {
                choice = JOptionPane.showInputDialog(null, "Wellcome Dear " + name +
                                "\n Press 1 to show your balance " +
                                "\n Press 2 to put money in your account" +
                                "\n Press 3 to take money from your account" +
                                "\n Press 0 when you want to break the process"
                        , " Choice"
                        ,-1);

                while((choice==null) || (choice.isEmpty()))//to force the user to make a choice
                {
                    choice = JOptionPane.showInputDialog(null, "Wellcome Dear " + name +
                                    "\n Press 1 to show your balance " +
                                    "\n Press 2 to put money in your account" +
                                    "\n Press 3 to take money from your account" +
                                    "\n Press 0 when you want to break the process"
                            , " Choice"
                            ,-1);
                }

                int choiceNumber = Integer.parseInt(choice);//converte the choice in int

                if(choiceNumber == 0)
                {
                    startChoice = false;
                    JOptionPane.showMessageDialog(null, "See you later dear " + name , "Message" , 1);

                }else if(choiceNumber == 1)
                {
                    JOptionPane.showMessageDialog(null, "Dear " + name + " your balance is " + balance + " euro", "Info" , 1);
                }
                else if(choiceNumber == 2)
                {
                    money = JOptionPane.showInputDialog(null, "How much do you want to put in ? ", "Question", 3);

                    int moneyNumber = Integer.parseInt(money);

                    balance +=moneyNumber;

                    JOptionPane.showMessageDialog(null, "Thank you misses " + name + " your money is avalable rightnow in your account", "Info",-1);
                }
                else if(choiceNumber == 3)
                {
                    money = JOptionPane.showInputDialog(null,  "How much do you want to take ? ", "Question", 3);

                    int moneyNumber = Integer.parseInt(money);

                    //To check if the costumer has enough money
                    if(moneyNumber < balance)
                    {
                        balance -= moneyNumber ;
                        JOptionPane.showMessageDialog(null, "You took " + moneyNumber + " euro from your account. \n" +
                                "Your new balance is : " + balance + " euro", "Info" , 1);
                    }
                    else if(moneyNumber > balance)
                    {
                        JOptionPane.showMessageDialog(null, "Sorry dear " + name + " but you don't have this money in your account\n" +
                                "Please check your balance again", "Error_Message" , 0);
                    }
                    else if(moneyNumber == balance)
                    {
                        confirm = JOptionPane.showConfirmDialog(null, "If you take this money your balance will be 0 euro do you want to pursuive ?", "Question" , 2);


                        if(confirm == 0)
                        {
                            balance -= moneyNumber ;
                            JOptionPane.showMessageDialog(null, "You took " + moneyNumber + " euro from your account. \n" +
                                    "Your new balance is : " + balance + " euro", "Info" , 1);
                        }
                        else if(confirm == 1)
                        {
                            JOptionPane.showMessageDialog(null, "Good idea dear " + name + " otherwise you will be poor and become homeless ", "Info" , 1);
                        }
                    }


                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Dear " + name + " please give a number between 0-3", "Error_Message", 0);
                }


            }





        }

    }
}
