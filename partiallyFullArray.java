

class partiallyFullArray{
	public static void main(String[] args){
		
		//PART ONE: ADD ELEMENTS TO PARTIALLY FILL THE ARRAY
		//QUESTION: Does it matter when an entry is "null"?
	    //ANSWER: Not for printing out.
		
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
		
		for (int i = 0; i< array.length; i++){
			System.out.println("Element number " + i + " is: " +  array[i]);
		}
		
		//PART TWO: perform an operation over the array and see what the null values produce
		//DOES IS MATTER IF THE index points to null?
		//YES when calling on it with a method like toUpperCase

		for (int i = 0; i< (array.length-1); i++){
		    array[i] = array[i].toUpperCase();
			System.out.println("Element number " + i + " to Upper Case is: " +  array[i]);
		}
	
		
		//PART TWO: Fill holes so I can call toUpperCase on a part of the array. maintain order so we end up with do-re-me-fa-so-la-ti-do and no NullPointerException
		int counter = 0;
		boolean isFixed = false;
		do{
		try {
		    for (int i = 0; i < array.length; i++){
			if (array[i] = null){
			    
			    //make code that tell you where all the null values are
			    //then make more code that tells you how many non-null values you have
			    //
		    }else counter++;
		    }}} while (isFixed = false);
		
		
	}
	
}
