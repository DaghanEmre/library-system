
public class Stuff {

	private String stuffName;
	private String stuffSurname;
	private String libraryID;
	private String stuffType;
	private String methodName2;
	
	public String getMethodName2() {
		return methodName2;
	}
	public void setMethodName2(String methodName2) {
		this.methodName2 = methodName2;
	}
	public String getStuffType() {
		return stuffType;
	}
	public void setStuffType(String stuffType) {
		this.stuffType = stuffType;
	}
	public String getStuffName() {
		return stuffName;
	}
	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}
	public String getStuffSurname() {
		return stuffSurname;
	}
	public void setStuffSurname(String stuffSurname) {
		this.stuffSurname = stuffSurname;
	}
	public String getLibraryID() {
		return libraryID;
	}
	public void setLibraryID(String libraryID) {
		this.libraryID = libraryID;
	}
	public Stuff(String methodName2, String stuffName, String stuffSurname, String libraryID, String stuffType){
		this.methodName2 = methodName2;
		this.stuffName = stuffName;
		this.stuffSurname = stuffSurname;
		this.libraryID = libraryID;
		this.stuffType = stuffType;
	}
	
}