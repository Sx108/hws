import java.util.Scanner;

public class largest_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c = sc.nextInt();
        int max = Math.max(a,(Math.max(b,c)));
        System.out.println("The largest number is "+max);
    }
}
