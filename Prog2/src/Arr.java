/*Using the same array created above, write a program to find the maximum number and print it
  on the console*/
 

public class Arr {
	void max(){
		int a[] = {1,4,10,9,3,6};
		int i;
		int max = 0;
		for(i = 0; i <= 5; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println("Maximum Number: " +max);
			
	}

	public static void main(String[] args) {
        Arr a = new Arr();
        a.max();

	}

}
