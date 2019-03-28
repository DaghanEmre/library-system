import java.util.Scanner;

public class Libmain {
	
	public static void main(String[] args) {
		Scanner newscan=new Scanner(System.in);
		String input=newscan.nextLine();
		
		Student[] newstudent = new Student[20];
		Academic[] newacademic = new Academic[20];
		Book[] newbook = new Book[20];
		Magazine[] newmagazine = new Magazine[20];
		CD[] newCD = new CD[10];
		
		do{
			
			String[] split1=input.split("\"\");
			String[] split2=input.split1[0](" ");
			
			if(split2[0].equals("AddItem")){
				
				
				 if(split2[4].equals("BOOK")){
					newbook[0] = new Book(String methodName, String serialNumber, int shelfNum, int shelfIndex, String libItemType,
								String bookName, String bookPublýsher, String bookAuthor);
					public addItem(String methodName, String serialNumber, int shelfNum, int shelfIndex){
						
						newbook[0].setMethodName(split2[0]);
						newbook[0].setSerialNumber(split2[1]);
						newbook[0].setShelfNum(split2[2]);
						newbook[0].setShelfIndex(split2[3]);
						newbook[0].setLibItemType(split2[4]);
						newbook[0].setBookName(split2[5]);
						newbook[0].setbookPublisher = split[6];
						newbook[0].setBookAuthor(split2[7]);
						
					}
					System.out.println(newbook[0].getBookName() + " is added.");	//way way :D 
					
				}
				else if(split2[4].equals("CD")){
					newCD[0] = new CD(String methodName, String serialNumber, int shelfNum, int shelfIndex, String libItemType,
							String title);
					public addItem(String methodName, String serialNumber, int shelfNum, int shelfIndex){
						
						newCD[0].setMethodName(split2[0]);
						newCD[0].setSerialNumber(split2[1]);
						newCD[0].setShelfNum(split2[2]);
						newCD[0].setShelfIndex(split2[3]);
						newCD[0].setLibItemType(split2[4]);
						newCD[0].setTitle(split2[5]);
					}
					System.out.println(newCD[0].getTitle() + " is added.");
				
				}
				else(split2[4].equals("MAGAZINE")){
					newmagazine[0] = new Magazine(String methodName, String serialNumber, int shelfNum, int shelfIndex, String libItemType, String magName, String magPublisher)
					public addItem(String methodName, String serialNumber, int shelfNum, int shelfIndex){
						
						newmagazine[0].setMethodName(split2[0]);
						newmagazine[0].setSerialNumber(split2[1]);
						newmagazine[0].setShelfNum(split2[2]);
						newmagazine[0].setShelfIndex(split2[3]);
						newmagazine[0].setLibItemType(split2[4]);
						newmagazine[0].setMagName(split2[5]);
						newmagazine[0].setMagPublisher(split2[6]);
					}	
				
					System.out.println(newmagazine[0].getMagName() + " is added.");
				}
			}
			
			else if(split2[0].equals("AddStuff")){
				
				
				if(split2[4].equals("ACADEMÝC")){
					newacademic[0] = new Academic(String methodName2, String stuffName, String stuffSurname, String libraryID, String stuffType));
					
					public addStuff(String methodName2, String stuffName, String stuffSurname, String libraryID){
						
						newacademic[0].setMethodName2(split2[0]);
						newacademic[0].setStuffName(split2[1]);
						newacademic[0].setStuffSurname(split2[2]);
						newacademic[0].setLibraryID(split2[3]);
						newacademic[0].setStuffType(split2[4]);
					}
					System.out.println(newacademic[0].getStuffName() + " is added.");
				
				}
				else(split2[4].equals("STUDENT")){
					newstudent[0] = new Student(String methodName2, String stuffName, String stuffSurname, String libraryID, String stuffType);
					
					public addStuff(String methodName2, String stuffName, String stuffSurname, String libraryID){
						
						newacademic[0].setMethodName2(split2[0]);
						newacademic[0].setStuffName(split2[1]);
						newacademic[0].setStuffSurname(split2[2]);
						newacademic[0].setLibraryID(split2[3]);
						newacademic[0].setStuffType(split2[4]);
					}
				}
			}
			else if(split2[0].equals("ListItems")){
				for(int i=0; i<newbook.length; i++){
					System.out.println(newbook[i].getSerialNumber() + " " + newbook[i].getShelfNum() + " "
									+ newbook[i].getShelfIndex() + " " + newbook[i].libItemType + " \""
									+ newbook[i].getBookName() + "\" \"" + newbook[i].getBookPublisher() + "\" \""
									+ newbook[i].getBookAuthor() + "\"");
				}
				for(int i=0; i<newCD.length; i++){
					System.out.println(newCD[i].getSerialNumber() + " " + newCD[i].getShelfNum() + " "
									+ newCD[i].getShelfIndex() + " " + newCD[i].getLibItemType() + " \""
									+ newCD[i].getTitle() + "\"");
				}
				for(int i=0; i<newmagazine.length; i++){
					System.out.println(newmagazine[i].getSerialNumber() + " "+ newmagazine[i].getShelfNum() + " "
									+ newmagazine[i].getShelfIndex() + " " + newmagazine[i].getLibItemType() + " \""
									+ newmagazine[i].getMagName() + "\" \"" + newmagazine[i].getMagPublisher() "\"");
				}
				
			}
			else if(split2[0].equals("ListStuffs")){
				for(int i=0; i<newacademic.length; i++){
					System.out.println("\"" + newacademic[i].getStuffName() + "\" \"" + newacademic[i].getStuffSurname() + "\" "
									+ newacademic[i].getLibraryID() + " " + newacademic[i].getStuffType()); 
				}
				for(int i=0; i<newstudent.length; i++){
					System.out.println("\"" + newstudent[i].getStuffName() + "\" \"" + newstudent[i].getStuffSurname() + "\" "
									+ newstudent[i].getLibraryID() + " " + newstudent[i].getStuffType());
				}
				
			}
			
			
		}
				
		
		int i;
		for(i=0;i<split1.length-1;i++){
			System.out.println(split1[i]);
		}while
	}
}