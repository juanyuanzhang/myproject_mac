package com.juan

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter = LocalDateTime.of(2020,8,1,8,0,0)
    val level = LocalDateTime.of(2020,8,1,10,6,0)
    var car = Car("AAAA-0001", enter)
    car.leave = level //呼叫set()方法
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()//計算停留時間
    println(hours)
    println(30*hours)
}

class Car(val id:String, val enter: LocalDateTime){
    var leave: LocalDateTime? = null
    set(value) {//  set()方法要寫在變數定義下面
        if(enter.isBefore(value)) // 判斷進場時間是否是在離場時間前
            field = value // field變數代表 上方 leave變數
    }
    fun duration() = Duration.between(enter, leave).toMinutes() //簡寫 duration()方法
    /*
    fun duration():Long {
        return Duration.between(enter,leave).toMinutes()
    }*/

}