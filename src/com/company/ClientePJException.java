package com.company;

public class ClientePJException extends Exception {

        private static final String messageDefault = "Ocorreu um fluxo de exceção no ClientePJ.";

        public ClientePJException(Exception cause) {
            super(messageDefault, cause);
        }

        public ClientePJException(String message) {
            super(message);
        }
    }



