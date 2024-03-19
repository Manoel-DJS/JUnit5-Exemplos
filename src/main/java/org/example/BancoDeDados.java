package org.example;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    public static void iniciarConexao(){
        LOGGER.info("Conexão Iniciada!");

    }

    public static void finalizarConexao(){
        LOGGER.info("Conexão Finalizada!");

    }

    public static void insereDados(Pessoa pessoa){
        // insere pessoa no DB
        LOGGER.info("Inseriu dados!");
    }
    public static void removeDados(Pessoa pessoa){
        // remove pessoa no DB
        LOGGER.info("Removeu dados!");
    }
}
