
public class Borrowable extends LibraryItem {

	private String borrowedDate;
	private Stuff borrower;
	
	public Stuff getBorrower() {
		return borrower;
	}
	public void setBorrower(Stuff borrower) {
		this.borrower = borrower;
	}
	public String getBarrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(String borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public Borrowable(String methodName, String serialNumber, int shelfNum, int shelfIndex, String libItemType){
		super(methodName, serialNumber, shelfIndex, shelfNum, libItemType);
	}
	
}
