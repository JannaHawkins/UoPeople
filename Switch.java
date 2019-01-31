class Switch{
	public static void main(String[] args){
		int optionNumber;
		
		optionNumber = 5;

		switch (optionNumber){
			case 1:
				System.out.println("You put 1.");
				break;
			case 2:
				System.out.println("You put 2.");
				break;
			case 3:
				System.out.println("You put 3.");
				//break;
			case 4:
			case 5:
			case 6:
			case 7:
				System.out.println("You put 4,5,6, or 7.");
				break;
			default:
				System.out.println("You didn't put 1-7.");
		}
	}
}