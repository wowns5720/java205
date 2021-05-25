package ch04;

public class Member2 {

	String name;
	int phoneNum;
	String grade;
	String email;
	int birthDay;
	String address;
	
	void print() {
		System.out.println(name+ " " + phoneNum+ " " + grade+ " " + email 
				+ " " + birthDay+ " "  + address);
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
	
	public static void main(String[] args) {

		Member2 m = new Member2("손흥민",123,"3학년","email",950407,"address");
		m.print();
		Member2 m2 = new Member2("박지성",456,"4학년","email");
		m2.print();
	}

}
