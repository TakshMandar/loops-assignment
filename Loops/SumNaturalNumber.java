import java.util.Scanner;
public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of n: ");
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        System.err.println(sum);

    }

    
}
