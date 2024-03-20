class CozinhaItaliana extends Restaurante {
    @Override
    public Refeicao prepararRefeicao() {
        return new Pizza();
    }
}
