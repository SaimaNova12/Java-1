package SaimaNova.Javapractice_1;
import java.util.Scanner;

public class method_practices {
	public static void sum(int a, int b) {
		System.out.println("Summation is " +(a+b));
	}
	public static void sub (int x, int y) {
		System.out.println("Subtraction is " +(x-y));
	}
	public void multip(int m, int n) {
		System.out.println("Multiplication is " +(m*n));
	}

	public static void main(String[] args) {
		method_practices example = new method_practices();
		sum(10,10);
		sub(30, 10);
		example.multip(5,5);

	}

}
