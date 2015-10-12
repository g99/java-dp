package iterator;

public class BoookMain {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(100); // 100권을 담을 수 있는 책장
		bookShelf.add(new Book("자바의 정석"));
		bookShelf.add(new Book("디자인 패턴"));
		bookShelf.add(new Book("오라클문법"));
		bookShelf.add(new Book("JSP프로그래밍"));
		MyIterator it = bookShelf.iterator(); // 얕은 복사 
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName() + " ");
		}
	}
}
