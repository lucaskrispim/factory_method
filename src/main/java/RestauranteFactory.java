public class RestauranteFactory {
    public static ICozinha obterCozinha(String cozinha) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName(cozinha);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Cozinha inexistente");
        }
        if (!(objeto instanceof ICozinha)) {
            throw new IllegalArgumentException("Cozinha inválida");
        }
        return (ICozinha) objeto;
    }
}
