package ch08;

public class Array2 {

	public static void addOneDArr(int[] arr, int add) {
		for (int i =0; i <arr.length; i++)
			arr[i] +=add;
	}
	public static void addOneDArr(int[][]arr, int add) {
		for (int i = 0; i<arr.length; i++)
			addOneDArr(arr[i],add);
	}
	
	public static void main(String[] args) {
		System.out.println("문제 2");
	
		int[][] arr1 = new int[5][5];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = (int)(Math.random() * 100);
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		addOneDArr(arr1, 5);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
