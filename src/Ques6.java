import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float r = in.nextFloat();
        System.out.println("The Circumference of Circle is: " + circumference(r));
    }
    static float circumference(float r){
        float pi = (float)(22*1.0/7);

        return 2*pi*r;
    }
}
