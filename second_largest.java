import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c = sc.nextInt();
        int sec_l;
        int max = Math.max(a,(Math.max(b,c)));
        if(max == a)
            sec_l = Math.max(b,c);
        else if(max == b)
            sec_l = Math.max(c,a);
        else
            sec_l = Math.max(a,c);
        System.out.println("The second largest number is : "+sec_l);
    }
}
