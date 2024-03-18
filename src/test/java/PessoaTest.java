import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {
        @Test
    void deveCalcularIdadeCorretamente() {
            Pessoa veronica = new Pessoa("Verônica", LocalDateTime.of(2002, 5, 14, 15,0,0));
            //
            Assertions.assertEquals(21, veronica.getIdade());
        }

        @Test
    void deveRetornarMaiorIdade() {
            Pessoa veralucia = new Pessoa("Veralucia", LocalDateTime.of(2002, 5, 14, 15,0,0));
            Assertions.assertTrue(veralucia.ehMaiorIdade());
            Pessoa Joao = new Pessoa("João Paulo", LocalDateTime.of(2012,5,30,15,0,0));
            Assertions.assertFalse(Joao.ehMaiorIdade());
        }

}
