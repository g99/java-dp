package iterator;

public class MovieMain {
	public static void main(String[] args) {
		Multiplex multiplex = new Multiplex(100);
		multiplex.add(new Movie("트랜스포머"));
		multiplex.add(new Movie("미션임파서블"));
		multiplex.add(new Movie("인사이드아웃"));
		multiplex.add(new Movie("겨울왕국"));
		
		MyIterator it = multiplex.iterator();
		while (it.hasNext()) {
			Movie movie = (Movie) it.next();
			System.out.println(movie.getName());
		}
	}
}
