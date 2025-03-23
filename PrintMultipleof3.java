package ex_01_java_basic;

import javax.swing.*;
import java.util.Scanner;

/*Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."*/
public class PrintMultipleof3 {
    public static void main(String[] args) {
for(int i=1;i<=100;i++) {
    if(i%3==0&& i%5==0) {
        System.out.println("FizzBuzz");
    }
        else if(i%3==0) {
        System.out.println(i+"Fizz");
    }
    else if(i%5==0) {
        System.out.println(i+"Buzz");
    }
    else {
        System.out.println(i +"not divisible by either  3 ,5 or both");
        //System.out.println("done");

    }
}
    }

}


