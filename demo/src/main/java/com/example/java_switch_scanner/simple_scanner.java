package com.example.java_switch_scanner;

import java.util.Scanner;

public class simple_scanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your details");
        String name = sc.nextLine();
        System.out.println("welcome mr :"+name);
        System.out.println("--------");
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("your age :"+age);



    }
}
