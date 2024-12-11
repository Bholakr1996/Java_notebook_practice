package com.example.java_switch_scanner;

import java.util.Scanner;

public class caclculatr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("-----------------");
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                sc.close();
                return;
        }

        System.out.println("The result is: " + result);
        sc.close();
    }
    }
