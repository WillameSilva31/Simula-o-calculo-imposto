package dominio;

public class Computador extends Product{
    public static final double IMPOSTO_PERCENTUAL = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_PERCENTUAL;
    }
}
