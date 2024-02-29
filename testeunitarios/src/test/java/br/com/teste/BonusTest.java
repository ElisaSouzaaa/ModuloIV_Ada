package br.com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusTest {

    @Test
    public void deveReceber5PorcentoBonus() {
        //Arrange - Preparar o ambiente
        Bonus bonus = new Bonus();
        //Act - Agir, ou seja, colocar em prática
        double bonusRecebido = bonus.calcularBonus(21, 6, 1000);
        //Assertion - Validação do act
        assertEquals(bonusRecebido, 50);
    }

    @Test
    public void deveReceber10PorcentoBonus() {
        //Arrange - Preparar o ambiente
        Bonus bonus = new Bonus();
        //Act - Agir, ou seja, colocar em prática
        double bonusRecebido = bonus.calcularBonus(31, 12, 1000);
        //Assertion - Validação do act
        assertEquals(bonusRecebido, 100);
    }

    @Test
    public void naoRecebeBonus() {
        //Arrange - Preparar o ambiente
        Bonus bonus = new Bonus();
        //Act - Agir, ou seja, colocar em prática
        double bonusRecebido = bonus.calcularBonus(19, 5, 1000);
        //Assertion - Validação do act
        assertEquals(bonusRecebido, 0);
    }
}