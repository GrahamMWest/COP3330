import java.util.Scanner;

public class SavingsAccount {

    private static double annualInterestRate = 0.04;

    public static void calculateMonthlyInterest() {
        personSavings personOne = new personSavings();
        personSavings personTwo = new personSavings();
        double balanceOneMonthly = 0, balanceTwoMonthly = 0, interestOne = 0, interestTwo = 0;

        balanceOneMonthly = (personOne.saverOne() * (1 + annualInterestRate)) / 12;
        balanceTwoMonthly = (personOne.saverTwo() * (1 + annualInterestRate)) / 12;

        interestOne = balanceOneMonthly - (personOne.saverOne() / 12);
        interestTwo = balanceTwoMonthly - (personTwo.saverTwo() / 12);

        System.out.printf("Monthly interest for Savings Balance One: $%.2f", interestOne);
        System.out.println("");
        System.out.println("New Balance for year for Savings One: $" + (balanceOneMonthly * 12));
        System.out.println("");
        System.out.printf("Monthly interest for Savings Balance Two: $%.2f", interestTwo);
        System.out.println("");
        System.out.println("New Balance for year for Savings Two: $" + (balanceTwoMonthly * 12));

    }

    public static void modifyInterestRate() {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter new interest rate in decimal form: ");
        annualInterestRate = scnr.nextDouble();

        calculateMonthlyInterest();

    }

    public static void main (String[] args) {

        System.out.println("Enter q to quit");
        System.out.println("Bank Account One starts with $2000.");
        System.out.println("Bank Account Two starts with $3000.");

        System.out.println("");

        calculateMonthlyInterest();
        System.out.println("");
        modifyInterestRate();

    }
}
