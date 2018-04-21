package com.company;

import com.company.BaseExercise;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Exercise19 extends BaseExercise{
    public static void Run() {
        String exerciseName = "Exercise19";
        StartExercise(exerciseName);
        System.out.println("Binary number is: " + Integer.toString(5, 2));
        FinishExercise(exerciseName);
    }

}
