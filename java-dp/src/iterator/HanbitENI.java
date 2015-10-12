package iterator;

public class HanbitENI implements HanbitENIService {
	Student[] student;
	int last;

	public HanbitENI(int size) {
		student = new Student[size];
		last = 0;
	}

	// 생성
	public void add(Student student) {
		this.student[last] = student;
		last++;
	}

	// 검색
	public Student getStudentAt(int index) {
		return student[index];
	}

	public int getCount() {
		return last;
	}

	// 확장된 검색 이름으로 검색하기	
	public Student searchByName(String name) {
		MyIterator it = this.iterator();
		Student temp = null;
		while (it.hasNext()) {
			temp = (Student) it.next();
			if (temp.getName().equals(name)) {
				return temp;
			}
		}
		return temp;
	}
	// 확장된 검색 과목명으로 검색하기
	public Student[] searchBySubject(String subject) {
		MyIterator it = this.iterator();
		Student temp = null;
		int i = 0;
		while (it.hasNext()) {
			temp = (Student) it.next();
			if (temp.getSubject().equals(subject)) {
				i++;
			}
		}
		Student[] students = new Student[i];
		i = 0;
		it = this.iterator();
		while (it.hasNext()) {
			temp = (Student) it.next();
			if (temp.getSubject().equals(subject)) {
				students[i] = temp;
				i++;
			}
		}
		return students;
	}

	@Override
	public MyIterator iterator() {
		return new HanbitIterator(this);
	}

}
