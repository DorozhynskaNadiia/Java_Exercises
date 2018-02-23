package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise10 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise10";
        StartExercise(exerciseName);
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);
        FinishExercise(exerciseName);
    }
}
