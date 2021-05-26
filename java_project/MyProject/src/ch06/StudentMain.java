package ch06;

public class StudentMain {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("홍길동", 100, 40, 20);
		students[1] = new Student("홍길동2", 80, 70, 50);
		students[2] = new Student("홍길동3", 70, 100, 40);
		students[3] = new Student("홍길동4", 100, 100, 70);
		students[4] = new Student("홍길동5", 70, 40, 50);
		students[5] = new Student("홍길동6", 100, 70, 70);
		students[6] = new Student("홍길동7", 70, 100, 80);
		students[7] = new Student("홍길동8", 70, 70, 60);
		students[8] = new Student("홍길동9", 100, 40, 30);
		students[9] = new Student("홍길동10", 70, 70, 40);
		
		System.out.println(" 이름 " + " 국어  "+" 영어  "+" 수학  "+" 합계  "+" 평균  ");
		System.out.println("===========================================================");
		System.out.println();
		
		for(int i=0; i<students.length; i++) {
			System.out.println( students[i].getName()+"\t"+
					students[i].getKorScore()+"\t"+
					students[i].getMathScore()+"\t"+
								students[i].getScore()+"\t"+
								students[i].getAverage());
	}

}
}
