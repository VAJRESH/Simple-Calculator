package com.company;


import java.util.Scanner;

public class Main {

//main method for execution
    public static void main(String[] args) {
        while (true){
            System.out.println("Press Enter to Exit..");
            System.out.println();
            String number1 = getString("Enter First Number: ");
            if (number1.length() == 0) {
                System.out.println("Shutting Down.");
                break;
            }
            String number2 = getString("Enter Second Number: ");
            String operator = getString("Enter Operator(+, - , *, /): ");
            System.out.println("Answer is "+calculation(number1, number2, operator));
            System.out.println();
        }
    }

//    method for accepting input during runtime
    public static String getString(String prompt){
        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

//    calculates and returns value based on the input
    public static double calculation(String  num1, String num2, String operator){
        double firstNumber =  Double.parseDouble(num1);
        double secondNumber =  Double.parseDouble(num2);
        switch (operator){
            case "+":
                return firstNumber+secondNumber;
            case "*":
                return firstNumber*secondNumber;
            case "-":
                return firstNumber-secondNumber;
            case "/":
                return firstNumber/secondNumber;
            default:
                System.out.println("Something went wrong!!");
                return 0;
        }
    }
}
