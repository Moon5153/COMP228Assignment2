package exercise3;
import java.util.Scanner;

public class TestPlayer {

	public static void main(String[] args) {
		//Instantiate scanner object
		Scanner scan = new Scanner(System.in);
		
		//Input player name
		System.out.println("Enter Player name: ");
		String playerName=scan.nextLine();
		
		//Input player gender
		System.out.println("Enter Player Gender: ");
		String playerGender=scan.nextLine();
		
		//Input player country
		System.out.println("Enter Player country: ");
		String playerCountry=scan.nextLine();
		
		//Input player team name
		System.out.println("Enter Player Team name: ");
		String playerTeamName=scan.nextLine();
		
		//Input player age
		System.out.println("Enter Player Age: ");
		int playerAge=scan.nextInt();
		
		//Input player weight
		System.out.println("Enter Player weight: ");
		int playerWeight=scan.nextInt();
		
		//Call method with one parameter
		Player.playerInfo(playerName);
		
		//Call method with two parameter
		Player.playerInfo(playerGender,playerCountry);
		
		//Call method with three parameters
		Player.playerInfo(playerTeamName,playerAge,playerWeight);
		
		

	}

}
