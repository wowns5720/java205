package test;

import java.util.Scanner;

public class Calculator {

	
	float pi = 3.14f;
	public int add(int a, int b) {    
	      
        return a+b;
    }
    
    public int minus(int a, int b) {
        return a-b;
    }
    
    public int multiply(int a, int b) {
    	return a*b;
    }
    
    public float divide(float a, float b) {
    	return a/b;
    }
    
    public double circle(double r) {
    	return 2*r*pi;
    }
    
    public double area(double r) {
    	return r*r*pi;
    }
    
    public void print(int num1 , int num2) {
    	System.out.println("결과는 : " + add(num1, num2));
    	System.out.println("결과는 : " + minus(num1, num2));
    	System.out.println("결과는 : " + multiply(num1, num2));
    	System.out.println("결과는 : " + divide(num1, num2));
    }
    
    public void printCircle(int r) {
    	System.out.println("결과는 : " + circle(r));
    	System.out.println("결과는 : " + area(r));
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.println("숫자를 입력하세요.");		
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력하세요.");
		int num2 = sc.nextInt();
		cal.print(num1, num2);
		
		System.out.println();
		System.out.println("원의 반지름을 입력하세요.");
		int r = sc.nextInt();
		cal.printCircle(r);
		
		

	}

}