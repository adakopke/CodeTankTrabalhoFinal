package com.company;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) throws ClientePJException {

        System.out.println("Criando cliente 1");
        int idCliente = 1;
        String nomeCliente = "Anderson Kopke";
        ClientePF cliente1 = new ClientePF(idCliente, nomeCliente);
        cliente1.setCpf("08940188764");
        cliente1.listarDadosCompletos();

        System.out.println("Criação de conta corrente e associação ao cliente 1");
        Conta conta1 = new ContaPF();
        conta1.abrirConta(1, cliente1, TipoContaEnum.CORRENTE);
        conta1.listarDadosCompletos();

        System.out.println("Teste método depositar");
        conta1.depositar(BigDecimal.valueOf(100));
        conta1.listarDadosCompletos();

        System.out.println("Criando cliente 2");
        idCliente = 2;
        nomeCliente = "Kopkes LTDA";
        ClientePJ cliente2 = new ClientePJ(idCliente, nomeCliente);
        cliente2.setCnpj("21591052000150");
        cliente2.listarDadosCompletos();

        System.out.println("Criação de conta corrente e associação do cliente 2");
        Conta conta2 = new ContaPJ();
        conta2.abrirConta(2, cliente2, TipoContaEnum.CORRENTE);
        conta2.listarDadosCompletos();

        System.out.println("Depositando 100 na conta 2");
        conta2.depositar(BigDecimal.valueOf(100));
        conta2.listarDadosCompletos();

        System.out.println("Saque sem cobrança de taxa na conta 1 PF");
        conta1.sacar(BigDecimal.valueOf(50));
        conta1.listarDadosCompletos();

        System.out.println("Saque com cobrança de taxa na conta 2 PJ");
        conta2.sacar(BigDecimal.valueOf(50));
        conta2.listarDadosCompletos();

        System.out.println("Transf sem cobrança de taxa partindo de conta PF");
        conta1.transferir(BigDecimal.valueOf(10), conta2);
        conta1.listarDadosCompletos();
        conta2.listarDadosCompletos();

        System.out.println("Transf com cobrança de taxa partindo de conta PJ");
        conta2.transferir(BigDecimal.valueOf(10), conta1);
        conta2.listarDadosCompletos();
        conta1.listarDadosCompletos();

        System.out.println("Criação de conta investimento e associação ao cliente 2");
        Conta conta3 = new ContaPJ();
        conta3.abrirConta(3, cliente2, TipoContaEnum.INVESTIMENTO);
        conta3.listarDadosCompletos();

        System.out.println("Depositando 300 na conta 3");
        conta3.depositar(BigDecimal.valueOf(300));
        conta3.listarDadosCompletos();

        System.out.println("Testando o método consultarSaldo na conta investimento: " + conta3.consultarSaldo() + "\n");

        System.out.println("Tentantiva de saque acima do saldo da conta");
        conta2.sacar(BigDecimal.valueOf(100));
        conta2.listarDadosCompletos();

        System.out.println("Criação de conta poupança e associação ao cliente 1");
        Conta conta4 = new ContaPF();
        conta4.abrirConta(4, cliente1, TipoContaEnum.POUPANCA);
        conta4.listarDadosCompletos();

        System.out.println("Simular criação de poupanca para PJ para validar com exception");
        Conta conta5 = new ContaPJ();
        conta5.abrirConta(5, cliente2 , TipoContaEnum.POUPANCA);





    }
}
