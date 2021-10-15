import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        grade(n);
    }
    static void grade(int n){

        if(n<=100 && n>=91 )
        System.out.print("AA");

        if(n<=90 && n>=81 )
        System.out.print("AB");

        if(n<=80 && n>=71 )
        System.out.print("BB");

        if(n<=70 && n>=61 )
        System.out.print("BC");

        if(n<=60 && n>=51 )
        System.out.print("CD");

        if(n<=50 && n>=41 )
        System.out.print("DD");

        if(n<=40)
        System.out.print("Fail");

    }
}
