package Lesson2;

import org.Lesson2.StudentScoreCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentScoreCalculatorTest {

    @Test
    public void studentScoreCalculatorRegular(){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(50, 50);
        assertEquals(2500, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorLiteracyHigh(){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(50, 150);
        assertEquals(-1, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorLiteracyLow(){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(50, -50);
        assertEquals(-1, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorMathLow(){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(-50, 50);
        assertEquals(-1, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorMathHigh(){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(150, 50);
        assertEquals(-1, sc.getSatScore());
    }
}
