package ch07;

public class Male extends Person {

	private String bed = "침대";
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	public Male(String name, String secNum, int age,String bed) {
		super(name, secNum, age);
		
	}
	void greet() {
		System.out.println("안녕하세요. 저는 남자입니다.");
	}
	void rest() {
		System.out.println("저는"+bed +"에서 쉬고 있습니다.");
	}
	public static void main(String[] args) {
		Male m = new Male("남자","1999",23,"침대");
		m.greet();
		m.rest();
	}
	
}

