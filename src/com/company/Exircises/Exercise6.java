package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise6 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise6";
        StartExercise(exerciseName);
        int a = 125;
        int b = 24;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " X " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));
        FinishExercise(exerciseName);





    }
}
