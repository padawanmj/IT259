import java.util.Scanner;
import java.util.InputMismatchException;

public class FavoriteColor
{
	private Scanner scanner = new Scanner(System.in);
	private String[] validColors = {"Red", "Blue", "White"};

	public String getFavorite()
	{
		System.out.println("Please enter your favorite color:");
		String fav = scanner.nextLine();
		return this.sanitizeInput(fav);
	}

	private String sanitizeInput(String input)
	{
		int x = 0;
		for( x = 0; x < validColors.length; x++ )
		{
			if( validColors[x].equals(input) )
			{
				System.out.println( input + " is your favorite color too?!");
				return input;
			}
		}
		throw new InputMismatchException("Invalid color " + input);
	}

}