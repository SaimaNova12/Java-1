package SaimaNova.Javapractice_1;

import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Automation Engineers");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
	}

}
