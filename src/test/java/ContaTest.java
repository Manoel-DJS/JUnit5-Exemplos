import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContaTest {
    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Adalberto", LocalDateTime.of(2020,1,1,14,0,3));
        Assertions.assertEquals(4, pessoa.getIdade());
    }
}
