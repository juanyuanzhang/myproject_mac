package com.juan;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        Person p = new Person("Yuan",66.5f,1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
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
