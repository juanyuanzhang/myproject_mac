package com.juan;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        //String s =null;
        String s = "abcdef";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));//取第3個之後的值
        System.out.println(s.substring(3,5));//取第3個到第5-1個的值

        Person p = new Person("Yuan",66.5f,1.7f);//參照資料型態
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());

        int score = 88;
        System.out.println( score <69 || score >=60 );
        char c ='A';
        System.out.println(c<'a');
        /* 屬性 Field
        int age = 19 ;
        Integer age2 = 19; //基本資料型態的包裝型態
        char c ='我'; //只能用單引號
        Character c2 = 'A';
        byte b = 120 ;
        float weight = 66.5f; //未加 f 會被使用 double 型態
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Yuan"; //字串為 “”
        */





    }
}
