public class Academic extends Stuff {

	private Borrowable borrowedItem[];

	public Academic(String methodName2, String stuffName, String stuffSurname, String libraryID, String stuffType) {
		super(methodName2, stuffName, stuffSurname, libraryID, stuffType);
	}

	public Borrowable[] getBorrowedItem() {
		return borrowedItem;
	}

	public void setBorrowedItem(Borrowable[] borrowedItem) {
		this.borrowedItem = borrowedItem;
	}

}
