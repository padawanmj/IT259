public class BookTest
{
	// the out method is a helper for System.out.println
	// @param {Book} book - book to print the cost for
	public static void out(Book book)
	{
		System.out.println(book.getTitle() + " book costs " + book.getPrice());
	}
	
	// main program
	public static void main(String[] args)
	{
		// create the Fiction type book
		Fiction fBook = new Fiction("Don Quixote");
		// create the NonFiction type book
		NonFiction nBook = new NonFiction("The Structure and Distribution of Coral Reefs");
		// call setPrice on each
		fBook.setPrice();
		nBook.setPrice();
		// print the output using our helper
		out(fBook);
		out(nBook);
	}
}