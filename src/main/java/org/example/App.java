package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is your age? ");
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        String result = (age >= 16)? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);
    }
}
