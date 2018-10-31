/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.ec206.testedecobertura;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Usuário
 */
public class CalculadoraTest {
    
    private Calculadora calculadora;

    public CalculadoraTest() {
    }

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }
    
    /**
     * Test of soma method, of class Calculadora.
     */
    @Test
    public void testSoma() {
        assertEquals(calculadora.soma(3, 2), 5);
    }

    /**
     * Test of subtracao method, of class Calculadora.
     */
    @Test
    public void testSubtracao() {
        assertEquals(calculadora.subtracao(3, 2), 1);
    }

    /**
     * Test of multiplicacao method, of class Calculadora.
     */
    @Test
    public void testMultiplicacao() {
        assertEquals(calculadora.multiplicacao(3, 2), 6);
    }

    /**
     * Test of divisao method, of class Calculadora.
     */
    @Test
    public void testDivisao() {
        assertEquals(calculadora.divisao(3, 2), 1.5d, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        assertEquals(calculadora.divisao(3, 0), 0, 0);
    }

}
