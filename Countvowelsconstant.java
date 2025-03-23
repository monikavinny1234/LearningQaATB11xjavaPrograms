package ex_01_java_basic;

import javax.swing.*;
import java.util.Scanner;

public class Countvowelsconstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowel=0;
        int constant=0;
        System.out.println("Enter the Words");
        String word=sc.nextLine();
        for(int i=0;i<word.length();i++) {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                vowel++;
            }
            else
            {
                if(word.charAt(i)==' ')
                {
                    continue;
                }
                constant++;
            }

        }
        System.out.println(vowel);
        System.out.println(constant);
        //System.out.println("done");
        }

    }

