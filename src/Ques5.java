import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of two numbers whose multiple you want to print: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.print( "Ans is " + mul(a , b));
    }

    static int mul(int a , int b){
        return a*b;
    }
}
