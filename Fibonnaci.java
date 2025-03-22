package ex_01_java_basic;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int fib=0;
        int fib1=1;
        int fib3=0;
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
int num=sc.nextInt();
        System.out.print(fib);
        System.out.print(","+fib1);
        for(int i=2;i<=num;i++) {
            fib3=fib+fib1;
            fib=fib1;
            fib1=fib3;
            System.out.print(","+fib3);
        }

    }
}
