package br.com.codewithjuliano.compras.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limiteTotal;
    private double saldoDisponivel;
    private List<Compra> listaDeCompras = new ArrayList<>();

    public CartaoDeCredito(double limiteTotal) {
        this.limiteTotal = limiteTotal;
        this.saldoDisponivel = limiteTotal;
        this.listaDeCompras = new ArrayList<>();
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public boolean compraEhPossivel (double valor) {
        return valor <= saldoDisponivel;
    }

    public boolean registrarCompra (Compra compra) {
        if(this.saldoDisponivel > compra.getValor()){
            this.saldoDisponivel -= compra.getValor();
            listaDeCompras.add(compra);
            return true;
        }

        return false;
    }

    public double calcularTotalGasto() {
        double total = 0;
        for (Compra compra : listaDeCompras) {
            total += compra.getValor();
        }
        return total;
    }

    public double getSaldoRestante() {
        return saldoDisponivel;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

}
