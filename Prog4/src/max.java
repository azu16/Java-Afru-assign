import java.util.Scanner;

//Write a program that takes input 2 numbers from the user at runtime and  prints the maximum on.

public class max {
	Scanner s = new Scanner(System.in);
	  void num(){
		  int n,m;
		  System.out.println("Enter two number");
		  n = s.nextInt();
		  m = s.nextInt();
		  System.out.println("Two Numbers are");
		  System.out.println(n);
		  System.out.println(m);
		  if(n > m){
			  System.out.println("Maximum number is :" +n);
		  }
		  else
			  System.out.println("Maximum number is :" +m);
		  
	  }
	public static void main(String[] args) {
		max m = new max();
		m.num();

	}

}
