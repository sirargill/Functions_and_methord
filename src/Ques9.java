import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        if(num>=2)
        System.out.print( "The factorial of the number is: "+ factorial(num));
        if(num==1 || num==0)
            System.out.print("The factorial of the number is: " + 1);
    }
    static int factorial(int a){

        int mul = 1;

        if (a>=2)
        for (int i = 2; i <= a; i++) {

            mul = mul*i;

        }
        return mul;

    }

}
