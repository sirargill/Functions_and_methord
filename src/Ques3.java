import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the age of person: ");
        int num = in.nextInt();


        if (!allowed(num)){
            System.out.print("This person is not eligible to vote");
        }
        else {
            System.out.print("This person is eligible to vote");
        }
    }

    static boolean allowed(int num){
        return num >= 18;
    }

}
