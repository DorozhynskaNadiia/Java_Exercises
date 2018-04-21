package com.company;

import com.company.BaseExercise;

public class Exercise17 extends BaseExercise{
    public static void Run () {
        String exerciseNumber = "Exercise17";
        StartExercise(exerciseNumber);
        System.out.println("Sum of two binary numbers : " + Integer.toString(10 + 11, 2));
        FinishExercise(exerciseNumber);

    }

}
