package com.company;

import java.math.BigDecimal;

public class ContaBancaria implements Conta {

    protected int numeroConta;
    protected BigDecimal saldo;
    protected Clientes dono;
    protected TipoContaEnum tipoConta;

    protected ContaBancaria() {

        this.saldo = new BigDecimal(0);
        this.tipoConta = TipoContaEnum.EMPROCESSAMENTO;

    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = new BigDecimal(String.valueOf(saldo));
    }

    public Clientes getDono() {
        return dono;
    }

    public void setDono(Clientes dono) {
        this.dono = dono;
    }

   public TipoContaEnum getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoContaEnum tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void abrirConta(int numeroConta, Clientes proprietarioConta, TipoContaEnum tipoConta) throws ClientePJException {

        this.numeroConta = numeroConta;
        this.dono = proprietarioConta;
        this.tipoConta = tipoConta;

    }

    public void sacar(BigDecimal valor) {
        if (getSaldo().compareTo(valor) > 0 ) {
            this.saldo = getSaldo().subtract(valor);
        } else {
            System.out.println("Saldo insuficiente para a operação!");

        }

    }

    public void depositar(BigDecimal valor) {

            this.saldo = getSaldo().add(valor);


    }

    public void transferir(BigDecimal valor, Conta contaDestino) {

            this.saldo = getSaldo().subtract(valor);
            contaDestino.depositar(valor);


    }

    public BigDecimal consultarSaldo() {
        if (this.getTipoConta() == TipoContaEnum.INVESTIMENTO ) {
            return this.saldo.add(this.saldo.multiply(BigDecimal.valueOf(0.02)));
        }
            return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", proprietarioConta='" + dono + '\'' +
                ", tipoConta=" + tipoConta +
                '}';
    }

    public void listarDadosCompletos() {
        System.out.println(
                        "Conta {" +
                        "numeroConta=" + numeroConta +
                        ", saldo=" + saldo +
                        ", dono=" + dono +
                        ", tipoConta=" + tipoConta +
                        '}'
                        +
                        "\n" +
                        "============================================================" +
                        "\n");
    }


}
