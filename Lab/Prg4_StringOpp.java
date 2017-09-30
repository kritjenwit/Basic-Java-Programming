class Prg3_StringOpp{
    public static void main(String[] args){
        String s1 = "Krit";
        String s2 = "Jenwit";
        
        System.out.println("String is : " +s1+ " and " +s2);
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        System.out.println("Length of " +s1+ " is : " +len1);
        System.out.println("Length of " +s2+ " is : " +len2);
        
        System.out.println("Concatination of two string : " +s1.concat(s2));
        
        System.out.println("First character of " +s1+ " is " +s1.charAt(0));
        
        System.out.println("The uppercase of " +s1+ " is " +s1.toUpperCase());
        
        System.out.println("The lowercase of " +s1+ " is " +s1.toLowerCase());
        
        System.out.println("T occurs at position " +s1.indexOf("t")+ " in " +s1);
        
        System.out.println("Substring of " +s1+ "starting from index 1 and ending at 2 is : " +s1.substring(1,3));
		
	System.out.println("Replacing 'a' with 'o' in " +s1+ " is " +s1.replace('a','o'));
		
		boolean check = s1.equal(s2);
		if (check == false){
			System.out.println("" +s1+ " and " +s2+ " are not same ");
		}else{
			System.out.println("" +s1+ " and " +s2+ " are same ");
		}
    }
}
