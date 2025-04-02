import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal, rate, years,si;
        System.out.print("Enter principal amount: ");
        principal = input.nextDouble();
        System.out.print("Enter rate amount: ");
        rate = input.nextDouble();
        System.out.print("Enter time duration in years: ");
        years = input.nextDouble();
        si = principal*rate*years;
        System.out.println("Your Simple Interest is Rs. "+si);
    }
}
