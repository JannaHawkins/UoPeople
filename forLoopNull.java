// returns an error that int and null are not compatible types
// I wonder, how to you write a program that will let you go through a list, check what is null and then fill those holes with something?

class forLoopNull{
    public static void main(String[] args){

	int[] array = new int[6];
	
	System.out.println("the length of array is: " + array.length);

	array[1] = 5;

	for (int i = 0; i < array.length; i++){
	    if (array[i] == null){
		array[i] = i;
		
	    }
	    System.out.println("In position " + i + " the value is: " + array[i]);
	}
	
    }

}
    
