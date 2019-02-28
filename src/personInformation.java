import java.util.Scanner;


public class personInformation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = scanner.next();		// User input (first name)
		
		System.out.println("Please enter your last name: ");
		String lastName = scanner.next();		// User input (last name)
		
		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();			// User input (age)
		
		System.out.println("Please enter your favourite number: ");
		int number = scanner.nextInt();			// User input (favorite number)
		
		
		System.out.println("Hello " + firstName + " " + lastName + "\nYou are " + age + " years old" + "\nYour favorite number is " + number);
		
		scanner.close();
	}

}
