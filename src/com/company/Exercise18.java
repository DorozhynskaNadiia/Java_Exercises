package com.company;

import com.company.BaseExercise;

public class Exercise18 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise18";
        StartExercise(exerciseName);
        System.out.println("product of two binary numbers: " + Integer.toString(10 * 11, 2));
        FinishExercise(exerciseName);
    }

}
