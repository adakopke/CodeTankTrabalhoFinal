package com.company;

import java.math.BigDecimal;

public class ContaPJ extends ContaBancaria {

    public ContaPJ() {

    }

@Override
    public void abrirConta(int numeroConta, Clientes proprietarioConta, TipoContaEnum tipoConta) throws ClientePJException {
            this.tipoConta = tipoConta;
            validarTipoConta(this.tipoConta);
            this.numeroConta = numeroConta;
            this.dono = proprietarioConta;

    }

    private void validarTipoConta(TipoContaEnum tipoConta) throws TipoDeContaNaoPermitidaParaTipoClienteException {
        if (this.tipoConta == TipoContaEnum.POUPANCA) {
        throw new TipoDeContaNaoPermitidaParaTipoClienteException();
        }
    }


    @Override
    public void sacar(BigDecimal valor) {
        super.sacar(valor.add(valor.multiply(BigDecimal.valueOf(0.05))));
    }

    @Override
    public void transferir(BigDecimal valor, Conta contaDestino) {
        super.transferir(valor, contaDestino);
        super.setSaldo(this.getSaldo().subtract(valor.multiply(BigDecimal.valueOf(0.05))));
    }



}
