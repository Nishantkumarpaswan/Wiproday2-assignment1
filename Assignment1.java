import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println(" ######## MENU ***** ");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("$##########**************$");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number: ");
                    int tableNum = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
                    }
                    break;

                case 2:
                    System.out.print("Enter the number: ");
                    int factNum = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + factNum + " is " + factorial);
                    break;

                case 3:
                    System.out.print("Enter the number: ");
                    int primeNum = scanner.nextInt();
                    boolean isPrime = true;
                    if (primeNum <= 1) {
                        isPrime = false;
                    } else {
                        int i = 2;
                        while (i <= primeNum / 2) {
                            if (primeNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                            i++;
                        }
                    }
                    if (isPrime) {
                        System.out.println(primeNum + " is a prime number.");
                    } else {
                        System.out.println(primeNum + " is not a prime number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the number of terms: ");
                    int n = scanner.nextInt();
                    int a = 0, b = 1;
                    System.out.print("Fibonacci Series: ");
                    for (int i = 1; i <= n; i++) {
                        System.out.print(a + " ");
                        int next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    return;

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 5.");
            }

            System.out.print("Back to Menu? (Y/N): ");
            continueChoice = scanner.next().charAt(0);
        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Program terminated.");
        scanner.close();
    }
}
