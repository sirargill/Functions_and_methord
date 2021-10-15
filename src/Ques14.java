import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number till you want to take out the sum of natural numbers: ");
        int num = in.nextInt();
        int ans = first(num);
        System.out.print("The sum of " + num + " natural number is " + ans);

    }
    static int first(int n){
        return (n*(n+1))/2;
    }
}
