package ch08;

import java.util.*;

public class Array {

	public static int miniValue(int[] arr) {
		int min = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	} 
	
	public static void main(String[] args) {
		System.out.println("문제 1");
		Scanner s = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력해주세요 : ");
		int arraySize = s.nextInt();
		int[] arr = new int[arraySize];
		
		System.out.println("배열을 입력해 주세요 : ");
		for (int i = 0; i < arraySize; i++) {
			System.out.println("숫자를 입력해 주세요.");
			arr[i] = s.nextInt();
		}
		System.out.println("최소값 : " + miniValue(arr));
		System.out.println("최대값 : " + maxValue(arr));
		
		s.close();
	}

}
