import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverseString = "";

        int strlength = str.length();

        for (int i = (strlength-1); i >=0; i--) {
            reverseString+= str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverseString)) {
            System.out.println("PALINDROME");    
        }
        else{
            System.out.println("NOT PALINDROME");
        }

    }
}
