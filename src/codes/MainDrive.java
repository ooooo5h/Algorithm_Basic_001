package codes;

import java.util.ArrayList;
import java.util.List;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		#1. 학생 정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램을 만들기
		
//		- Student 클래스 생성 / String name, no를 가짐
//		- ArrayList에 학생정보들을 저장
//		- 계속 검색을 하시겠어요? > y : 반복
//		- n > 프로그램을 종료하겠습니다.
//		- 학생 목록에 저장된 학생 이름을 입력하면, 해당 학생의 학번을 출력
//		- 학생 목록에 저장된 학생 이름이 없으면, "없는 학생 이름입니다." 출력
		
		
//		Student를 객체화(new)해서 3명을 무대위로 등장시킴
		Student st1 = new Student("전은형", "001");
		Student st2 = new Student("류준열", "002");
		Student st3 = new Student("김준현", "003");
		
//		ArrayList에 학생 정보들을 저장하자
//		List는 java.util이 주는 인터페이스로 선택
//		List<담아줄자료형>  목록변수이름 = new ArrayList<>();
		List<Student> studentList = new ArrayList<>();
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		
//		리스트에 잘 담겼나 확인해보자
//		배열의 내용물을 꺼내볼 때는 for-each문을 쓰자
		for (Student student : studentList) {
			System.out.println(student.getName());
			System.out.println(student.getNo());
			
		}
		
		
		
		
		
		
	}

}
