package javaContent;

public class StringMethods {
	
	public static void main(String[] args) {
		
	
	String s1="This is the test string";
	String s2="This Is the test string";
	String s3="           yhis"; 
	
	char ch[];
	
	System.out.println("Length :" +s1.length());
	System.out.println("Char at :" +s1.charAt(1));
	System.out.println("Concat: " +s1.concat(" Conacated"));
	
	System.out.println("Contains :" +s1.contains("he t"));
	
	System.out.println("Starts With: " +s1.startsWith("This"));
	
	System.out.println("Ends With : " +s1.endsWith("Conacated"));
	
	System.out.println("Equals : " +s1.equalsIgnoreCase(s2));
	System.out.println("Index of : " +s1.indexOf("z"));
	
	System.out.println("Trim: " +s3.trim());
	
	
	System.out.println("Replace of : " +s1.replace('s', 'x'));
	
	System.out.println("Substring: " +s1.substring(5));
	System.out.println("Substring: " +s1.substring(5,9));
	
	ch=s1.toCharArray();
	for(char c:ch)
	{
		System.out.println(c);
	}
	
	}

}
