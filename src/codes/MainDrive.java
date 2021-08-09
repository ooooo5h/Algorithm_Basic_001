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
		
		Student st1 = new Student("전은형", "001");
		Student st2 = new Student("류준열", "002");
		Student st3 = new Student("김준현", "003");
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		
		for (Student student : studentList) {
			System.out.println(student.getName());
			System.out.println(student.getNo());			
		}
			
		Scanner myScan = new Scanner(System.in);		
		
		while(true) {
			
			System.out.println("계속 검색을 하고 싶으면 y,  종료하고 싶으면 n을 입력하세요.");
			String input = myScan.next();
			
			if(input.equals("y")) {

				System.out.println("검색을 시작합니다.");				
				String inputName = myScan.next();
				
				boolean containstudentName = false;				
				
				for (Student student : studentList) {
					
					if(student.getName().equals(inputName)) {
						System.out.println("해당 학생의 학번은 : " + student.getNo() + "입니다.");

						containstudentName = true;
					}					
				}

				if(!containstudentName) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
				
			}
			else if (input.equals("n")) {
				break;

			}			
		}
		
		System.out.println("프로그램을 종료합니다.");	
	}
}
