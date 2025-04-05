import java.util.Scanner;

public class traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Right angled triangle calculator : ");
        System.out.println("1. Hypotenuse \n2.Base \n3.Height");
        System.out.println("Enter your choice no : ");
        int choice = sc.nextInt();
        double base, height, hyp;
        switch (choice) {
            case 1:
                System.out.println("Enter the base length : ");
                base = sc.nextInt();
                System.out.println("Enter the height : ");
                height = sc.nextInt();
                hyp = Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
                System.out.println("The hypotenuse is : "+hyp);
                break;
            case 2:
                System.out.println("Enter the height : ");
                height = sc.nextInt();
                System.out.println("Enter the hypotenuse : ");
                hyp = sc.nextInt();
                base =

        }
    }
}
