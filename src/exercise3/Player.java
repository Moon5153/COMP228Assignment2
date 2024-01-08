package exercise3;
/*Author: Najmun Nahar
 * Lab Assignment-2
 * Course: COMP228-004
 * Exercise No: 3
 * Date: 04-06-2021
 */

public class Player {

	//Static method with one parameter
	public static void playerInfo(String name)
	{
		System.out.println("Player name is: "+name);
	}
	//Static method with two parameters
	public static void playerInfo(String gender,String country)
	{
		System.out.println("Player Gender: "+gender+"\nPlayer Country: "+country);
	}
	//Static method with three parameters
	public static void playerInfo(String teamName,int age,int weight )
	{
		System.out.println("Player Team Name: "+teamName+"\nPlayer Age: "+age+"\nPlayer weight: "+weight);
	}
}
