package javaContent;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myArray[]=new int[10];
		
		myArray[0]= 2;
		myArray[1]= 5;
		myArray[2]= 4;
		myArray[3]= 3;
		
		for(int x:myArray)
		{
			System.out.println(x);
		}
		
		String myString[]= {"i","dont","know"};
		
		for(String x:myString)
		{
			System.out.println(x);
		}
		
		
		Arrays.sort(myArray);
		
		for(int x:myArray)
		{
			System.out.println(x);
		}
		
	}

}
