import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number you want to check as even or odd: ");
        int num = in.nextInt();

        if(what(num) == 1){
            System.out.print("Odd number");
        }
        else {
            System.out.print("Even number");
        }
    }

    static int what(int num){

        return num%2;
    }

}
