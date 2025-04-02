import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double r = input.nextDouble();
        //double area = Math.PI * r * r;
        double area = 3.14 * r * r;
        System.out.println("The area of the circle is " + area);
    }
}
