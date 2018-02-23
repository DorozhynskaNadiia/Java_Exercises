package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise11 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise11";
        StartExercise(exerciseName);
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is = " + perimeter);

        double area = Math.PI * radius * radius;
        System.out.println("Area is = " + area);
        FinishExercise(exerciseName);
    }
}
