import java.util.Scanner;

public class traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Right angled triangle calculator : ");
        System.out.println("Enter the base length : ");
        double base = sc.nextDouble();
        System.out.println("Enter the height : ");
        double height = sc.nextDouble();
        double hyp = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("The hypotenuse is : "+hyp);
    }
}
