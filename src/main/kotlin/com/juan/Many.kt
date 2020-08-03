package com.juan

fun main() {
    val list = listOf(5,1,2,7) //此類別只能讀取不能更改,只有get方法沒有add方法
    println(list)
    val scrces = listOf(68,88,77,99,50)
    for (score in scrces) {  //kotlin的foreach
        println(score)
    }

    var mutableList = mutableListOf(5,1,2,7) //此類別只能讀取也能更改,有get方法也有add方法
    mutableList.add(6)  //可以更改的集合會消耗較多效能
    mutableList.get(1)
    println(mutableList)
}