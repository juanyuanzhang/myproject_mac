package com.juan

fun main() {
    //print("Hello Kotlin")
    val h = Human(weight=66.5f,height=1.7f) //物件有變數所以要帶入（）內
    println(h.bmi())
    /*var age = 19 // var age : Int = 19 宣告資料類型可以省略
    age = 20
    var weight = 66.5f
    var name : String //未初始給值必須先宣告資料類型
    name = "Yaun"*/
}

class Human(var name: String="", var weight: Float, var height: Float){ //括弧前應該加入constructor 確認為主建構子可省略
    //分為主建構子 classname(建構子的變數)
    //主建構子內想要執行動作=> init {} 括弧內的程式碼會在建構子執行完後執行
    init {
        println("test$weight") //=>println("test"+weight)
    }
    //次建構子 宣告變數不能使用 var 和 val
    //constructor(name: String, weight: Float, height: Float) :this(weight,height)

    fun bmi(): Float { //回傳值用分號帶上資料型態
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}
