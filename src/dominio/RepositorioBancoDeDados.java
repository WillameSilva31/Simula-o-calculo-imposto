package dominio;

import repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvo com sucesso!");
        return;
    }
}
