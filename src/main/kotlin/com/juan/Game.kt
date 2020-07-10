package com.juan

import java.util.*

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)  //建立物件不需要使用 new 關鍵字
    var number = 0
    while (number != secret){
        print("Please enter a number:")
        number = scanner.nextInt()
        //number = readLine()!!.toInt()  // kotlin 的 讀取使用者輸入值
        if(number<secret){
            println("higher")
        } else if (number > secret) {
            println("lower")
        } else {
            println("Great, the number is $number")
        }
    }

}