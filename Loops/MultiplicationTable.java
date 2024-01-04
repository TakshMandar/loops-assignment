import java.util.Scanner;

/**
 * MultiplicationTable
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of n: ");
        int n = sc.nextInt();
        for (int i = n; i <= 10*n ; i+=n) {
            System.out.println(i);
            
        }
    }
}