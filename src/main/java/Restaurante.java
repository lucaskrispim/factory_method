abstract class Restaurante {
    // Factory Method
    public abstract Refeicao prepararRefeicao();

    public void servirRefeicao() {
        Refeicao refeicao = prepararRefeicao();
        refeicao.preparar();
    }
}
