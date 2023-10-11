import java.util.Scanner;

public class Salaryevaluation {
    public static void main(String[] args) {
        System.out.println("How many hours did you work?");

        // Step 2: Wait for the user to enter the number of hours worked and store it in memory
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        // Step 3: Display a message asking for the hourly pay rate
        System.out.println("How much do you get paid per hour?");

        // Step 4: Wait for the user to enter the hourly pay rate and store it in memory
        double hourlyPayRate = scanner.nextDouble();

        // Step 5: Multiply the number of hours by the hourly pay rate and store the result in memory
        double totalSalary = hoursWorked * hourlyPayRate;

        // Step 6: Display the amount of money earned
        System.out.println("You have earned $" + totalSalary);

        // Close the scanner
        scanner.close();
    }
}
