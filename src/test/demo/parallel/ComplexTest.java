package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    void testPlus() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 2);

        Complex result = z1.plus(z2);

        assertEquals(4, result.getRe(), 1e-10, "Real part of addition");
        assertEquals(6, result.getIm(), 1e-10, "Imaginary part of addition");
    }

    @Test
    void testMinus() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 2);

        Complex result = z1.minus(z2);

        assertEquals(2, result.getRe(), 1e-10, "Real part of subtraction");
        assertEquals(2, result.getIm(), 1e-10, "Imaginary part of subtraction");
    }

    @Test
    void testTimes() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 2);

        Complex result = z1.times(z2);

        assertEquals(-5, result.getRe(), 1e-10, "Real part of multiplication");
        assertEquals(10, result.getIm(), 1e-10, "Imaginary part of multiplication");
    }

    @Test
    void testDivides() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 2);

        Complex result = z1.divides(z2);

        assertEquals(2.2, result.getRe(), 1e-10, "Real part of division");
        assertEquals(-0.4, result.getIm(), 1e-10, "Imaginary part of division");
    }
}