package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise9 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise9";
        StartExercise(exerciseName);
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(result);
        FinishExercise(exerciseName);
    }
}
