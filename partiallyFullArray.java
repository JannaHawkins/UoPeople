

class partiallyFullArray{
	public static void main(String[] args){
		
		//PART ONE: ADD ELEMENTS TO PARTIALLY FILL THE ARRAY
		//QUESTION: Does it matter when an entry is "null"?
	    //ANSWER: Not for printing out.
		
		String[] array = new String[20];
		int arrayCounter = 0;
		
		array[0] = "do";
		arrayCounter++;
		
		array[1] = "re";
		arrayCounter++;
		
		array[2] = null;    //comment out to run with no hole
		//array[2] = "mi";  //uncomment to run with no hole
		arrayCounter++;   
		
		array[3] = "fa";
		arrayCounter++;
		
		array[4] = "so";
		arrayCounter++;
		
		array[5] = "la";
		arrayCounter++;
		
		array[6] = "ti";
		arrayCounter++;
		
		array[7] = "do";
		arrayCounter++;
		
		for (int i = 0; i< array.length; i++){
			System.out.println("Element number " + i + " is: " +  array[i]);
		}
		
		//PART TWO: perform an operation over the array and see what the null values produce
		//DOES IS MATTER IF THE index points to null?
		//YES when calling on it with a method like toUpperCase

		//for (int i = 0; i< (array.length-1); i++){
		//  array[i] = array[i].toUpperCase();
		//	System.out.println("Element number " + i + " to Upper Case is: " +  array[i]);
		//}
	
		
		//PART THREE: fix a hole so I can call .toUpperCase() on a part of the array.

	        array[2] = array[arrayCounter-1];
		arrayCounter--;

		for (int i = 0; i< array.length; i++){
			System.out.println("Element number " + i + " is: " +  array[i]);
		}
       
}
}
