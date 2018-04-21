package com.company;

import com.company.BaseExercise;

public class Exercise21 extends BaseExercise{
    public static void Run() {
        String exerciseName = "Exercise21";
        StartExercise(exerciseName);
        System.out.println("Octal number is: " + Integer.toString(15, 8));
        FinishExercise(exerciseName);
    }
}
