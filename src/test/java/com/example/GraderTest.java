package com.example;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class GraderTest {
    static Grader g;

    @BeforeClass
    //run once before all test cases start running
    public static void setup(){
        g = new Grader();
    }
    
    @Test
    public void testGetGradeF() {
        int mark = 25;
        String actual=g.getGrade(mark);
        assertEquals(actual,"F");
    }

    @Test
    public void testGetGradeD() {
        int mark = 35;
        String actual=g.getGrade(mark);
        assertEquals(actual,"D");        
    }

    @Test
    public void testGetGradeC() {
        int mark = 45;
        String actual=g.getGrade(mark);
        assertEquals(actual,"C");        
    }

    @Test
    public void testGetGradeB() {
        int mark = 65;
        String actual=g.getGrade(mark);
        assertEquals(actual,"B");        
    }

    @Test
    public void testGetGradeA() {
        int mark = 85;
        String actual=g.getGrade(mark);
        assertEquals(actual,"A");        
    }
}
