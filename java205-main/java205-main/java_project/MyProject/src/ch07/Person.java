package ch07;

public class Person {

	private String name;
	private String secNum;
	private int age;

	public Person(String name, String secNum, int age) {
		super();
		this.name = name;
		this.secNum = secNum;
		this.age = age;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecNum() {
		return secNum;
	}

	public void setSecNum(String secNum) {
		this.secNum = secNum;
	}
	void greet() {
		System.out.println("안녕하세요. 저는 "+this.name+ "입니다."
					+this.age +"살 입니다.");
	}
	public static void main(String[] args) {
		Person p = new Person("손흥민", "1992", 30);
		p.greet();
		
	}

}
