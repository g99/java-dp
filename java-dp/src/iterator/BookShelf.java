package iterator;

public class BookShelf implements BookShelfService {
	private Book[] books;
	private int last = 0;

	public BookShelf(int size) {
		books = new Book[size];
	}
	
	// 추가(Create)
	public void add(Book book) {
		this.books[last] = book;
		last++;
	}
	
	// 조회(Read) 
	public Book getBookAt(int index) {
		return books[index];
	}
	public int getCount() { // 배열의 사이즈가 아닌 원소의 갯수
		return last;
	}
	
	@Override
	public MyIterator iterator() {
		return new BookShelfIterator(this); // this는 객체생성후에 만들어진 자기자신의 객에
	}
}
