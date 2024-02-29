package br.com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void soma() {
        Calculadora calculadora = new Calculadora();

        double mediaRecebida = calculadora.Soma(10, 20);
        assertEquals(30, mediaRecebida);
    }

    @Test
    void subtracao() {
        Calculadora calculadora = new Calculadora();

        double mediaRecebida = calculadora.Subtracao( 20, 10);
        assertEquals(10, mediaRecebida);
    }

    @Test
    void multiplicacao() {
        Calculadora calculadora = new Calculadora();

        double mediaRecebida = calculadora.Multiplicacao(20,1);
        assertEquals(20, mediaRecebida);
    }

    @Test
    void divisao() {
        Calculadora calculadora = new Calculadora();

        double mediaRecebida = calculadora.Divisao(20,5);
        assertEquals(4, mediaRecebida);
    }
}