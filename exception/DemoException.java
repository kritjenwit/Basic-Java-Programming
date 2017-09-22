class DemoException{
	public static void main(String[] args){
		int valid = 0,invalid = 0;
		int number;
		int i;
		
		for (i=0;i<args.length;i++){
			try{
				number = Integer.parseInt(args[i]);
			}catch(NumberFormatException ex){
				invalid++;
				System.out.println("You have not specified correctr argument");
				continue;
			}
			valid++;
		}
		
		System.out.println("Invalid No. of argument " +invalid);
		System.out.println("Valid No. of argument " +valid);
	}
}