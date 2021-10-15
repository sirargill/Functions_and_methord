import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter all the three integers in smaller to greater value: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int ans = triplet(a , b , c);
        if(ans == c*c)
            System.out.print("This can form triplet");
        else
            System.out.print("This cannot form triplet");
    }
    static int triplet(int a, int b , int c){
        return (a*a) + (b*b);
    }
}
