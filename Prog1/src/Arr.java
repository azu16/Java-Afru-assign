//Create an array with number {1,4,10,9,3,6} and print them on the console( print as an output)

public class Arr {
      void display(){
         int a[] = {1,4,10,9,3,6};
         int i;
         for(i = 0; i <= 5; i++){
        	 if(i == 5){
        		 System.out.println(a[i]);
        		 break;
        	 }
        	 System.out.print(a[i] +",");
         }
      }
	public static void main(String[] args) {
		Arr a = new Arr();
		a.display();

	}

}
