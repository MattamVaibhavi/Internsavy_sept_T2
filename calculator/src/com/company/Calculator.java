package com.company;


import java.util.Scanner;
public class Calculator implements Operation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c = 0;
        //we intialize only c
        int operation;
        System.out.println("Enter A:");
        a = getInput(sc);
        System.out.println("Enter B:");
        b= getInput(sc);
        System.out.println("1) A+B \t 2)A-B \n 3)A*B\t 4)A/B");
        operation = (int)getInput(sc);

        sc.close();
        switch (operation) {
            case 1:
                c = Operation.plus(a, b);
            case 2 :
                c = Operation.minus(a, b);
            case 3 :
                c = Operation.multiply(a, b);
            case 4 :
                c = Operation.divide(a, b);
        }
        System.out.println("Result:"+ c);
    }
    static double getInput(Scanner sc){

        return sc.nextDouble();
    }
}
