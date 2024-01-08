package exercise2;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		//Instantiate an object
		Lotto lotto = new Lotto();
		
		//Store the value returned to a new array 
		int[] number=lotto.returnArray();
		
		//Loop to roll 5 times
		for(int i=0;i<5;i++)
		{
			
			//Input dialog asking user to input a number between 3-27
			String input=JOptionPane.showInputDialog("Enter a number between 3 and 27");
			
			//Phrases the string and returns an integer value
			int userInput=Integer.parseInt(input);
			
			//Total of the 3 random numbers generated
			int sum=number[0]+number[1]+number[2];
			
			//Check if user input is between 3 and 27
			if(userInput>=3&&userInput<=27)
			{
				//Check if user input matches the sum
				if(userInput==sum)
				{
					JOptionPane.showMessageDialog(null, "You Won the game");
					break;
				}
				//Check if it is not the last turn and user input doesn't match the sum
				else if(i!=4&&userInput!=sum)
				{
					JOptionPane.showMessageDialog(null, "Wrong! Try Again");
				}
				
				//Last roll and user input doesn't match the sum
				else
				{
					//Print the random numbers and the Lotto number required to win
					System.out.println("The random numbers were: \nnum 1: "+number[0]+"\nnum 2: "+number[1]+"\nnum 3: "+number[2]+"\nSum: "+sum);
					JOptionPane.showMessageDialog(null, "You Lost \nComputer Wins the game");
					
				}
			}
			//User input is not between 3 and 27
			else if(i!=4&&(userInput<3||userInput>27))
			{
				JOptionPane.showMessageDialog(null, "The input should be between 3 and 27. Try Again");
			}
			//Last turn and user input is not between 3 and 27
			else
			{
				//Print the random numbers and the Lotto number required to win
				System.out.println("The random numbers were: \nnum 1: "+number[0]+"\nnum 2: "+number[1]+"\nnum 3: "+number[2]+"\nSum: "+sum);
				JOptionPane.showMessageDialog(null, "You Lost \nComputer Wins the game");
			}
			
			
		}

	}

}
