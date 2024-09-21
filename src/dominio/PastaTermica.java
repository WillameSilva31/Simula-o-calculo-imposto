package dominio;

public class PastaTermica extends Product{
    private final String dataValidade;

    public PastaTermica(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        return this.valor * 0.11;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
