package Produtos;

import Interface.Inotificacao;

public class NotificacaoEmail implements Inotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}
