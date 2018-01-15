package pl.lodz.uni.math.testNumbers;

import pl.lodz.uni.math.Numbers.Numbers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumbersJUnit {

    public NumbersJUnit() {
       
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
        
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
        System.gc();
    }

    @Before
    public void setUp() {
        System.out.println("Before");
        

    }

    @After
    public void tearDown() {
        System.out.println("After");
        System.gc();
    }

    
    @Test
    public void testGetX() {
        System.out.println("getX");
        Numbers instance = new Numbers(3,4);
        int expResult = 3;
        int result = instance.getX();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testSetX() {
        System.out.println("setX");
        int expResult = 4;
        Numbers lb = new Numbers(0,5);
        lb.setX(4);
        assertEquals(expResult, lb.getX());
        
    }

    @Test
    public void testGetY() {
        System.out.println("getY");
        Numbers instance = new Numbers(4,5);
        int expResult = 5;
        int result = instance.getY();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testSetY() {
        System.out.println("setY");
        int expResult = 5;
        Numbers lb = new Numbers(4,0);
        lb.setY(5);
        assertEquals(expResult, lb.getY());
        
        
    }

    @Test
    public void testwhichNumberIsBiggerY() {
        System.out.println("whichNumberIsBiggerY");
        Numbers lb = new Numbers(1, 9);
        int expResult = lb.getY();
        int result = lb.whichNumberIsBigger();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testwhichNumberIsBiggerX() {
        System.out.println("whichNumberIsBiggerX");
        Numbers lb = new Numbers(10, 1);
        int expResult = lb.getX();
        int result = lb.whichNumberIsBigger();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testwhichNumberIsBiggerXY() {
        System.out.println("whichNumberIsBiggerXY");
        Numbers lb = new Numbers(10, 10);
        int expResult = lb.getX();
        int result = lb.whichNumberIsBigger();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testwhichNumberIsBiggeraNULL() {
        System.out.println("ktoraWiekszaXY");
        
        
    }
}
