package com.juan.kotlin

import com.juan.Human
import com.juan.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    //  測試kotlin類別方法
    @Test
    fun humanBmiTest() {
        val human = Human("Yuan" , 66.5f , 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),human.bmi())
    }
    // 測試JAVA類別方法
    @Test
    fun personBmiTest() {
        val person = Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi())
    }
}