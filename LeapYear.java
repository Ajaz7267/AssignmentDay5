package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int l;
        System.out.println("Enter Your Year: ");
        Scanner sc = new Scanner(System.in);
        l=sc.nextInt();
        if(l%100==0 && l%400==0 || l%100!=0 && l%4==0 ){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
