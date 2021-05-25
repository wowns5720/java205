package test;
public class Calculator {
	public int add(int a, int b) {   
        return a+b;
	}
    
    public int minus(int a, int b) {
        return a-b;
    }
    
    public int multiply(int a, int b) {
    	return a*b;
    }
    
    public int divide(int a, int b) {
    	return a/b;
    }
	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		cal.add(1, 2);
		cal.divide(6, 2);
		cal.minus(5, 3);
		cal.multiply(3, 2);
		System.out.println();
	}

}