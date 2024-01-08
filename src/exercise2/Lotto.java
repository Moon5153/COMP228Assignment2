package exercise2;
import java.util.Random;
/*Author: Najmun Nahar
 * Lab Assignment-2
 * Course: COMP228-004
 * Exercise No: 2
 * Date: 04-06-2021
 */
public class Lotto {
	
	//Instantiate an object
	Random random=new Random();
	
	//Initialize an array of size 3
	int array[]=new int[3];
	
	//Null Constructor 
	public Lotto()
	{
		//Populate the array with random numbers
		array[0]=random.nextInt(9)+1; // 1 is added to make sure the numbers are from 1 to 9 instead of 0 to 8
		array[1]=random.nextInt(9)+1;
		array[2]=random.nextInt(9)+1;
	}
	
	//Method to return the array
	public int[] returnArray()
	{
		return array;
	}

}
