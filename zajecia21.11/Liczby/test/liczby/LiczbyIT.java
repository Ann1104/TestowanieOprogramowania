package liczby;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LiczbyIT {

    public LiczbyIT() {
       
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
        Liczby instance = new Liczby(3,4);
        int expResult = 3;
        int result = instance.getX();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testSetX() {
        System.out.println("setX");
        int expResult = 4;
        Liczby lb = new Liczby(0,5);
        lb.setX(4);
        assertEquals(expResult, lb.getX());
        
    }

    @Test
    public void testGetY() {
        System.out.println("getY");
        Liczby instance = new Liczby(4,5);
        int expResult = 5;
        int result = instance.getY();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testSetY() {
        System.out.println("setY");
        int expResult = 5;
        Liczby lb = new Liczby(4,0);
        lb.setY(5);
        assertEquals(expResult, lb.getY());
        
        
    }

    @Test
    public void testKtoraWiekszaY() {
        System.out.println("ktoraWiekszaY");
        Liczby lb = new Liczby(1, 9);
        int expResult = lb.getY();
        int result = lb.ktoraWieksza();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testKtoraWiekszaX() {
        System.out.println("ktoraWiekszaX");
        Liczby lb = new Liczby(10, 1);
        int expResult = lb.getX();
        int result = lb.ktoraWieksza();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testKtoraWiekszaXY() {
        System.out.println("ktoraWiekszaXY");
        Liczby lb = new Liczby(10, 10);
        int expResult = lb.getX();
        int result = lb.ktoraWieksza();
        assertEquals(expResult, result);

        
    }

    @Test
    public void testKtoraWiekszaNULL() {
        System.out.println("ktoraWiekszaXY");
        
        
    }
}
