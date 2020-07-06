package com.juan.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        //userInput();
        Student stu = new Student("Yuan",77,99); //Student物件
        stu.print();
        System.out.println("High score: "+stu.hieght());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student'name:");
        String name = scanner.next();//打完字後按下enter後回傳前面的文字
        System.out.print("Please enter english'score: ");
        int english =scanner.nextInt();//取得整數
        System.out.print("Please enter math'score: ");
        int math =scanner.nextInt();

        Student stu = new Student(name,english,math); //Student物件
        stu.print();
        System.out.println("High score: "+stu.hieght());
    }
}
