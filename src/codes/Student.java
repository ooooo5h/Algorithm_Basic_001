package codes;

public class Student {
	
//	멤버변수는 왠만하면 private로 생성
	private String name;
	private String no;
	
//	마우스 우클릭 > Source > constructor 및 getter, setter 생성
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}
