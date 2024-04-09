import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CozinhaMexicanaTest {

    @Test
    void deveExecutarComidaMexicana() {
        ICozinha cozinha = RestauranteFactory.obterCozinha("CozinhaMexicana");
        assertEquals("Comida mexicana preparada", cozinha.preparar());
    }
}