import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number you want ot check as palindrome: ");
        int n = in.nextInt();
        int ans = palindrome(n);
        if(ans == n)
            System.out.print("It is a palindrome number");
        else
            System.out.print("It is not a palindrome number");

    }

    static int palindrome(int n){

        int ans = 0;

        while(n>0){
            int rem = n%10;

            ans = ans*10  + rem;
            n = n/10;
        }
        return ans;
    }
}
