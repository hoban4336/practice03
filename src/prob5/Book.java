package prob5;

public class Book {
	int bookNo;
	String title;
	String author;
	int stateCode =1;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	public void rent(){
		stateCode = 0 ;
		System.out.println(title+"이(가) 대여 되었습니다.");
	}
	public int print(){
		return stateCode;
	}
}
