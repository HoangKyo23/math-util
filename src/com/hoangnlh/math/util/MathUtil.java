/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnlh.math.util;

import com.hoangnlh.util.MathUtility;

/**
 *
 * @author Hoang Kyo
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("xin chao");
        System.out.println("alo alo github");
        int n=5;
        long expected =120;
        long actual = MathUtility.getFactorial(n) ;
        
        System.out.println("5! expected:  " + expected + "  actual =   "  +actual);
    }
    
}
