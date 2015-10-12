package iterator;

import java.util.Scanner;

public class HanbitMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HanbitENI hb = new HanbitENI(10); // 총정원 10명
		String name, subject;
		hb.add(new Student("빅데이터", "길동"));
		hb.add(new Student("빅데이터", "유신"));
		hb.add(new Student("빅데이터", "순신"));
		hb.add(new Student("자바", "순환"));
		hb.add(new Student("자바", "준규"));
		hb.add(new Student("자바", "성한"));
		hb.add(new Student("자바", "혜숙"));
		MyIterator it;
		System.out.println("빅데이터반은 3명이며, 길동, 유신, 순신 학생이 있고...");
		while (true) {
			System.out.println("1.학생추가 2.학생조회(유일한값이름) 3.학생조회(과목) 4.총학생수 5.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("과목명과 학생이름을 입력해주세요.");
				hb.add(new Student(scanner.next(), scanner.next()));
				break;
			case 2:
				it = hb.iterator();
				System.out.println("조회할 학생이름을 입력하세요.");
				name = scanner.next();
				Student student = hb.searchByName(name);
				if (student!=null) {
					System.out.println(student);
				}else {
					System.out.println("해당학생이 존재하지 않습니다.");
				}
				break;
			case 3:
				it = hb.iterator();
				System.out.println("조회할 과목명을 입력하세요.");
				subject = scanner.next();
				Student[] stu = hb.searchBySubject(subject);
				for (int i = 0; i < stu.length; i++) {
					System.out.println(stu[i]);
				}
				break;
			case 4:
				System.out.println("총학생수는 " + hb.getCount() + "명 입니다.");
				break;
			case 5:
				System.out.println("=========== 종료합니다. ===========");
				return;
			default:
				break;
			}
		}
		/**
		 * 1. 배열버전 2.ArrayList 버전 3.HashMap 버전
		 */
	}
}
