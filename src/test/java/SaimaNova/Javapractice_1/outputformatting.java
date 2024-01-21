package SaimaNova.Javapractice_1;

import java.util.Scanner;
public class outputformatting {

	public static void main(String[] args) {
		System.out.println("Hello Saima");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println(name);
		System.out.println("Enter number 1 : ");
		int number1 = input.nextInt();
		System.out.println("Enter number 2 : ");
		int number2 = input.nextInt();
        System.out.println("Your total number is "+number1+number2);
	}

}
