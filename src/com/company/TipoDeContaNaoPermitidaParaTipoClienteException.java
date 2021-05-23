package com.company;

public class TipoDeContaNaoPermitidaParaTipoClienteException extends ClientePJException {

    public TipoDeContaNaoPermitidaParaTipoClienteException() {
        super("Não é permitido abrir conta poupança para PJ");
    }

}
