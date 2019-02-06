import java.util.*;

/**
 *provides review of insertion sort algorithm on array of any size 
 Array is full of randomly generated numbers from 1 to 50
 */
class insertionSort {
	
	
    public static void main(String[] args){

	
			int ARRAY_SIZE = 10;
			int[] array = new int[ARRAY_SIZE];
			
			for ( int i = 0; i < ARRAY_SIZE - 1; i++){
				array[i] = (int) (Math.random() * 50 + 1);
			}
		
			System.out.println("Before insertion sort the order of the array is: ");
			String before = Arrays.toString(array);
			System.out.println(before);
			
			
			insertionSortAlgorithm(array);
			
			
			System.out.println("After insertion sort the order of the array is: ");
			String after = Arrays.toString(array);
			System.out.println(after);
			
	}

    /**
       Uses insertion sort to sort an array of integers.
       @param array of integers
  
     */
    static void insertionSortAlgorithm (int[] array){
				// From Eck 7.4.3
				// Sorts into increasing order
				
				int numberSorted;
				
				for (numberSorted = 1; numberSorted < array.length; numberSorted++){
					
					int temp = array[numberSorted];
					int placeMark = numberSorted - 1;
					
					while ((placeMark >= 0) && (array[placeMark] > temp)){
						
						array[placeMark + 1] = array[placeMark];
						placeMark = placeMark - 1;
					}
					
					array[placeMark + 1] = temp;
				}
			}
			
			
		
	
}
