package algorithm.silver5;

import java.util.*;

public class q1251 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		char min = str.charAt(0);
		int minIdx = 0;
		for(int i=0; i<str.length()-2; i++) {
			if (str.charAt(i) <= min) {
				min = str.charAt(i);
				minIdx = i;
			}
		}
		
		char min2 = str.charAt(minIdx+1);
		int minIdx2 = minIdx+1;
		
		for(int i=minIdx+1; i<str.length(); i++) {
			if (str.charAt(i) <=min2) {
				min2 = str.charAt(i);
				minIdx2 = i;
			}
		}
		
		String strArr[] = new String[3];
		
		strArr[0] = str.substring(0, minIdx+1);
		strArr[1] = str.substring(minIdx+1, minIdx2+1);
		strArr[2] = str.substring(minIdx2+1, str.length());
		
		for(int i=0; i<strArr.length; i++) {
			StringBuffer sb = new StringBuffer(strArr[i]);
	        strArr[i] = sb.reverse().toString();
		}
		
		String result = "";
		for(int i=0; i<strArr.length; i++) {
			result += strArr[i];
		}
		System.out.println(result);
	}

}
