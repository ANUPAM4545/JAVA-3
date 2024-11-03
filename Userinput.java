//Q.HOW TO TAKE INPUT IN JAVA?
//WE CAN TAKE INPUT IN JAVA USING SCANNER CLASS.

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME" );
        String name=sc.nextLine();
        // here name is a variable..
        System.out.println("welcome "+ name);
    }
}

