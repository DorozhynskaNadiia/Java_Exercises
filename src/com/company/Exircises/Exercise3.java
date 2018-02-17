package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise3 extends BaseExercise{
    public static void Run() {
        String exerciseName = "Exercise3";
        StartExercise(exerciseName);
        int a = 50;
        int b = 3;
        int result = a/b;
        System.out.println(result);

        FinishExercise(exerciseName);
    }

}
