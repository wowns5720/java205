package ch07;

public class Male extends Person {

	public Male(String name, String secNum, int age, float height) {
		super(name, secNum, age);
	}
	void greet() {
		System.out.println("안녕하세요. 저는 남자입니다.");
	}
	
}
