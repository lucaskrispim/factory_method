public class Main {
    public static void main(String[] args) {
        Restaurante cozinhaItaliana = new CozinhaItaliana();
        cozinhaItaliana.servirRefeicao();

        Restaurante cozinhaMexicana = new CozinhaMexicana();
        cozinhaMexicana.servirRefeicao();

        Restaurante cozinhaJaponesa = new CozinhaJaponesa();
        cozinhaJaponesa.servirRefeicao();
    }
}