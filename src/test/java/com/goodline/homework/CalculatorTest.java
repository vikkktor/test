import com.goodline.homework.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    private void sumTest() {
        assertEquals(10,Calculator.Addition(10,15));
        assertEquals(25.5, Calculator.Addition(10.2, 15.3));
        assertEquals(-5, Calculator.Addition(10, -15));
        assertEquals(-25, Calculator.Addition(-10, -15));
    }
private void multiplicationTest(){
    assertEquals(10, Calculator.Multiplication(2,5));
    assertEquals(10, Calculator.Multiplication(-2,-5));
    assertEquals(-10, Calculator.Multiplication(2,-5));
    assertEquals(3.3, Calculator.Multiplication(2.2,1.5));
    assertEquals(10, Calculator.Multiplication(-2,-5));
    assertEquals(-10, Calculator.Multiplication(2,-5));
    }
    private void subtractionTest(){
        assertEquals(10,Calculator.Subtraction(20,10));
        assertEquals(30,Calculator.Subtraction(20,-10));
        assertEquals(-10,Calculator.Subtraction(-20,-10));
        assertEquals(10.1,Calculator.Subtraction(20.4,10.3));
        assertEquals(30.5,Calculator.Subtraction(20.3,-10.2));
        assertEquals(-10.1,Calculator.Subtraction(-20.4,-10.3));
    }
    private void divisionTest(){
        assertEquals(2,Calculator.Division(20,10));
        assertEquals(-2,Calculator.Division(-20,10));
        assertEquals(2,Calculator.Division(-20,-10));
        assertEquals(0,Calculator.Division(0,10));
        assertEquals(0,Calculator.Division(10,0));
        assertEquals(2000,Calculator.Division(2,0.001));


    }
    private void sqrtTest(){
        assertEquals(11,Calculator.Sqrt(121);
        assertEquals(0,Calculator.Sqrt(-4);

    }
    private void percentTest(){
        assertEquals(60,Calculator.Percent(200,30);
        assertEquals(63,Calculator.Percent(200,31.5);
        assertEquals(0,Calculator.Percent(200,0);

    }
}
