package com.company;

public abstract class BaseExercise {
    public abstract void Run();
    public void StartExercise(String exerciseName) {
        System.out.println(exerciseName + " starts");
    }
    public void FinishExercise (String exerciseName) {
        System.out.println(exerciseName + " ends");
    }
}
