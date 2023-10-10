package algorithm.silver5;

import java.util.Scanner;

public class q1193 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int param = sc.nextInt();
    int n=1;
    int line = 0;
    int block;
    while(true) {
    	if (param < ((n*(n-1)/2)+1)) {
    		line = n-1;
    		block = param - (((n-2)*(n-1)/2)+1);
    		break;
    	}
    	
    	n++;
    }
    
    if (line%2 == 0) System.out.println((1+block)+"/"+(line-block));
    else System.out.println((line-block)+"/"+(1+block));
    
}
}
