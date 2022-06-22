package CalculatorTests;

import at.technikum.enzo.CalculatorController;
import org.junit.Assert;
import org.junit.Test;


public class CalcTests {
    @Test
    public void testSum(){
        CalculatorController CC = new CalculatorController();
        int actual = CC.sum(1, 2);
        int expected = 2;
        Assert.assertEquals("should be 2", expected, actual);
    }
}