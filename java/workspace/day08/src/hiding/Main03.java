package hiding;

class StudentJava2{
	// 은닉된 멤버변수 -> 현재 블록 안에서만 접근 가능함
	private String name;
	private int age;
	
	// getter 메서드 2개
	// 은닉된 멤버변수의 값을 읽는 방법
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// setter 메서드 2개
	// 은닉된 멤버변수에 값을 넣는 방법
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Main03 {

	public static void main(String[] args) {
		// 객체생성
		StudentJava2 stj = new StudentJava2();
		
		// setter 임의의 데이터 세팅, name, age 모두
		stj.setName("학생");
		stj.setAge(28);
		
		// getter 출력, name, age 모두
		System.out.println(stj.getAge());
		System.out.println(stj.getName());
	}

}
