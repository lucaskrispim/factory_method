import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CozinhaItalianaTest {

    @Test
    void deveExecutarComidaItalina() {
        ICozinha cozinha = RestauranteFactory.obterCozinha("CozinhaItaliana");
        assertEquals("Comida italiana preparada", cozinha.preparar());
    }
}