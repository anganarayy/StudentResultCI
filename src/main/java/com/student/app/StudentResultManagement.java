package com.student.app;

public class StudentResultManagement {

    // Method 1: Calculate average marks
    public double calculateAverage(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return (double) total / marks.length;
    }

    // Method 2: Calculate grade
    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method 3: Check whether student passed
    public boolean isPass(int[] marks) {
        for (int mark : marks) {
            if (mark < 40) {
                return false;
            }
        }

        return true;
    }
}