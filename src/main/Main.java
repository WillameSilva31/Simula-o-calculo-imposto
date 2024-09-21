package main;

import dominio.Computador;
import dominio.PastaTermica;
import dominio.RepositorioBancoDeDados;
import dominio.Tv;
import repositorio.Repositorio;
import services.CalculadoraImposto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        Computador pc = new Computador("HXIV120", 12000);
        Tv tv = new Tv("77nano75RSA", 5300);
        PastaTermica pastaTermica = new PastaTermica("Cooler master regular", 40, "20/12/2027");
        CalculadoraImposto.calcularImposto(pc);
        CalculadoraImposto.calcularImposto(tv);
        CalculadoraImposto.calcularImposto(pastaTermica);
        repositorio.salvar();
    }
}