package algorithm;

import java.util.*;

public class practice {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
	    List<String> result = new ArrayList<>();
	    boolean ck = true;
	    while(true) {
	    	String test = sc.next();
	    	if(test.equals("0")) break;
	    	
	    	int len = (int) Math.ceil(test.length()/2);
	    	for(int i=0; i<len; i++) {
	    		if(test.charAt(i) != test.charAt(test.length()-1-i)) ck = false;
	    	}
	    	
	    	if (ck == true) result.add("yes");
	    	else if(ck == false) result.add("no");
	    	
	    	ck = true;
	    }
	    
	    for(int i=0; i<result.size(); i++) {
	    	System.out.println(result.get(i));
	    }
	    
	    
	}
}
