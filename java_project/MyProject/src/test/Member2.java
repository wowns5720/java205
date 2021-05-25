package test;

public class Member2 {

	
	public static void main(String[] args) {

//		1.앞서 생성 했던 Member 클래스에 main() 메소드 안에 아래 조건의 변수를 정의해봅시다.

//		①String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
		String name = "손흥민";
		
//		②int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
		int age = 27;

//		③double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
		double height = 185.3;

//		④boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
		boolean hasBook = false;

//		⑤이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
		System.out.println("저의 이름은 " + name);// String + String
		System.out.println("키는 "+ height + "cm 입니다");
		// String + double + String -> (String + String) + String -> String + String
		// String + any Type -> String + String
		System.out.println("제 나이는 "+ age + "입니다");	// String + int + String
		System.out.println("JAVA 책은 " + hasBook + " 입니다.");
		
		if(hasBook) {
			System.out.println("책을 보유하고 있습니다.");
		}
		else {
			System.out.println("책 없어요");
		}
	}

}
