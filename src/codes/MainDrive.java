package codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
			
		
//		y, n 입력을 받아야하는데, 
//		반복문 안에서 만들면 메모리 낭비(반복문 돌때마다 스캐너가 생성됨)니까 반복문 밖에서 생성!
		Scanner myScan = new Scanner(System.in);		
		
//		무한 루프를 돌리자
		while(true) {
			System.out.println("계속 검색을 하고 싶으면 y,  종료하고 싶으면 n을 입력하세요.");
			String input = myScan.next();
			
			if(input.equals("y")) {
//				입력한 값이 y면, 계속 돌고
				System.out.println("검색을 시작합니다.");
				
//				학생의 이름을 입력했는데, 
				String inputName = myScan.next();
				for (Student student : studentList) {
					
//					리스트에 있는 이름이라면, 해당 학생의 학번 출력
					if(student.getName().equals(inputName)) {
						System.out.println("해당 학생의 학번은 : " + student.getNo() + "입니다.");
					}
					
				}
				
			}
			else if (input.equals("n")) {
				break;
//				입력한 값이 n이면, break; 탈출 후 
			}			
		}
		
		System.out.println("프로그램을 종료합니다.");
//		프로그램 종료합니다 메세지 띄우기.
//		input == y 가 아닌 이유 
//		참조형 변수(String)를 ==으로 비교하면, 
//		두 변수에 적힌 메모리 주소가 같은가? 라는 질문으로 이해하기 때문에
//		참조형 변수간의 동일 여부 비교는 equals를 쓰는게 정석임.
	
	}

}
