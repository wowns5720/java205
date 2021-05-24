package test;

public class Member {
	String name;
	int age;
	double height;
	boolean hasbook;
	
public Member(String name, int age, double height, boolean hasbook) {
	this.name = name;
	this.age = age;
	this.height = height;
	this.hasbook = hasbook;
}
	public static void main(String[] args) {
		
		Member m = new Member("김재준", 20, 20.0, true);
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.height);
		System.out.println(m.hasbook);
	}

}
