package com.dio.inversaoDeControle;

public class EnviarEmails {
    public EnviarEmails(String tipo, String endereco, String senha) {
        // Envia o email
    }

    public static EnviarEmails obterDados() {
        return new EnviarEmails("smtp", "contato@email.com", "senha");
    }

    public void retornar(String mensagem) {
        System.out.println("Email enviado!");
    }
}
