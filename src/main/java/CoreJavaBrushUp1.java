package main.java;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		String website = "Rahul Shetty Academy";
		char latter = 'r';
		double dec = 5.99;
		
		System.out.println(num+" is the value stored in the num variable");
		System.out.println(website);
		System.out.println(latter);
		System.out.println(dec);
		
		//Arrays-
		int [] arr = new int [4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 5;
		arr[3] = 4;
 		
		int [] arr2 = {1,2,23,4,74,7,909,68,27,47,38,20};
		System.out.println(arr2[2]);
		System.out.println(arr[2]);
		
		//for loop
		for(int i =0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);

		}
		
		
		 String[] name = {"jitu","mohan","jaipal","sandeep"};
		 for(int i=0; i<name.length; i++)
		 {
			// System.out.println(name[i]);
		 }
		
		 
		 for(String s: name)
		 {
			 System.out.println(s);
		 }
		 
		 
		 
		 
		 

	}

}
