package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise15 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise15";
        StartExercise(exerciseName);
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
        FinishExercise(exerciseName);
    }
}
