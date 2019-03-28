
public class CD extends Borrowable {

	private String title;

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public CD(String methodName, String serialNumber, int shelfNum, int shelfIndex, String libItemType, String title){
		super (methodName, serialNumber, shelfNum, shelfIndex, libItemType);
		this.title = title;
	}
	
	
}
