package com.example;

public class Grader {
    String getGrade(float mark){
        if (mark<30)
            return "F";
        else if (mark <40)
            return "D";
        else if (mark<55)
            return "C";
        else if (mark<70)    
            return "B";
        else
            return "A";
    }

}
