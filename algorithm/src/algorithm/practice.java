package algorithm;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);		
	    
	    int n = sc.nextInt(); // 세로
	    int m = sc.nextInt(); //가로
	    char arr[][] = new char[n][m];
	    
	    for(int i=0; i<n; i++) {
	    	String str = sc.next();
	    	for(int j=0; j<m; j++) {
	    		arr[i][j] = str.charAt(j);
	    	}
	    }
	    
	    int ckM = 0;
	    int emptyM=0;
	    for(int i=0; i<n; i++) {
	    	for(int j=0; j<m; j++) {
	    		if(arr[i][j] == 'X') {
	    			ckM++;
	    			break;
	    		}
	    	}
	    	if(ckM == 0) emptyM++;
	    	ckM = 0;
	    }
	    
	    int ckN = 0;
	    int emptyN=0;
	    for(int i =0; i<m; i++) {
	    	for(int j=0; j<n; j++) {
	    		if(arr[j][i] == 'X') {
	    			ckN++;
	    			break;
	    		}
	    	}
	    	if(ckN == 0) emptyN++;
	    	ckN = 0;
	    }
	    
	    if(emptyN > emptyM) System.out.println(emptyN);
	    else if(emptyN < emptyM) System.out.println(emptyM);
	    else System.out.println(emptyN);
	}
}
