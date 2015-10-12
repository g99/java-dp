package singleton;

/**
 * @file_name : Note.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 10. 12.
 * @story     : 싱글톤 패턴
 */
public class Singleton {
	/**
	 * [싱글톤 패턴]
	 * => 단 하나의 인스턴스
	 * 어플리케이션 내에서 인스턴스 갯수를 단 하나만 존재하도록 강제하는 패턴
	 * 이렇게 하나만 만들어지는 클래스의 오브젝트(객체)는 어플리케이션(프로젝트) 내에서
	 * 전역적으로 접근이 가능하다.
	 */
	public static void main(String[] args) {
		SingletonService s = SingletonService.getInstance();
		SingletonService s2 = SingletonService.getInstance();
		if (s == s2) {
			System.out.println("두 인스턴스가 동일 주소값을 가짐");
		} else {
			System.out.println("두 인스턴스가 다른 주소값을 가짐");
		}
		s.test();
		s2.test();
	}
}

class SingletonService {
	private static SingletonService instance = new SingletonService();

	public static SingletonService getInstance() {
		return instance;
	}

	public void test() {
		System.out.println("싱글톤"); // 연관관계가 깊어진다.
		// return으로 결과를 버리면 연관관계가 앝아진다. Loose Coupling
	}
}
