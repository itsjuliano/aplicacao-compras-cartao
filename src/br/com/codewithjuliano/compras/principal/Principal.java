package br.com.codewithjuliano.compras.principal;

import br.com.codewithjuliano.compras.modelos.CartaoDeCredito;
import br.com.codewithjuliano.compras.modelos.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do seu cartão de crédito:");
        double limite = scanner.nextDouble();

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        String continuar = "s";

        while (!continuar.equalsIgnoreCase("n")) {
            System.out.println("Digite a descrição do produto:");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra:");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);

            if (cartao.compraEhPossivel(valor)) {
                cartao.registrarCompra(compra);
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente! Não é possível realizar essa compra.");
            }

            System.out.println("Deseja continuar comprando? (s/n)");
            continuar = scanner.next();

        }

        System.out.println("\nCompras realizadas:");
        Collections.sort(cartao.getListaDeCompras());
        for (Compra compra : cartao.getListaDeCompras()) {
            System.out.println(compra.getDescricaoCompra() + " - R$ " + compra.getValor());
        }
        System.out.println("Total gasto: R$ " + cartao.calcularTotalGasto());
        System.out.println("Saldo restante: R$ " + cartao.getSaldoRestante());

    }
}
