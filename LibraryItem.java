
public class LibraryItem {
	
	private String libItemType;
	private String serialNumber;
	private int shelfNum;
	private int shelfIndex;
	private String methodName;
	
	
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getLibItemType() {
		return libItemType;
	}
	public void setLibItemType(String libItemType) {
		this.libItemType = libItemType;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}	
	public int getShelfNum() {
		return shelfNum;
	}
	public void setShelfNum(int shelfNum) {
		this.shelfNum = shelfNum;		
	}
	public int getShelfIndex(){
		return shelfIndex;
	}
	public void setShelfIndex(int shelfIndex){
		this.shelfIndex = shelfIndex;
	}
	public LibraryItem(String methodName, String serialNumber, int shelfNum, int shelfIndex, String libItemType){
		this.methodName = methodName;
		this.libItemType = libItemType;
		this.serialNumber = serialNumber;
		this.shelfIndex = shelfIndex;
		this.shelfNum = shelfNum;
	}
	
	
}
