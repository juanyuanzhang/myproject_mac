package com.juan.student;

public class Student {
    String id ;
    String name ;
    int english ;
    int math ;
    //以上為類別的屬性
    public Student(String name ,int english ,int math){
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
        //int max = (math > english) ? math : english ;//三元式運算
        //int max = 0;
//        if (math > english){
//            max = math;
//        } else {
//            max = english;
//        }
        return (math > english) ? math : english;
    }

    public void print(){
        int average = getAverage();
        System.out.println(name+"\t"+english+"\t"+math
                +"\t"+getAverage() + "\t" +
                ((getAverage() >= 60) ? "PASS":"FAILED"));
        char grading = 'F';
        switch (average/10) {
            case 10:
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
                break;
            default:
                grading='F';

        }
        System.out.println(grading);

        /*if (getAverage() >= 60 ) {
            System.out.println(" PASS");
        } else {
            System.out.println(" FAILED");
        }*/
    }

    public int getAverage() {
        return(english+math)/2;
    }
}
