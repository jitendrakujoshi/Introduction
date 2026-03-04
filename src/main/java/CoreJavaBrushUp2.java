package main.java;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr2 = {1,2,23,4,74,7,909,68,27,47,38,20};
		for(int s:arr2)
		{
			//System.out.println(s);
		}

		// 2,4,74,68,38,20
		//check if array has multiple of 2 
		for(int i=0; i<arr2.length; i++ )
		{
			if (arr2[i] % 2==0)
			{
				System.out.println(arr2[i]);
			}
		}
		
		//1,23,7,909,27,47 
		//check if array has not multiple of 2 
		for(int i=0; i<arr2.length; i++ )
		{
			if (arr2[i] % 2==1)
			{
				System.out.println(arr2[i]);
				//break;
			}
//			else
//			{
//				System.out.println(arr2[i]+" is multiple of 2");
//			}
		}
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("mohan");
		a.add("mohit");
		a.add("mukesh");
		a.add("monu");
		a.add("motilal");
		a.add("mansingh");
		System.out.println(a.get(4));
		System.out.println("***********");
		
		for (String s:a) {
			System.out.println(s);

		}

		// create object of the class - object.method
		
		
		
		System.out.println(a.contains("monu"));
		
		
		
		
		
	}

}
