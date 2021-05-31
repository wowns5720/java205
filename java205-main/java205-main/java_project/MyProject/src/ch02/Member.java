package ch02;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		
		int birth = 0;
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("독감예방 접종이 가능한지 여부를 확인합니다.");
		System.out.println("태어난 년도를 입력하세요.");
		
		birth = sc.nextInt();
		age = (2021 - birth);
		
		if(age < 15 || age >= 65 ) {
			System.out.println("“무료예방접종이 가능합니다.”");
		}else {
			System.out.println("“무료접종 대상이 아닙니다.”");
		}
		
		
		
		System.out.println();
		System.out.println("건강검진 대상 여부를 판별하고 어떤 검진이 가능한지 확인합니다.");
		System.out.println("태어난 년도를 입력하세요.");
		
		birth = sc.nextInt();
		age = (2021 - birth);
		
		
		if(age > 20 || (age%2==0)) {
			System.out.println("검사 대상자입니다.");
			if(age >= 40) {
				System.out.println("암 검사를 무료로 받을수 있습니다.");
			}
		}else {
			System.out.println("검사 대상자가 아닙니다.");
		}
		
	}

}
