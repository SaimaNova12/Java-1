package SaimaNova.Javapractice_1;

import java.util.Scanner;
public class Inputoutput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.print("Enter a number: ");
		//float number2 = input.nextFloat();
		//boolean res = input.nextBoolean();
		int number1 = input.nextInt();
		//System.out.println("Your name :" +name);
		//System.out.println("Number is :" +number1);
		System.out.println("Name is: "+name+", Number is: "+number1);

	}

}
