package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise7 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise7";
        StartExercise(exerciseName);
        int a = 8;
        for(int i = 1; i < 11; i++) {
            System.out.println(a + " X " + i + " = " + (a * i));
       }
        FinishExercise(exerciseName);
    }
}

