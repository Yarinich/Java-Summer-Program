package Task2.test;

import Task2.calculation.Arithmetics;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArithmetics {
    private static Arithmetics arithmetics;
    private final double delta = 0.0000000000001;

    @BeforeClass
    public static void init() {
        arithmetics = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double result = arithmetics.add(3, 7);
        Assert.assertEquals(10.0, result, delta);
    }

    @Test
    public void testDeduct() {
        double result = arithmetics.deduct(3, 7);
        Assert.assertEquals(-4.0, result, delta);
    }

    @Test
    public void testMult() {
        double result = arithmetics.mult(3, 7);
        Assert.assertEquals(21.0, result, delta);
    }

    @Test
    public void TestDiv() {
        double result = arithmetics.div(10, 5);
        Assert.assertEquals(2.0, result, delta);
    }


}
