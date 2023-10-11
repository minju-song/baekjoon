package algorithm.silver5;

import java.util.Scanner;

public class q1316 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     String arr[] = new String[n];
     
  
     boolean ck[] = new boolean[n];
     for(int i=0; i<n; i++) {
        ck[i] = true;
     }
     for(int i=0; i<n; i++) {
        arr[i] = sc.next();
        
        for(int j=0; j<arr[i].length(); j++) {
           int ckIn = arr[i].charAt(j);
           for(int k=arr[i].length()-1; k>=0; k--) {
              if(arr[i].charAt(k) == ckIn) {
                 for(int l = j; l<=k; l++) {
                    if (arr[i].charAt(j) != arr[i].charAt(l)) ck[i] = false;
                 }
              }
           }
        }
     }
     
     int count = 0;
     for(int i=0; i<n; i++) {
        if (ck[i] == true) count++;
     }
     
     System.out.println(count);

}
}
