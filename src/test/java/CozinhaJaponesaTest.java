import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CozinhaJaponesaTest {

    @Test
    void deveExecutarComidaJaponesa() {
        ICozinha cozinha = RestauranteFactory.obterCozinha("CozinhaJaponesa");
        assertEquals("Comida japonesa preparada", cozinha.preparar());
    }
}