import java.util.*;
public class SelectionSort {
	public static void main(String[] args) {
		int ARRAY_SIZE = 15;
		
		int[] A = new int[ARRAY_SIZE];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int)(Math.random()*ARRAY_SIZE + 1);
		}
		

		System.out.println(Arrays.toString(A));
		selectionSort(A);
		System.out.println(Arrays.toString(A));
	}
	
	public static void selectionSort(int[] array) {
		for (int finalSpot = array.length - 1; finalSpot > 0; finalSpot--) {
			int biggestSpot = 0;
			
			for (int j = 1; j <= finalSpot; j++) {
				if (array[j] > array[biggestSpot]) {
					biggestSpot = j;
				}
			}
			
			int holding = array[biggestSpot];
			array[biggestSpot] = array[finalSpot];
			array[finalSpot] = holding;
		}
		
	}

}
