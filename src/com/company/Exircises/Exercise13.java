package com.company.Exircises;

import com.company.BaseExercise;

public class Exercise13 extends BaseExercise {
    public static void Run() {
        String exerciseName = "Exercise13";
        StartExercise(exerciseName);
        double width = 5.6;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println(("Perimeter is " + " 2 * (" + width + " + " + height + ") = " + perimeter));
        FinishExercise(exerciseName);
    }
}
