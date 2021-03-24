/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnlh.util;

/**
 *
 * @author Hoang Kyo
 */
public class MathUtility {
    
    
    
    public static final double PI = 3.1415;
    public static long getFactorial(int n){
      //  for(int i = 0, i < n, i++){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invailid");
        if(n==0 || n==1)
            return 1;
        
        long result = 1;
        for (int i = 2 ; i <= n ; i++)
            result = result * i;
        return result;
        
    }
    
}
