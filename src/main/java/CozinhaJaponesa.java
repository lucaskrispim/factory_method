class CozinhaJaponesa extends Restaurante {
    @Override
    public Refeicao prepararRefeicao() {
        return new Sushi();
    }
}
