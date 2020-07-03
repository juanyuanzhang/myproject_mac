package com.juan;

public class Person {
    String name;
    float weight;
    float height;

    public Person(float weight, float height){ //建構子 未寫入會直接使用java.lang.Object父類別的建構子
        //super();//父類別
        this.height = height;
        this.weight = weight;
    }
    public Person(String name, float weight, float height){
        this(weight, height); //使用上方的建構子
        this.name = name;

    }

    public  float bmi() {
        float bmi = weight / (height*height);
        return bmi;
    }
    public void hello(){
        System.out.println("Hello World");
    }
}
