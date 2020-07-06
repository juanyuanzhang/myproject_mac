package com.juan.student

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`) // in在kotlin是關鍵字 需加上種音符號``
    print("Please enter student's name：")
    //var name = scanner.next()
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()

    val stu = Student_k(name, english ,math)
    stu.print()
    stu.nameCheck()
}

class Student_k(var name: String? ,var english: Int ,var math: Int) {
    fun print(){
        println(name+ "\t" + english + "\t" + math
                +"\t" +(english+math)/2)
    }

    fun nameCheck() {
        println(name?.length)
    }

}