package com.juan.student

import java.util.*

fun main(args: Array<String>) {
    //userInput()
    val stu = Student_k("Yuan", 10, 99)
    stu.print()
    //stu.nameCheck()
    //println("Hight score: "+stu.highest())
    val test = 123
    println("Test is:$test")
    println("Hight score: ${stu.highest()}")
}

class Student_k(var name: String? ,var english: Int ,var math: Int) {
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFaiked()}\t${grading()}")
        /*print(name+ "\t" + english + "\t" + math
                +"\t" +getAverage()+ "\t" +
                passOrFaiked() )//if (getAverage() >= 60) "PASS" else "FAILED")
        println("\t"+grading())*/
    }
    fun grading() = when(getAverage()) {  //kotlin 沒有swith 被 when 取代
        in 90..100 -> 'A'  //90~100的值
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    /*fun grading() :Char {
        var grading :Char ='F'
        grading = when(getAverage()) {  //kotlin 沒有swith 被 when 取代
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
        return grading
    }*/

    fun getAverage() : Int {
        return (english+math)/2
    }
    fun passOrFaiked() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun highest() : Int { //Kotlin  沒有三元運算
        //var max = if (math > english) math else english  //kotlin 可以把if寫在變數等號右邊
        var max = if (math > english) {
            println( "math" )
            math
        } else {
            println("english")
            english
        }
        /*
        if (math >english) {
            max = math
        } else {
            max = english
        }
        */
        return max
    }

    fun nameCheck() {
        println(name?.length)
    }

}

private fun userInput() {
    val scanner = Scanner(System.`in`) // in在kotlin是關鍵字 需加上種音符號``
    print("Please enter student's name：")
    //var name = scanner.next()
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()

    val stu = Student_k(name, english, math)
    stu.print()
    stu.nameCheck()
}

