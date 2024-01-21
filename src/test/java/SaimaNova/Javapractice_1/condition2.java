package SaimaNova.Javapractice_1;
import java.util.Scanner;
public class condition2 {

	public static void main(String[] args) {
		System.out.println("Hello Saima");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int number1 = input.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = input.nextInt();
		if(number1>number2) {
			System.out.println(number1+" is greater then "+number2);
		}
		else if(number1<number2) {
			System.out.println(number2+" is greater then "+number1);
		}
		else if(number1==number2) {
			System.out.println(number1+" is equal to "+number2);
		}
		else {
			System.out.println("Something went wrong");
		}
	}

}
