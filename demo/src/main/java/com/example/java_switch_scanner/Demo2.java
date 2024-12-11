package com.example.java_switch_scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button=sc.nextInt();
        switch (button){
            case 1 :
                System.out.println("book");
                break;
            case 2 :
                System.out.println("booking the cafe");
                break;
            case 3:
                System.out.println("booking the shit");
                break;
            default:
                System.out.println("invalid number");
        }

    }
}
