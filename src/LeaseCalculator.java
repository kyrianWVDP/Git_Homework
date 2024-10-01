package src;
    import java.util.Scanner;

    public class LeaseCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter total leased money: ");
            double totalLeasedMoney = scanner.nextDouble();

            System.out.print("Enter down payment: ");
            double downPayment = scanner.nextDouble();

            System.out.print("Enter lease term (months): ");
            int leaseTerm = scanner.nextInt();

            System.out.print("Enter interest rate: ");
            double interestRate = scanner.nextDouble();

            double monthlyPayment = ((totalLeasedMoney - downPayment) + ((totalLeasedMoney - downPayment) * (interestRate / 100))) / leaseTerm;

            System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        }
    }
