package dominio;

public abstract class Product implements Taxavel{
    protected String nome;
    protected double valor;

    public Product(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
