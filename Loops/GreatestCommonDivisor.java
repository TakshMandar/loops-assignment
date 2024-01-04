import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT FIRST NUMBER");
        int x = sc.nextInt();
        System.out.println("INPUT SECOND NUMBER");
        int y = sc.nextInt();

        int gd_c = 0;


        for (int i = 1;i<=x*y;i++) {
            if (x%i==0 && y%i==0) {
                System.err.println(i);
                gd_c=i;
            }
            
        }

        System.out.println("THE GDC IS: "+ gd_c);


    }
}
