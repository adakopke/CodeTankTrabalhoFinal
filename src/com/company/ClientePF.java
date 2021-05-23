package com.company;

public class ClientePF extends Clientes {

    private String cpf;

    public ClientePF(int idCliente, String nomeCliente) {
          super(idCliente, nomeCliente);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                 this.getNomeCliente() +
                '}';
    }


    public void listarDadosCompletos() {
        System.out.println(
                "{IDCLIENTE: " + this.getIdCliente() +
                " | " + "NOME: " + this.getNomeCliente() +
                " | " + "CPF: " + this.cpf +
                "}" +
                "\n" +
                "============================================================" +
                "\n")
                ;
    }


}
