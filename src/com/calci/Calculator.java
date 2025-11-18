package com.calci;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating objects of all operations
        Addition add = new Addition();
//        Subtraction sub = new Subtraction();
//        Multiplication mul = new Multiplication();
//        Division div = new Division();
        System.out.println("---------- Team Calculator ----------");
       while(true) {
       
        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("Choose operation (+  -  *  /):");
        char op = sc.next().charAt(0);

        double result = 0;

        switch(op) {
            case '+': result = add.add(a, b); break;
//            case '-': result = sub.subtract(a, b); break;
//            case '*': result = mul.multiply(a, b); break;
//            case '/': result = div.divide(a, b); break;
            default:
                System.out.println("Invalid operation!");
                System.exit(0);
        }

        System.out.println("Result = " + result);
        System.out.println("----------------------------------");
}
 
    }
}
