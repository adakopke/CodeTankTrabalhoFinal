package com.company;

public class ClientePJ extends Clientes  {

    private String cnpj;

    public ClientePJ(int idCliente, String nomeCliente) {
        super(idCliente, nomeCliente);
    }



    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
                        " | " + "CPF: " + this.cnpj +
                        "}" +
                        "\n" +
                        "============================================================" +
                        "\n")
        ;
    }




    public void abrirConta(int numeroConta, int proprietarioConta, TipoContaEnum tipoConta) {

    }
}
