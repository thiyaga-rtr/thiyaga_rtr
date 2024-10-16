package javaPrograms;

import java.awt.print.Printable;
import java.util.Arrays;

public class java{
	
//0 1 1 2 3 5 8 13 21
public static void main(String[] args) {


	int[][] a = new int[2][2];
	
	a[0][0] = 12;
	a[0][1] = 13;
	a[1][0] = 14;
	a[1][1] = 15;
	
	System.out.println(Arrays.deepToString(a));
}
}