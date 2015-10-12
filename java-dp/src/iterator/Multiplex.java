package iterator;

public class Multiplex implements MultiplexService{
	private Movie[] movies;
	private int last = 0; // 실제로 운영되는 상영관
	
	public Multiplex(int size) {
		this.movies = new Movie[size];
	}
	
	// Create
	public void add(Movie movie) {
		movies[last] = movie;
		last++;
	}
	// Read
	public Movie getMovieAt(int index) {
		return movies[index];
	}
	public int getCount() {
		return last;
	}
	@Override
	public MyIterator iterator() {
		return new MultiplexIterator(this);
	}
}
