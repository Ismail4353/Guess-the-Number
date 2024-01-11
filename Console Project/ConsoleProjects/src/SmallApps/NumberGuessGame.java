package SmallApps;
import java.util.*;
public class NumberGuessGame {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=1;
	    int max=10;
	    boolean cond=true;
       System.out.println("WELCOME TO NUMBER GUESSING GAME");
       System.out.println("THE NUMBER RANGE IS 1 TO "+max);
       System.out.println("IF YOU WANT TO EXIT PRESS 0 ANYTIME");
       
       while(cond) {
          int guess=sc.nextInt();
          if(guess==0) {
				cond=false;
				System.out.println("THANKS FOR COMING...");
				break;
			}
    	  int rand=(int)(Math.random()*max)+1;
    	  if (guess==rand) {
			System.out.println("AWESOME!!!");
			System.out.println("THATS RIGHT: "+rand);
			System.out.println("IF YOU WANT TO EXIT PRESS 0 ANYTIME");
			
		 }
    	  else
    		  System.out.println("TRY AGAIN!!! IT'S "+rand);
    	      
       } 	  
	}

}
