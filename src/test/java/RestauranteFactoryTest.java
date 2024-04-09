import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            ICozinha cozinha = RestauranteFactory.obterCozinha("Brasileira");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cozinha inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            ICozinha cozinha = RestauranteFactory.obterCozinha("CozinhaAmericana");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cozinha inválida", e.getMessage());
        }
    }
}