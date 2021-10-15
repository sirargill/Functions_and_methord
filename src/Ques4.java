import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input First Number: ");
        int a = in.nextInt();
        System.out.print("Input Second Number: ");
        int b = in.nextInt();
        System.out.print("The sum is: ");
        System.out.println(sum(a, b));
    }
    static int sum(int a , int b){

        return a+b;
    }

}
