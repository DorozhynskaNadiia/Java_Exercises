package com.company;

import com.company.BaseExercise;

public class Exercise20 extends BaseExercise{
    public static void Run() {
        String exerciseName = "Exercise20";
        StartExercise(exerciseName);
        System.out.println("Hexadecimal number is: " + Integer.toString(15, 16));
        FinishExercise(exerciseName);
    }
}
