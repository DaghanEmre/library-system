
public class Book extends Borrowable {

	private String bookName;
	private String bookPublisher;
	private String bookAuthor;
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public Book(String methodName, String serialNumber, int shelfNum, int shelfIndex, String LibItemType, String bookName, String bookPublýsher, String bookAuthor){
		super(methodName, serialNumber, shelfIndex, shelfNum, LibItemType);
		this.bookAuthor = bookAuthor;
		this.bookName = bookName;
		this.bookPublisher = bookPublýsher;
	}
	
}
