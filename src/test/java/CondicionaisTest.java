import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.condition.JRE.JAVA_8;

public class CondicionaisTest {
    @Test
    @EnabledOnJre(JAVA_8)
    void validarUsuarioUnico() {
        // Assumptions.assumeFalse
        Assumptions.assumeFalse("Manoel Vinicius".equals(System.getenv("USER")));
        Assertions.assertEquals(10,(5+5));
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Manoel Vinicius")
    void validarAlgoSomenteNoUsuario() {
        // Assumptions.assumeFalse
        Assertions.assertEquals(10,(5+5));
    }
}
