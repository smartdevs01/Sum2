/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sum2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Sum2 {

    public static void main(String[] args) {
        double firstNumber, secondNumber, sum;

        System.out.println("THIS SOFTWARE CALCULATE SUM OF TWO NUMBER");
        Scanner inputScanner = new Scanner(System.in);
        try {

            System.out.println("Enter Fisrt Number");
            firstNumber = inputScanner.nextDouble();

            System.out.println("ENTER SECOND NUMBER");
            secondNumber = inputScanner.nextDouble();

            sum = firstNumber + secondNumber;
            System.out.println("Anwser is: " + sum);
        } catch (Exception e) {
            System.out.println("INVALID INPUT, ENTER NUMBERS ONLY.");
        }

    }
}
