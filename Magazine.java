
public class Magazine extends LibraryItem {
	
	private String magName;
	private String magPublisher;
	
	public String getMagName() {
		return magName;
	}
	public void setMagName(String magName) {
		this.magName = magName;
	}
	public String getMagPublisher() {
		return magPublisher;
	}
	public void setMagPublisher(String magPublisher) {
		this.magPublisher = magPublisher;
	}
	public Magazine(String methodName, String serialNumber, int shelfNum, int shelfIndex, String libItemType, String magName, String magPublisher){
		super (methodName, serialNumber, shelfNum, shelfIndex, libItemType);
		this.magName = magName;
		this.magPublisher = magPublisher;
	}
}
