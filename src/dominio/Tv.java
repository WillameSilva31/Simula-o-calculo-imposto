package dominio;

public class Tv extends Product{
    private static final double IMPOSTO_TV = 0.10;

    public Tv(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_TV;
    }
}
