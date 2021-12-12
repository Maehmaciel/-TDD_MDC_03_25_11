/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.tdd_mdc_03_25_11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maeh
 */
public class MathUtilTest {
    
    @Test
    public void testMdcAParP1() {
       final int a = 6;
       final int b = 3;
       final int esperado = b;
       int obtido = MathUtil.mdc(a, b);
       
       assertEquals(esperado,obtido);
    }
    
    @Test
    public void testMdcAImparP1() {
       final int a = 9;
       final int b = 3;
       final int esperado = b;
       int obtido = MathUtil.mdc(a, b);
       
       assertEquals(esperado,obtido);
    }
    
    @Test
    public void testMdcParesP2() {
       final int a = 16;
       final int b = 8;
       final int divisor = 4; // um numero que divida a e b
       int obtido = MathUtil.mdc(a, b);
       
       //assertEquals(esperado,obtido % divisor);
       
       assertTrue(obtido % divisor == 0);
    }
    
    @Test
    public void testMdcAPositivoP3() {
       final int a = 15;
       final int b = 0;
       final int esperado = 15;
       int obtido = MathUtil.mdc(a, b);
       
        assertEquals(esperado,obtido);
    }
    
    @Test
    public void testMdcANegativoP3() {
       final int a = -30;
       final int b = 0;
       final int esperado = 30;
       int obtido = MathUtil.mdc(a, b);
       
        assertEquals(esperado,obtido);
    }
    
    @Test
    public void testMdcMParP4() {
       final int a = 9;
       final int b = 3;
       final int m = 2;
       final int esperado = MathUtil.mdc(a*m, b*m);
       int obtido = m*MathUtil.mdc(a, b);
       
        assertEquals(esperado,obtido);
    }
    
    @Test
    public void testMdcP5Resultado1() {
       final int a = 7;
       final int b = 3;
       final int c = 5;
       final int esperado = MathUtil.mdc(a*b,c);
       int obtido = MathUtil.mdc(b,c);
       assertEquals(esperado,obtido);
    }
    
    @Test
    public void testMdcP5Resultado2() {
       final int a = 7;
       final int b = 3;
       final int c = 5;
       final int esperado = 1;
       int obtido = MathUtil.mdc(b,c);
       assertEquals(esperado,obtido);
       
    }
    
    @Test
    public void testMdcP6() {
       final int a = 8;
       final int b = 2;
       final int esperado = MathUtil.mdc(a,b);
       int obtido = MathUtil.mdc(b,a);
       assertEquals(esperado,obtido);
       
    }
    
    
      @Test
    public void testMdcP7TudoNegativo() {
       final int a =-12;
       final int b = -6;
       final int esperado = 6;
       int obtido = MathUtil.mdc(b,a);
       assertEquals(esperado,obtido);
       
    }
    
       @Test
    public void testMdcGeralIndivisiveis() {
       final int a =30;
       final int b = 12;
       final int esperado = 6;
       int obtido = MathUtil.mdc(b,a);
       assertEquals(esperado,obtido);
       
    }
    
         @Test
        public void testMdcMultiplosValores() {
       final int a = 30;
       final int b = 12;
       final int c = 4;
       final int esperado = 2;
       int obtido = MathUtil.mdc(b,a,c);
       assertEquals(esperado,obtido);
       
    }
        
        
       @Test
        public void testMdcNenhumParametro() {
      
       assertThrows(IllegalArgumentException.class,()->MathUtil.mdc());
       
    }
        
    @Test
        public void testMdcNull() {
      
       assertThrows(NullPointerException.class,()->MathUtil.mdc(null));
       
    }
    
    
}
