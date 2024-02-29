package br.com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaNotaTest {

    @Test
    void calcularMedia() {
        MediaNota mediaNota = new MediaNota();

        double notasRecebidas = mediaNota.calcularMedia(10,10,10);
        assertEquals(notasRecebidas, 10);
    }
}
