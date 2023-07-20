import java.util.Scanner;

public class CheckPalindromeString {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (isPalindrome(str, 0)==1)
        { System.out.println("Yes"); }
        else
        { System.out.println("No"); }
        sc.close();
    }
    public static int isPalindrome(String s, int i){
        if(i > s.length()/2)
        {
            return 1 ;
        }
        return (s.charAt(i) == s.charAt(s.length()-i-1) ? 1:0 ) & isPalindrome(s, i+1) ;

    }
}