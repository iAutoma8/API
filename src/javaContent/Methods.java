package javaContent;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=59;
		
		if(marks>=90)
			System.out.println("Grade :A");
		else if(marks<90 && marks>=75)
		{
			System.out.println("Grade :B");
		}
		else if(marks<75 && marks>=60)
		{
			System.out.println("Grade :C");
		}
		else
		{
			System.out.println("Grade :D");
		}

	}

}
