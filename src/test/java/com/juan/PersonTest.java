package com.juan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    //要＠Test再寫測試
    @Test
    public void bmiTest(){
        Person person = new Person(66.5f, 1.7f);
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi()); //比較兩個值是否相同
    }
}
