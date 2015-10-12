package iterator;

public class HanbitIterator implements MyIterator{
	HanbitENI hanbit;
	int index;
	public HanbitIterator(HanbitENI hanbit) {
		this.hanbit = hanbit;
		index = 0;
	}
	@Override
	public boolean hasNext() {
		if (index < hanbit.getCount()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		return hanbit.getStudentAt(index++);
	}

}
