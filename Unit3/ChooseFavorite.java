public class ChooseFavorite
{

	private static FavoriteColor favorite = new FavoriteColor();

	public static void main(String[] args) {
		String result = null;
		while(result == null)
		{
			try 
			{
				result = favorite.getFavorite();
			}
			catch (Exception e)
			{
				System.out.println("Why do you hate me sooo! " + e.getMessage());
			}
		}
	}
}