package iterator;

public class MultiplexIterator implements MyIterator {
	Multiplex multiplex;
	int index;
	
	public MultiplexIterator(Multiplex multiplex) {
		this.multiplex = multiplex;
		index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index < multiplex.getCount()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Movie movie = multiplex.getMovieAt(index);
		index ++;
		return movie;
	}
	
}
