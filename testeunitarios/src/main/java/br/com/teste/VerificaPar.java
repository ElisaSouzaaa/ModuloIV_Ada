package br.com.teste;

public class VerificaPar {
    public int isPar(int num) {

        num = 10;
        Boolean numberIsPar;

        if(num % 2 == 0) {
           numberIsPar = true;
        } else {
            numberIsPar = false;
        }

        return num;
    }
}
