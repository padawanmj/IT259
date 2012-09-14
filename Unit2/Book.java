/**
 * Book
 *
 * Abstract class book
 * {String} title
 * {double} price
 */

public abstract class Book
{
	// protected allows the title and price to be accessed by
	// sub classes but not by other classes.
	protected String title;
	protected double price;

	// constructor
	// @param {String} title - the title of the book
	public Book(String title)
	{
		this.title = title;
	}

	// @getter
	// @return {String} title - the title of the book
	public String getTitle()
	{
		return this.title;
	}

	// @getter
	// @return {double} price - the price of the book
	public double getPrice()
	{
		return this.price;
	}

	// @setter
	public abstract void setPrice();
}