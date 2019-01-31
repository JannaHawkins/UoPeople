

class partiallyFullArray{
	public static void main(String[] args){
		
		//PART ONE: ADD ELEMENTS TO PARTIALLY FILL THE ARRAY
		//QUESTION: Does it matter when an entry is "null"?
		
		String[] array = new String[20];
		int arrayCounter = 0;
		
		array[1] = "do";
		arrayCounter++;
		
		array[4] = "re";
		arrayCounter++;
		
		array[7] = "mi";
		arrayCounter++;
		
		array[10] = "fa";
		arrayCounter++;
		
		array[13] = "so";
		arrayCounter++;
		
		array[14] = "la";
		arrayCounter++;
		
		array[17] = "ti";
		arrayCounter++;
		
		array[19] = "do";
		arrayCounter++;
		
		for (int i = 0; i< (array.length-1); i++){
			System.out.println("Element number " + i + " is: " +  array[i]);
		}
		
		
		
	
		
		//PART TWO: DELETE ELEMENT AND FILL THE HOLE TO AVOID PROCESSING A NULL ELEMENT
		
		
	}
	
}