package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String uifirst = sc.nextLine();
        int first = Integer.valueOf(uifirst);
        System.out.println("Enter the second number: ");
        String uisecond = sc.nextLine();
        int second = Integer.valueOf(uisecond);
        System.out.println("Enter the third number: ");
        String uithird = sc.nextLine();
        int third = Integer.valueOf(uithird);
        int max = 0;

        if(first > max)
            max = first;
        if(second > max)
            max = second;
        if(third > max)
            max = third;


        System.out.println("The largest number is " + max);






    }
}