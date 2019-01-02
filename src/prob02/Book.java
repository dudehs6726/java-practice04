package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	public Book(int bookNo, String title, String author)
	{
		setBookNo(bookNo);
		setTitle(title);
		setAuthor(author);
		setStateCode(1);
	}
	
	public void rent()
	{
		if(getStateCode() == 1)
		{
			setStateCode(0);
			System.out.println(getTitle() + "이(가) 대여 됐습니다.");
		}
		
	}
	
	public void print()
	{
		String statePrint = "";
		if(getStateCode() == 1)
		{
			statePrint = "재고있음";
		}
		else if(getStateCode() == 0)
		{
			statePrint = "대여중";
		}
		
		System.out.println("책 제목:" + getTitle() +
							", 작가:" + getAuthor() +
							", 대여 유무:" + statePrint);
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
}