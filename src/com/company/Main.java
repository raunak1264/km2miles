package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner miles = new Scanner(System.in);
        System.out.println("Enter the Miles: ");
        float a = miles.nextInt();
        float kms = a * 1.6f;
        System.out.println("kms= "+ kms);
    }
}
