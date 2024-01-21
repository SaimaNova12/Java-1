package SaimaNova.Javapractice_1;
import java.util.Scanner;

public class method1 {
	public static void sum (int a, int b) {
		System.out.println("Summation is : " +(a+b));
	}
	
	public void sub (int m, int n) {
		System.out.println("Sub is : " +(m-n));
	}
	/*public static void sum(int a, int b){
		System.out.println("Summation is: " +(a+b));
	}
	public static void multi(int x, int y, int z) {
		System.out.println("Multiplication is: " +(x*y*z));
	}
	
	public static void main(String[] args) {
	   //method1 example = new method1();
          sum(10, 10);
          multi(10, 10, 10);
	}

}*/
	public static void main(String[] args) {
		method1 input = new method1();
		sum(10,20);
		input.sub(20, 10);
		
		}
}
	
