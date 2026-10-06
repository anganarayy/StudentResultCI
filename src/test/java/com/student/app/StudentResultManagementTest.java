package com.student.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentResultManagementTest {

    StudentResultManagement result = new StudentResultManagement();

    @Test
    void testCalculateAverage() {
        int[] marks = {80, 75, 90, 85, 70};

        double average = result.calculateAverage(marks);

        assertEquals(80.0, average);
    }

    @Test
    void testCalculateGrade() {
        double average = 85.0;

        String grade = result.calculateGrade(average);

        assertEquals("B", grade);
    }

    @Test
    void testIsPass() {
        int[] marks = {80, 75, 90, 85, 70};

        boolean passed = result.isPass(marks);

        assertTrue(passed);
    }

    @Test
    void testIsFail() {
        int[] marks = {80, 35, 90, 85, 70};

        boolean passed = result.isPass(marks);

        assertFalse(passed);
    }
}