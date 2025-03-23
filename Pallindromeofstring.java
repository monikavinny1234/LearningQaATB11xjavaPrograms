package ex_01_java_basic;

import java.sql.SQLOutput;
import java.util.Scanner;

/*✅ Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)*/
public class Pallindromeofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
            {
                continue;
            }
            System.out.println("not pallindrome");
            flag=1;
            break;

        }
        if(flag==0)
        System.out.println("Pallindrome");








    }
}
