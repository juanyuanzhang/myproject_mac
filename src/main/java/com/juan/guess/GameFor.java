package com.juan.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        /*for (int i=1 ; i<=3 ; i++ ) {  //for迴圈
            System.out.println(i);
        }*/
        /*int sum = 0 ;
        for (int i=1 ; i<=100 ; i++){ //累加
            sum = sum + i ;
        }
        System.out.println(sum);
        for (int j=5 ; j>=1 ; j--) { //累減
            System.out.println(j);
        }*/
        int secret = new Random().nextInt(10) +1 ; //1~10
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i=1 ; i<=4 ; i++){
            System.out.print("Please enter a number("+i+"/4) :");
            int number = scanner.nextInt();
            System.out.println("第"+i+"次："+ number);
            if(number > secret) {
                System.out.println("Lower");
            } else if (number < secret){
                System.out.println("Higher");
            } else {
                System.out.println("Great, the number is " + secret);
                break;//i=5;
            }
        }
        System.out.println("END");
    }
}
