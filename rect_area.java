import java.util.Scanner;

public class rect_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, width;
        System.out.print("Enter the height of the rectangle: ");
        height = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextDouble();
        System.out.println("The area of the rectangle is " + (height*width));
    }
}
