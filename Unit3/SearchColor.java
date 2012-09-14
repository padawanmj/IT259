import java.util.Scanner;
import java.util.InputMismatchException;

public class SearchColor
{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		String[] validColors = {"Red", "Brown", "Blue", "White"};
		Boolean isValid = false;
		while( !isValid )
		{
			System.out.println("Please enter your favorite color:");
			String fav = scanner.nextLine();
			try 
			{
				int x = 0;
				for( x = 0; x < validColors.length; x++ )
				{
					if( validColors[x].equals(fav) )
					{
						isValid = true;
						System.out.println( fav + " is your favorite color too?!");
						return;
					}
				}
				throw new InputMismatchException("Invalid color " + fav);
			}
			catch (InputMismatchException e)
			{
				System.out.println("Why do you hate me sooo! " + e.getMessage());
			}			
		}
	}	
}