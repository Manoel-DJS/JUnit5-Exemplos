import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTeste {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,5,2,3,10};
        int[] terceiroLancamento = {10,20,30,40,50};
        // Comparando Arrays
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
        Assertions.assertArrayEquals(primeiroLancamento, terceiroLancamento);
    }

    @Test
    void validarSeObjetoNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;
        int valorint = 5;

        Assertions.assertEquals(valor, outroValor);
        Assertions.assertEquals(valorint, outroValor);
    }
}
