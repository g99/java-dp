package iterator;

public class Student {
	private String name;
	private String subject;
	public Student(String subject, String name) {
		this.name = name;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	@Override
	public String toString() {
		return "학생정보 [name=" + name + ", subject=" + subject + "]";
	}
	
}
