package com.juan;

import com.juan.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void hightestScoreTest(){
        Student student = new Student("Yuan" , 60 , 80);
        Assertions.assertEquals(80 ,student.highest());
    }

    @Test
    public void averageTest() {
        Student student = new Student("Yuan", 60, 80);
        Assertions.assertEquals((80+60)/2, student.getAverage());
    }
}
