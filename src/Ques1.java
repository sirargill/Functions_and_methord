import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the third number: ");
        int c = in.nextInt();

        //maximum

        int ansMax = maximum(a , b, c);
        System.out.println("The maximum of the three is " + ansMax);

        //minimum

        int ansMin = minimum(a , b , c);
        System.out.println("the minimum of the three is " + ansMin);

    }

    static int maximum(int a , int b , int c){
        int max = a;

        if (b > max )
            max = b;
        if (c > max )
            max = c;

        return max;
    }
    static int minimum(int a , int b , int c){
        int min = a;

        if (b < min )
            min = b;
        if (c < min )
            min = c;

        return min;
    }

}
