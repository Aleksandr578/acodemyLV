package calculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator("Cassio");

    @Test
    public void addTest(){
        assertEquals("Sum of two numbers are not correct", 30.0, calculator.add(20, 10), 0);
    }

    @Test
    public void subtractTest(){
        assertEquals("Sum of two numbers are not correct", 12.6, calculator.subtract(20.0, 7.4), 0);
    }

    @Test
    public  void multiplyTest(){
        assertEquals("Sum of two numbers are not correct", 13.02, calculator.multiply(4.2, 3.1), 0);
    }

    @Test
    public void divideTest(){
        assertEquals("Sum of two numbers are not correct", 4.73, calculator.divide(10.4, 2.2), 0);
    }

}