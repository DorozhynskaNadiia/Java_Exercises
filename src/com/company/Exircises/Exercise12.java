package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise12 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise12";
        StartExercise(exerciseName);
        int a = 1;
        int b = 3;
        int c = 4;
        int average = (a + b + c) /3;
        System.out.println(average);
        FinishExercise(exerciseName);
    }
}
