package Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
//    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public double factorial(double number) {
        if (number < 0) {
            return -1;
        }
        double fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public double naturalLog(double number) {
        return Math.log(number);
    }

    public double powerFunction(double number, double power) {
        return Math.pow(number, power);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1 = 0, number2 = 0;
        System.out.println("Calculator-DevOps");
        do {
            System.out.println("Choose to perform operation:");
            System.out.print("Press 1 to Square Root" +
                    "\nPress 2 to Factorial" +
                    "\nPress 3 to Natural Logarithm" +
                    "\nPress 4 to Power Function\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            if (choice == 4) {
                try {
                    System.out.print("Enter the base number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the power : ");
                    number2 = scanner.nextDouble();
                } catch (InputMismatchException error) {
                    System.out.print("Invalid input, Entered input is not a number");
                    return;
                }
            } else if( choice == 1|| choice == 2|| choice ==3){
                try {
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
                } catch (InputMismatchException error) {
                    System.out.print("Invalid input, Entered input is not a number");
                    return;
                }
            } else {
                System.out.println("Exiting....");
                return;
            }

            switch (choice) {
                case 1:
                    // do Square Root
                    System.out.println("Square Root of " + number1 + " is : " + calculator.squareRoot(number1));
                    break;
                case 2:
                    // do Factorial
                    System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
                    break;
                case 3:
                    // do Natural Log
                    System.out.println("Natural Log of "+number1+" is : " + calculator.naturalLog(number1));
                    break;
                case 4:
                    // do Power Function
                    System.out.println("Power of "+number1+" with base "+number2+" is : " + calculator.powerFunction(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }
}