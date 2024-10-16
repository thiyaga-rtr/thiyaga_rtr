package javaPrograms;

import java.util.Arrays;

public class JavaPrograms {
	
	public JavaPrograms() {
		// TODO Auto-generated constructor stub
		System.out.println("invoking");
	}
	
	public static void reverseStringPosition() {
		String a = "Thiyaga rajan";
		
		String[] b = a.split(" ");
		
		for (int i=0; i<a.length(); i++) {
			for (int j=b[i].length()-1; j>=0; j--) {
				System.out.print(b[i].charAt(j));
			}
			System.out.print(" ");
		}
				
	}
	
	public static void secondLargestElementInArray() {
	int[] a = {2,3,1,3,4,6,5,1,3,2};
	
	Arrays.sort(a);
	
	for (int i= a.length-2; i>=0; i--) {
		if (a[i] != a[a.length-1]) {
			System.out.println(a[i]);
			return;
			
		}
	}
	}
	public static int remdup(int[] a) {
		
		Arrays.sort(a);
		int j = 0;
		
		for (int i=0; i<a.length; i++) {
			if (a[i] != a[j]) {
				j++;
				a[j] = a[i];
			}
		}return j+1;
		
	}
	
	public static void reverseStrin() {
		String a = "Thiyagarajan";
		
		for (int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
	}
	
	public static void removeDuplicateinString() {
		
		String a = "Thiyagarajan";
		
		StringBuilder sb = new StringBuilder(a);
		
		int length = sb.length();
		
		for (int i=0; i<length; i++) {
			for (int j=i+1; j<length; j++) {
				char c1 = sb.charAt(i);
				char c2 = sb.charAt(j);
				
				if(c1==c2) {
					sb.deleteCharAt(i);
					i=0;
					j=0;
					length = length-1;
				}
				
			}
		}
		System.out.println(sb);
		
	}
	
	public static void countCharacters() {
		String a = "Thiyagarajan";
		int count = 0;
		
		for (int i=0; i<a.length(); i++) {
			count ++;
		}
		System.out.println(count);
	}
	
	public static void replaceString() {
		String a = "Thiyagarajan";
		
		int b = 123456;
		 
		String c = String.valueOf(b);
		
		String replace = c.replace(a,c);
		
		a= replace;
		
		System.out.println(a);
		
	}
	
	public static void removeSpace() {
		
		String a = "I love india";
		
		String b = a.replace(" ", "");
		
		System.out.println(b);
		
	}
	
	public static void replaceStringwithInt() {
		String a = "wipro interview";
		
		int c = 123;
		
		String b = "interview";
		
		String d = String.valueOf(c);
		
		String e = a.replace(b, d);
		
		a=e;
		
		System.out.println(a);
		
					
	}
	
		
	public static void fibonacciSeries() {
		
	//0 1 1 2 3 5 8 13 21 34 55 89
		
		int n1 =0, n2=1, sum =0;
		
	 System.out.print(n1+" "+n2);
	 
	 for (int i=2; i<12; i++) {
		 
		 sum = n1+n2; //5
		 
		 System.out.print(" "+sum); //5
		 
		 n1 = n2; //3
		 
		 n2 = sum; //5
		 
	 }
			
	}
	
	public static void invalidCharcters() {
	String a = "thiyaga#%#%";
	
	for (int i=0; i<a.length(); i++) {
		if (Character.isLetter(a.charAt(i)))  {
			System.out.print(a.charAt(i));
			
		}
	}
	}


	public static void main(String[] args) {
		
		/*int a[] = {2,33,56,4,3,4,56,5,65,5};
		int b = remdup(a);		
		for (int i=0; i<b; i++) {
		System.out.print(a[i]+",");*/
		
		//reverseStrin();
		//System.out.println();
		//reverseStringPosition();
		//removeDuplicateinString();
		//countCharacters();
		//replaceString();
		//removeSpace();
		//replaceStringwithInt();
		//int number = 12345;
		//String a = replceIntwithString(number);
		//System.out.println(a);
		//fibonacciSeries();
		//secondLargestElementInArray();
		//invalidCharcters();
		secondLargestElementInArray();

}
}
