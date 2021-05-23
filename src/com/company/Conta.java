package com.company;

import java.math.BigDecimal;

public interface Conta {

   void abrirConta(int numeroConta, Clientes proprietarioConta, TipoContaEnum tipoConta) throws ClientePJException;

   void sacar(BigDecimal valor) ;

   void depositar(BigDecimal valor);

   void transferir(BigDecimal valor, Conta contaDestino);

   BigDecimal consultarSaldo();

   void listarDadosCompletos();

}
