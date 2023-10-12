package algorithm.bronze3;

import java.util.Scanner;

public class q2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int m = n-1;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<m*2-2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
