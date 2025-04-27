package br.com.codewithjuliano.compras.modelos;

public class Compra implements Comparable<Compra>{

    private String descricaoCompra;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricaoCompra = descricao;
        this.valor = valor;
    }

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descrição = " + descricaoCompra +
                " valor = " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
