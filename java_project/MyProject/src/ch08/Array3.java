package ch08;

public class Array3 {

	public static int[][] change(int[][] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			int[] temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[][] arr1 = new int[3][3];
		
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
		change(arr1);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	

	}

}
