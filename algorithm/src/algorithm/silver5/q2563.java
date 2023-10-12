package algorithm.silver5;

import java.util.Scanner;

public class q2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean square[][] = new boolean[100][100];
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					square[j][k] = true;
				}
			}
					
		}
		
		int count = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if (square[i][j] == true) count++;
			}
		}
		
		System.out.println(count);

	}

}
