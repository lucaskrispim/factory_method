import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestauranteTest {

    @Test
    public void testCozinhaItalianaPreparaPizza() {
        Restaurante cozinhaItaliana = new CozinhaItaliana();
        Refeicao refeicao = cozinhaItaliana.prepararRefeicao();
        assertTrue(refeicao instanceof Pizza);
    }

    @Test
    public void testCozinhaMexicanaPreparaTaco() {
        Restaurante cozinhaMexicana = new CozinhaMexicana();
        Refeicao refeicao = cozinhaMexicana.prepararRefeicao();
        assertTrue(refeicao instanceof Taco);
    }

    @Test
    public void testCozinhaJaponesaPreparaSushi() {
        Restaurante cozinhaJaponesa = new CozinhaJaponesa();
        Refeicao refeicao = cozinhaJaponesa.prepararRefeicao();
        assertTrue(refeicao instanceof Sushi);
    }
}
