package algorithm.silver5;

import java.util.Scanner;

public class q25206 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     
     double allScore = 0;
     double allCourse = 0;
     for(int i=0; i<20; i++) {
        String name = sc.next();
        double c = sc.nextDouble();
        String score = sc.next();
        double scor = 0;
        switch(score) {
        case "A+" : 
           scor = 4.5; 
           break;
        case "A0" : 
           scor = 4.0;
           break;
        case "B+" :
           scor = 3.5;
           break;
        case "B0" :
           scor = 3.0;
           break;
        case "C+" :
           scor = 2.5;
           break;
        case "C0" :
           scor = 2.0;
           break;
        case "D+" :
           scor = 1.5;
           break;
        case "D0" :
           scor = 1.0;
           break;
        case "F":
           scor = 0;
        
        }
        double r = scor * c;
        
        if(score.equals("P")) continue;
        
        allCourse += c;
        allScore += r;   
        
     }
     
     
     System.out.printf("%.6f",allScore/allCourse);

}
}
