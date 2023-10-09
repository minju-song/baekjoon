package algorithm;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
	    int result = 1;
	    int count = 0;
	    int[] arr = new int[5];
	    
	    for(int i = 0; i < 5; i++) {
	    	arr[i] = sc.nextInt();
	    }
	    
	    while(true) {
		    for(int i = 0; i < 5; i++) {
		    	if(result % arr[i] == 0) {
		    		count++;
		    	}
		    }
			
	    	if(count >= 3){
	    		System.out.println(result);
				break;
	    	}
	    
			result++;
			count = 0;
	    }


	    
	    
	        
	}

}
