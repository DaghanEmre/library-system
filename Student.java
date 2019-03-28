
public class Student extends Stuff {

	private Borrowable borrowedItem;

	public Borrowable getBorrowedItem() {
		return borrowedItem;
	}
	public void setBorrowedItem(Borrowable borrowedItem) {
		this.borrowedItem = borrowedItem;
	}
	public Student(String methodName2, String stuffName, String stuffSurname, String libraryID, String stuffType){
		super(methodName2, stuffName, stuffName, libraryID, stuffType);
	}	
	
}