/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoangnlh.test;

import com.hoangnlh.util.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hoang Kyo
 */
public class mathTest {

    @Test
    public void testFactorialGivenRightAgrumentReturnGoodResult() {
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));

        
        
       
    }
     @Test(expected = IllegalArgumentException.class)
     public void testFactorialGivenRightAgrumentThrowsExeption() {
        MathUtility.getFactorial(-5);
         MathUtility.getFactorial(21);
         MathUtility.getFactorial(-1);
         MathUtility.getFactorial(40);
         
     }
        
     
}
