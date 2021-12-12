/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.tdd_mdc_03_25_11;

/**
 *
 * @author maeh
 */
public class MathUtil {
    public static int mdc(int a, int b){
        a= Math.abs(a);
        b= Math.abs(b);
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        if(b > 0 && a % b ==0){
            return b;
        }
        
        if(b == 0){
           return a;
        }
        
        if(a % b != 0){
            return 1;
        }
       
        return -1;
    }
}
