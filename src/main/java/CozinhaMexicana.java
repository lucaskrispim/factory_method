class CozinhaMexicana extends Restaurante {
    @Override
    public Refeicao prepararRefeicao() {
        return new Taco();
    }
}
