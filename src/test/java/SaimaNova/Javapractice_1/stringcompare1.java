package SaimaNova.Javapractice_1;
import java.util.Scanner;
public class stringcompare1 {

	public static void main(String[] args) {
	   /* Scanner input = new Scanner(System.in);
	    System.out.println("Enter first name : ");
	    String name1 = input.nextLine();
	    
	    System.out.println("Enter last name : ");
	    String name2 = input.nextLine();
        
	    if(name1.equals(name2)) {
	    	System.out.println(name1+ " is equal to " +name2+ " and are similar to each other");
	    }
	    else {
	    	System.out.println("something went wrong");
	    }
	    if(name1.equalsIgnoreCase(name2)) {
	    	System.out.println(name1+ " is equal to " +name2+ " and are similar to each other");
	    }
	    else {
	    	System.out.println("something went wrong");
	    }*/
	    String[] names = {"Saima", "Israt", "Nazmun", "Younus", "Anando"};
	    //System.out.println(name[0]);
	    for(int i = 0; i<names.length; i++) {
	        System.out.println(names[i]);
	    }
	}

}
