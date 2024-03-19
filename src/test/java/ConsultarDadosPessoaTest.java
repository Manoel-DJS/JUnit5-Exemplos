import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTest {
    // Tentando entender o Uso

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Joao", LocalDateTime.of( 2001,4,3,14,0,0)));
    }
    @AfterEach
    void removeDadosParaTeste(){
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDateTime.of( 2001,4,3,14,0,0)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }

}
