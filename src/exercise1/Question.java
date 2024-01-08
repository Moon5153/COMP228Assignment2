package exercise1;
import javax.swing.JOptionPane;
import java.util.Random;

/*Author: Najmun Nahar
 * Lab Assignment-2
 * Course: COMP228-004
 * Exercise No: 1
 * Date: 04-06-2021
 */
public class Question {

	//Variable Declaration
	
	String userInput; 							//variable to store user input
	int numQuestions;						    //variable to count number of questions
	String[] correctAnswer= {"d","b","c","b"};  //A String array storing correct answers
	int count=0;
	int i;
	

	//Method to simulate questions
	public void prepareQuestion()
	{
		//Question 1
		String question1="Which one of the following symbols indicates a single line comment in Java application source code:"
				+ "\na. \\\\"
				+"\nb. ##"
				+"\nc. **"
				+"\nd. //"
				+"\ne. /*";
		
		//Question 2
		String question2="Which one of the following symbols indicates a multi-line comment in Java application source code?"
				+ "\na. ##"
				+"\nb. /* */"
				+"\nc. //"
				+"\nd. || ||"
				+"\ne. **";
		
		//Question 3
		String question3="Which of the following components does a Java application need to have at least one of?"
				+"\na. Non-static Method"
				+"\nb. Instance variable"
				+"\nc. Class"
				+"\nd. Local variable"
				+"\ne. Global variable";
		
		//Question 4
		String question4="Which of the following Java program units defines a group of related objects?"
				+"\na.Java default Constructor"
				+"\nb.Java Class"
				+"\nc. Java method"
				+"\nd. Java"
				+"\ne. None of the above";
				
		
		//String array storing all questions
		String[] questionnaire= {question1,question2,question3,question4};
		
		//Number of questions 
		numQuestions=questionnaire.length;
		
		for(i=0;i<numQuestions;i++)
		{
			int flag=-1;
			while(flag<0)
			{
				//JOptionPane Input dialog
				String input=JOptionPane.showInputDialog(questionnaire[i]);
				userInput=input.toLowerCase();//user answer converted to lower case
				
				//Checking Validity of user input
				if(userInput.equals("a")||userInput.equals("b")||userInput.equals("c")||userInput.equals("d")||userInput.equals("e"))
				{
					//Call method testAnswer
					testAnswer();
					flag++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Input! Please Enter a valid Input. Valid inputs are:\na b c d e");
				}
			}
			
			
		}
	}
	
	//Method to check if Answers are correct
	public void testAnswer()
	{
		
			String message;
			if((i==0&&userInput.equals(correctAnswer[0]))||(i==1&&userInput.equals(correctAnswer[1]))||(i==2&&userInput.equals(correctAnswer[2]))||(i==3&&userInput.equals(correctAnswer[3])))
			{
				message=displayMessage("correct");
				JOptionPane.showMessageDialog(null, message);
				count++;
			}
			else
			{
				message=displayMessage("wrong");
				JOptionPane.showMessageDialog(null, message+ "\nThe Correct answer is: "+correctAnswer[i]);
			}
		
			
	}
	
	//Method to display Random message
	public String displayMessage(String answerType)
	{
		//Instantiate an object
		Random randomObject=new Random();
		
		//Check if answer is correct
		if(answerType.equals("correct"))
		{
			switch(randomObject.nextInt(3)) //generates random messages upto 3 times 
			{
				case 0:
					return "Excellent!";
				case 1:
					return "Keep up the good job!";
				case 2:
					return "Well done!";
			}
		}
		
		//Check if answer is wrong
		else if(answerType.equals("wrong"))
		{
			switch(randomObject.nextInt(3)) //generates random messages upto 3 times 
			{
				case 0:
					return "Wrong! Please Try again";
				case 1:
					return "No. Keep trying";
				case 2:
					return "No. Another attempt!";
			}
		}
		
		return null;
	}
	
	//Method to display results to the user
	public void getAnswer()
	{
		prepareQuestion();
		float percentage=((float)count/numQuestions)*100;
		JOptionPane.showMessageDialog(null,"Correct answers: "+count+"\nYour Score is: "+percentage+"%");
		
	}

	
	
}
