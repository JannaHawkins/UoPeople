//initialize elements of an array in a for loop

class forLoopInit{
    public static void main(String[] args){
	Bubble[] array = new Bubble[4];
	for (int i = 0; i < array.length; i++){
	    array[i] = new Bubble();
	    array[i].printWonder("I am string number " + i);
	}
    }
}

class Bubble{

    static void printWonder(String string){
	System.out.println(string);
    }

    Bubble(){
	super();
    };
}


