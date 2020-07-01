package com.juan

fun main() {
    //print("Hello Kotlin")
    Human().hello()
    var age = 19 // var age : Int = 19 宣告資料類型可以省略
    age = 20
    var weight = 66.5f
    var name : String //未初始給值必須先宣告資料類型
    name = "Yaun"
}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}
