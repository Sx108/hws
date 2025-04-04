import java.util.Scanner;

public class sch_ms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Mathematics : ");
        int maths = sc.nextInt();
        System.out.println("Enter the marks in English : ");
        int eng = sc.nextInt();
        System.out.println("Enter the marks in Computer Science : ");
        int cs = sc.nextInt();
        System.out.println("Enter the marks in Physics : ");
        int ph = sc.nextInt();
        System.out.println("Enter the marks in Chemistry : ");
        int ch = sc.nextInt();
        double per = (double) (maths + eng + cs + ph + ch)/5;
        System.out.println("Percentage Scored : " + per);
        if (per >= 75)
            System.out.println("Division 1");
        else if (per >= 50)
            System.out.println("Division 2");
        else if (per >= 33)
            System.out.println("Division 3");
        }
    }