package com.bridgelabz;
import java.util.Scanner;
import java.lang.Math;
public class PowerOf2 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value of N");


            int n= sc.nextInt();
            for(int i =1; i<=n;i++){
                System.out.println("table of power of 2 is " + (int)Math.pow(2, i));


            }

        }


    }

