package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise5 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise5";
        StartExercise(exerciseName);
        int a = 25;
        int b = 5;
        System.out.println(a + " X " + b + " = " + (a*b));
        FinishExercise(exerciseName);
    }

}
