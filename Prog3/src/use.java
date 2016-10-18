//Write a program that takes input 2 numbers from the user at runtime and  prints them

import java.util.Scanner;


public class use {
	Scanner s = new Scanner(System.in);
      void number(){
    	  int n,m;
    	  System.out.println("Enter two number");
    	  n = s.nextInt();
    	  m = s.nextInt();
    	  System.out.println("Two Numbers are: " +n +" " +m);
    	      	  
      }
	public static void main(String[] args) {
		use u = new use();
		u.number();
		
	}

}
