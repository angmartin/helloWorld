package helloWorld;
//My First Program
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		System.out.println("Hello, World!"); 
//		System.out.print("My first Java Program!");

		Scanner input = new Scanner(System.in);
	    System.out.println("What is your name?");
	    String firstName = input.nextLine();
	    System.out.printf("Hello %s!\n", firstName);
	    System.out.printf("Goodbye %s!\n", firstName);

	}
	


}

	



