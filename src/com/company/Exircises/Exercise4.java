package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise4 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise4";
        StartExercise(exerciseName);
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        FinishExercise(exerciseName);
    }
}
