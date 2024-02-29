package br.com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificaParTest {

    @Test
    void isPar() {
        VerificaPar verificaPar = new VerificaPar();

        int numeroRecebido = verificaPar.isPar(10);
        assertTrue(true);

    }
}