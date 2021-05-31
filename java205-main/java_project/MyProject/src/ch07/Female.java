package ch07;

public class Female extends Person {

	private String study = "공부";
	
	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public Female(String name, String secNum, int age, String study) {
		super(name, secNum, age);
	}
	
	void greet() {
		System.out.println("안녕하세요 저는 여자입니다.");
	}
	
	void studying() {
		System.out.println("저는 "+this.study +"하고 있는 중입니다.");
	}
	public static void main(String[] args) {
		Female f = new Female("여자","1993",24,"공부");
		f.studying();
		f.greet();
	}
}
