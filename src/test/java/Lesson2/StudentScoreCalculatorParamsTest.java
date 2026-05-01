package Lesson2;

import org.Lesson2.StudentScoreCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StudentScoreCalculatorParamsTest {

    private final int math;
    private final int literacy;
    private final int expected;

    public StudentScoreCalculatorParamsTest(int math, int literacy, int expected) {
        this.math = math;
        this.literacy = literacy;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {50, 50, 2500},
                {50, 150, -1},
                {50, -50, -1},
                {-50, 50, -1},
                {150, 50, -1}
        });
    }

    @Test
    public void testCalculateSATScore() {
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(this.math, this.literacy);
        assertEquals(this.expected, sc.getSatScore());
    }
}