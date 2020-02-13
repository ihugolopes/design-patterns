package br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.model.Orcamento;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto.Desconto;

public class DescontoValorMaiorQuinhentosReais implements Desconto {

    private Desconto desconto;

    @Override
    public void proximoDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcular(Orcamento orcamento) {

        if (orcamento.getValorFinal() > 500) {
            return orcamento.getValorFinal() * 0.1;
        }

        return desconto.calcular(orcamento);
    }
}
