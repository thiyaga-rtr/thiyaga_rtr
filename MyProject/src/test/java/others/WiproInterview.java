package others;

import java.util.Arrays;

public class WiproInterview {

	public static void main(String[] args) {
		
		int[] a = {2,3,1,6,5,4,6};
		
		Arrays.sort(a);
		
		for (int i=a.length-2; i>=0; i--) {
			if (a[i] != a[a.length-1]) {
				System.out.println(a[i]);
				break;
			}
		}
		
	
	}

}
