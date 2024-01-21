package SaimaNova.Javapractice_1;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names);
		System.out.println(names.size());
		Scanner input = new Scanner(System.in);
		/*names.add("Saima");
		names.add("Abbu");
		names.add("Ammu");
		names.add("Anando");
		names.add("Israt");
		System.out.println(names);
		System.out.println(names.size());
		//System.out.println(names.get(3));
		for(int i=0; i<names.size(); i++) {
			if(names.get(i)=="Abbu") {
				names.remove(i);
			System.out.println(names.get(i));
		}	
	}*/
		for(int i=0; i<10; i++) {
			names.add(i, input.nextLine());
		}
		System.out.println(names);

}
}