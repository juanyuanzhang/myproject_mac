package com.juan

import java.util.*

fun main() {
    var secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..5) { // 第一次i=1 , 第二次i=2 , ....第五次i=5
        print("Please enter a number: ")
        var number = scanner.nextInt()
        println("第${i}次 : $number") //i為特殊變數所以必須用{}
        //if(number == -1) break  //輸入為 -1 離開迴圈
        if(number < secret){
            println("higher")
        } else if (number > secret) {
            println("lower")
        } else {
            println("Great , the number is: $secret")
            break
        }
    }
}