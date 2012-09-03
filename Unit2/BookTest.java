public class BookTest
{

	public static void out(Book book)
	{
		System.out.println(book.getTitle() + " book costs " + book.getPrice());
	}
	
	public static void main(String[] argv)
	{
		Fiction fBook = new Fiction("Don Quixote");
		NonFiction nBook = new NonFiction("The Structure and Distribution of Coral Reefs");
		fBook.setPrice();
		nBook.setPrice();
		out(fBook);
		out(nBook);
	}
}