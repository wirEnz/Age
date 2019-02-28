import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    final double TAX = 1.17;
    
    System.out.println("Please enter your wage: ");
    double wage = scanner.nextDouble();
    double payableTax = (wage * TAX) - wage;

    System.out.println("The tax you pay on " + "$" + wage + " is " + "$" + payableTax);

    scanner.close();


    


  }
}
