package services;

import dominio.PastaTermica;
import dominio.Product;

public class CalculadoraImposto {
    public static void calcularImposto(Product product){
        double imposto = product.calcularImposto();
        System.out.println(product.getNome());
        System.out.println(product.getValor()+ " reais");
        if( product instanceof PastaTermica) {
            String data = (((PastaTermica) product).getDataValidade());
            System.out.println("data de validade: "+data);
        }
        System.out.println("imposto: "+ imposto);
        System.out.println("valor total: "+ (product.getValor()+imposto));
    }
}
