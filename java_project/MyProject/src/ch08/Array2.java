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
		
	}

}
