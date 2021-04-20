/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacob
 */
public class FinalExam1IT {
    
    public FinalExam1IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateAverage method, of class FinalExam1.
     */
    @Test
    public void testCalculateAverage() {
        System.out.println("calculateAverage");
        double num1 = 12.3;
        double num2 = 68.9;
        double num3 = 50;
        double expResult = 43.74;
        double result = FinalExam1.calculateAverage(num1, num2, num3);
        assertEquals(expResult, result, 0);
    }
    
}
