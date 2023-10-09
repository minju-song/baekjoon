package algorithm;

import java.util.*;

public class practice {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int students = sc.nextInt();
	    
	    int classes [][] = new int[students][5];
	    
	    for(int i=0; i<students; i++) {
	    	for(int j=0; j<5; j++) {
	    		classes[i][j] = sc.nextInt();
	    	}
	    }
	    
	    int count[] = new int[students];
	    for(int i=0; i<students; i++) {
	    	boolean arr[] = new boolean[students];
	    	for(int j=0; j<arr.length; j++) {
	    		arr[j] = false;
	    	}
	    	for(int j=0; j<5; j++) {
	    		int s = classes[i][j];
	    		for(int k=0; k<students; k++) {
	    			if (s == classes[k][j]) arr[k] = true;
	    		}
	    	}
	    	int cnt = 0;
	    	for(int k =0; k<arr.length; k++) {
	    		if (arr[k] == true) cnt++;
	    	}
	    	count[i] = cnt;
	    	
	    }
	    int max = count[0];
	    int maxidx=0;
	    for(int i=0; i<count.length; i++) {
	    	if(max < count[i]) {
	    		max = count[i];
	    		maxidx = i;
	    	}
	    }
	    
	    System.out.println(maxidx+1);
	    
	}
}
