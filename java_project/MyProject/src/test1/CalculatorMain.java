package test1;

import java.util.*;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new ImplCal();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int n1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int n2 = s.nextInt();
		
		System.out.println("덧셈은 " + cal.add(n1, n2));
		System.out.println("뺄셈은 " + cal.substract(n1, n2));
		System.out.println("곱셈은 " + cal.multiply(n1, n2));
		System.out.println("나눗셈은 " + cal.divide(n1, n2));
		s.close();
	}

}
