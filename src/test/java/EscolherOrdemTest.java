import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolherOrdemTest {

    // MethodName respeita a ordem alfabetica
    // Random bem intuitivo
    // DisplayName escolhe um diplay name e ele segue o fluxo do displayName
    // MethodOrderer.DiplayName a exemplo
    @Order(4)
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
