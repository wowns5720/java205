package ch04;

public class Member2 {

	private String name;
	private int phoneNum;
	private String grade;
	private	String email;
	private int birthDay;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Member2 (String name,int phoneNum,String grade,String email,int birthDay,String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.grade = grade;
		this.email = email;
		this.birthDay = birthDay;
		this.address = address;
	}
	public Member2(String name,int phoneNum,String grade,String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.grade = grade;
		this.email = email;
	}
	public void printInfo() {
		System.out.println("이름  : " + name);
		System.out.println("번호  : " + phoneNum);
		System.out.println("학년  : " + grade);
		System.out.println("메일  : " + email);
		System.out.println("생일  : " + birthDay);
		System.out.println("주소  : " + address);
	}
	
	public static void main(String[] args) {

		Member2 m = new Member2("손흥민",123,"3학년","email",920708,"토트넘");
		m.printInfo();
		System.out.println();
		
		Member2 m2 = new Member2("박지성",456,"4학년","email");
		m2.printInfo();
	}

}
