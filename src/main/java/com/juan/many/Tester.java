package com.juan.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(0);
        System.out.println(n1);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(68,88,77,99,50);
        for (int score : scores
             ) {
            System.out.println(score);
        }

        //arrayTest();
    }

    private static void arrayTest() {
        int[] numbers = new int[5] ; //產生一個陣列可以放五個值,一定要先設定數量
        numbers[0] = 3 ;//設定值
        numbers[4] = 10;
        //numbers[5] =1 ;//超過index值
        int[] scores = {68,88,77,99,50}; //直接宣告陣列並給與初始值
        System.out.println(scores);//印出陣列的位置
        for(int i =0 ; i<5 ; i++){
            System.out.println(scores[i]);
        }
        for(int n :scores){// java 的 for each 把陣列值一次一次塞給 n
            System.out.println(n);
        }
    }
}
